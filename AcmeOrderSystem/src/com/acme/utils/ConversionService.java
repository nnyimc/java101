package com.acme.utils;

import java.math.BigDecimal;

public class ConversionService {
	
	public static BigDecimal kilogramToPounds = new BigDecimal("2.2046");
	public static BigDecimal kilogramToGrams = new BigDecimal("1000");
	public static BigDecimal kilogramToOunces = new BigDecimal("35.274");
	
	public static float literToFluidOunce = 33.814f;
	public static float literToGallon = 0.2642f;
	public static float literToPints = 2.1134f;
	public static short literToMilliliters = 1_000;
	
	public static BigDecimal pounds (BigDecimal kilograms){
		return kilogramToPounds.multiply(kilograms);
	}
	public static BigDecimal grams (int i){
		return kilogramToGrams.multiply(new BigDecimal(i));
	}
	
	public static BigDecimal ounces (BigDecimal kilograms){
		return kilogramToOunces.multiply(kilograms);
	}
	public static float fluidOunces(float liters){
		return liters * literToFluidOunce;
	}
	public static float gallons(float liters){
		return liters * literToGallon;
	}
	public static float pints (float liters){
		return liters * literToPints;
	}
	public static int milliliters (int liters) {
		return liters * literToMilliliters;
	}
	
	
	public static double[][] allKgsToPounds(double... kilogramValues){ 
		double[][] conversionTable = new double[kilogramValues.length][2];
		int i = 0;
		for( double d: kilogramValues) {
			double[] conversion = {d, d * kilogramToPounds.doubleValue()};
			conversionTable[i] = conversion;
			i++;
		}
		return conversionTable;
 	}
}
