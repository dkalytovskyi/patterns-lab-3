package com.lab3.composite;

public abstract class FileSystemComponent implements FileSystem{
	protected String name;
	protected double size;
	
	public FileSystemComponent(String name) {
		this.name = name;
	}
	
	public FileSystemComponent(String name, double size) {
		this.name = name;
		this.size = size;
	}

	public double getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
