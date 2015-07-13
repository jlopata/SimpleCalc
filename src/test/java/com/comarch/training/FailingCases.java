package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FailingCases {

	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(groups = { "failures" }, dependsOnGroups = {
			"important" }, dataProvider = "TwoArgs", dataProviderClass = DataProviderExample.class)
	public void DivisionTest(int x, int y) {

		// Given
		float a = x / y;

		// When
		float z = simpleCalculator.divide(x, y);

		// Then
		Assert.assertEquals(z, a);

	}

	@Test(groups = { "failures" }, dependsOnGroups = { "important" }, dataProvider = "OneArg", dataProviderClass = DataProviderExample.class)
	public void AddingToMemoryTest(int x) {

		// Given
		simpleCalculator.memory = 0;
		// When
		simpleCalculator.addToMemory(x);

		// Then
		Assert.assertEquals(simpleCalculator.memory, x);

	}

	@Test(groups = { "important", "failures" }, dataProvider = "TwoArgs", dataProviderClass = DataProviderExample.class)
	public void SubstactionTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.minus(x, y);

		// Then
		Assert.assertEquals(z, x - y + 3);

	}

}
