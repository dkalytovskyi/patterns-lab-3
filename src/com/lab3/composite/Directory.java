package com.lab3.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory extends FileSystemComponent{
	protected List<FileSystemComponent> components = new ArrayList<>();
	
	public Directory(String name) {
		super(name);
	}

    public Directory(String name, FileSystemComponent ...components) {
        super(name);
        add(components);
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void add(FileSystemComponent... components) {
        this.components.addAll(Arrays.asList(components));
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    public void remove(FileSystemComponent... components) {
        this.components.removeAll(Arrays.asList(components));
    }

    public void clear() {
        components.clear();
    }

    @Override
    public double getSize() {
        if (components.size() == 0) {
            return 0;
        }
        
        double size = 0;
        for (FileSystemComponent component : components) {
           size += component.getSize();
        }
        return size;
    }
    
}
