package com.lab3.composite;

public class File extends FileSystemComponent{
    public File(String name, double size) {
        super(name, size);
    }
    
    public void setSize(double size) {
		this.size = size;
	}
}
