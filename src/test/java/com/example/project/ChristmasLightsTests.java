/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChristmasLightsTests {

	@Test
	void testNeighbourPoints() {
		ChristmasLights Lights = new ChristmasLights();
		Lights.TurnOnRange(0, 0, 0, 1);

		System.out.println(Lights.GetToggledLights());
		assertEquals(2, Lights.GetToggledLights());
	}

	@Test
	void testLargeLightArray() {
		ChristmasLights Lights = new ChristmasLights();
		Lights.TurnOnRange(100, 250, 500, 450);

		System.out.println(Lights.GetToggledLights());
		assertEquals(80601, Lights.GetToggledLights());
	}
}
