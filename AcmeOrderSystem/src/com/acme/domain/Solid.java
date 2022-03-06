package com.acme.domain;

public class Solid extends Good {
	
	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Solid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable,
			double weightPerUofMeasure, double width, double length) {
		super(name, modelNumber, height, unitOfMeasureType, flammable, weightPerUofMeasure);
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double volume() {
		return width * length * getHeight();
	}
	
	@Override
	public String toString() {
		return super.toString() + " that is " + volume() + " " + getUnitOfMeasureType() + " in size";
	}

}
