package com.acme.testing;

import java.math.BigDecimal;

import com.acme.utils.ConversionService;

public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(new BigDecimal("50")));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(new BigDecimal("7.7")));

		// can you figure out why these do not compile
		ConversionService.fluidOunces((float) 1.1);
		ConversionService.grams(30);
		ConversionService.milliliters((int) 4.0);
		BigDecimal grams = ConversionService.grams(30);
		System.out.println(grams);
		BigDecimal byteGrams = ConversionService.grams(30);
		System.out.println(byteGrams);

		// why do these still work even though the types are different

		System.out.println("------------------------------------");
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		BigDecimal s = new BigDecimal("30");
		System.out.println(ConversionService.grams(s.intValue()));
		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		System.out.println(ConversionService.gallons(200));
		System.out.println(ConversionService.ounces(new BigDecimal(50.5f)));
		System.out.println(ConversionService.pints(6L));
		System.out.println(ConversionService.pounds(new BigDecimal(7L)));

		// compare these results. Can you tell why they are different?
		System.out.println("------------------------------------");
		float bigGallons = ConversionService.gallons(123456789123456789L);
		System.out.println(bigGallons);
		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);

		System.out.println("------------------------------------");
		BigDecimal bigGrams = ConversionService.grams(new BigDecimal("1234567890").intValue());
		System.out.println(bigGrams);
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);

		double[][] results = ConversionService.allKgsToPounds(14.0, 29.0, 6.5, 7.7);
		for (double[] result : results) {
			System.out.println(result[0] + "->" + result[1]);
		}
		
		results = ConversionService.allKgsToPounds(2, 5, 8, 4);
		for (double[] result : results) {
		 System.out.println(result[0] + "->" + result[1]);
		}

	}

}
