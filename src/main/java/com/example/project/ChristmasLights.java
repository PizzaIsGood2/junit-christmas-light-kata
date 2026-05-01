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

public class ChristmasLights {
	int[][] Lights = new int [5][5];

	public ChristmasLights() {
		for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
        		Lights[i][j] = 0;
    		}
		}
	}

	public void TurnOnRange(int x1, int y1, int x2, int y2) {
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				Lights[i][j] = 1;
			}
		}
	}

	public int GetToggledLights() {
		int numToggledLights = 0;

		for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
        		if (Lights[i][j] == 1) {
					numToggledLights += 1;
				}
    		}
		}

		return numToggledLights;
	}
}
