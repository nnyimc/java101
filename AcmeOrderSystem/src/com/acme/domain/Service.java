package com.acme.domain;

public class Service implements Product {
	private String name;
	private int estimatedTaskDuration;
	private boolean timeAndMaterials;
	
	public Service(String name, int duration, boolean timeAndMaterials) {
		this.estimatedTaskDuration = duration;
		this.name = name;
		this.timeAndMaterials = timeAndMaterials;
	}
	
	@Override
	public String toString() {
		return name + " (a " + estimatedTaskDuration + " day service)";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
