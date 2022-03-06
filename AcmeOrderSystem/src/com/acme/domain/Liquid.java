package com.acme.domain;

public class Liquid extends Good {
	
	private double radius;

	public Liquid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable,
			double weightPerUofMeasure, double radius) {
		super(name, modelNumber, height, unitOfMeasureType, flammable, weightPerUofMeasure);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return Math.PI * radius * radius * getHeight();
	}
	
	@Override
	public String toString() {
		return super.toString() + " (liquid) " + volume() + " " + getUnitOfMeasureType();
	}
	
}
