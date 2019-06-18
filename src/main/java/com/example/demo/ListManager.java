package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
	
	private List<String> names;
	public String name;
	public ListManager() {
		this.names = new ArrayList<>();
	}
	
	public void addName(String name) {
		this.names.add(name);
	}
	
	public void removeName(String name) {
		this.names.remove(name);
	}
	public String getNames(){
		return "your name is:" + names;
	}

}
