package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(groups =  "succes", dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void AddingTest(int x, int y) {

		// Given
		

		// When
		int z = simpleCalculator.add(x, y);

		// Then
		Assert.assertEquals(z, x+y);

	}

	@Test(groups =  "succes", dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void SubstactionTest(int x, int y) {

		// Given
		

		// When
		int z = simpleCalculator.minus(x, y);

		// Then
		Assert.assertEquals(z, x-y);

	}

	@Test(groups =  "succes", dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void MultiplyTest(int x, int y) {

		// Given
		

		// When
		int z = simpleCalculator.multiply(x, y);

		// Then
		Assert.assertEquals(z, x*y);

	}

	@Test(groups =  "succes", dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void DivisionTest(int x, int y) {

		// Given
		float a = x/y;

		// When
		float z = simpleCalculator.divide(x, y);

		// Then
		Assert.assertEquals(z,a);

	}

	@Test(groups = { "succes" }, dataProvider = "OneArg", dataProviderClass = DataProviderExample.class)
	public void AddingToMemoryTest(int x) {

		// Given
		simpleCalculator.memory = 0;
		// When
		simpleCalculator.addToMemory(x);

		// Then
		Assert.assertEquals(simpleCalculator.memory, x);

	}

	@Test(groups =  "succes", dataProvider = "OneArg", dataProviderClass = DataProviderExample.class)
	public void SettingMemoryTest(int x) {

		// Given
		// When
		simpleCalculator.setMemory(x);

		// Then
		Assert.assertEquals(simpleCalculator.memory, x);

	}
	
	@Test(groups =  "succes", dataProvider = "OneArg", dataProviderClass = DataProviderExample.class)
	public void GettingMemoryTest(int x) {

		// Given
		simpleCalculator.memory = x;
		// When

		// Then
		Assert.assertEquals(simpleCalculator.getMemory(), x);

	}

}
