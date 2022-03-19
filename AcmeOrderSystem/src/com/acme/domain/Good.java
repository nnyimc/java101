package com.acme.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Good implements Product, Comparable<Good> {
	public enum UnitOfMeasureType {
		LITER, GALLON, CUBIC_METER, CUBIC_FEET
	}

	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitOfMeasureType;
	private boolean flammable = true;
	private double weightPerUofMeasure;
	private static Set<Good> catalog;

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
		if (flammable == false && weightPerUofMeasure < 200) {
			return true;
		}
		return false;
	}

	public static Set<Good> getCatalog() {
		return catalog;
	}

	public static void setCatalog(Set<Good> catalog) {
		Good.catalog = catalog;
	}
	
	public int compareTo (Good object) {
		return getName().compareTo(object.getName());
		
	}

	static {
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 15, 6);
		Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
		Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 500, 0.25, 0.3);
		Solid safe = new Solid("Acme Safe", 1672, 1.0, UnitOfMeasureType.CUBIC_METER, false, 300, 0.5, 0.5);
		Solid balloon = new Solid("Acme Balloon", 1401, 15, UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
		Solid pistol = new Solid("Acme Disintegrating Pistol", 1587, 0.1, UnitOfMeasureType.CUBIC_FEET, false, 1, 0.5,
				2);
		Liquid nitro = new Liquid("Acme Nitroglycerin", 4289, 1.0, UnitOfMeasureType.CUBIC_METER, true, 1.5, 0.25);
		Liquid oil = new Liquid("Acme Oil", 4275, 1.0, UnitOfMeasureType.CUBIC_METER, true, 1.5, 0.25);
		catalog = new HashSet<Good>();
		catalog.add(anvil);
		catalog.add(paint);
		catalog.add(safe);
		catalog.add(balloon);
		catalog.add(pistol);
		catalog.add(nitro);
		catalog.add(oil);
		catalog.add(glue);
	}

	public static Set flammablesList() {
		Set<Good> flammablesSet = new HashSet<Good>();
		Iterator<Good> iterator = Good.getCatalog().iterator();
		while (iterator.hasNext()) {
			Good good = (Good) iterator.next();
			if (good.isFlammable()) {
				flammablesSet.add(good);
			}
		}
		return flammablesSet;
	}

	@Override
	public String toString() {
		return name;
	}

}
