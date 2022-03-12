package com.acme.domain;

public abstract class Good implements Product{
	public enum UnitOfMeasureType {LITER, GALLON, CUBIC_METER, CUBIC_FEET}
	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitOfMeasureType;
	private boolean flammable = true;
	private double weightPerUofMeasure;
	
	public Good(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable,
			double weightPerUofMeasure) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.height = height;
		this.unitOfMeasureType = unitOfMeasureType;
		this.flammable = flammable;
		this.weightPerUofMeasure = weightPerUofMeasure;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public UnitOfMeasureType getUnitOfMeasureType() {
		return unitOfMeasureType;
	}
	public void setUnitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
		this.unitOfMeasureType = unitOfMeasureType;
	}
	public boolean isFlammable() {
		return flammable;
	}
	public void setFlammable(boolean flammable) {
		this.flammable = flammable;
	}
	public double getWeightPerUofMeasure() {
		return weightPerUofMeasure;
	}
	public void setWeightPerUofMeasure(double weightPerUofMeasure) {
		this.weightPerUofMeasure = weightPerUofMeasure;
	}
	
	public abstract double volume();
	
	public double weight() {
		return volume() * weightPerUofMeasure;
	}
	
	public final boolean canShipViaPostOffice() {
		if ( flammable == false && weightPerUofMeasure < 200 ) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
