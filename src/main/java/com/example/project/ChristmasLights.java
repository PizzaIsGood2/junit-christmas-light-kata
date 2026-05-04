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
	int[][] Lights = new int [1000][1000];

	public ChristmasLights() {
		for (int x = 0; x < 1000; x++) {
    		for (int y = 0; y < 1000; y++) {
        		Lights[x][y] = 0;
    		}
		}
	}

	public void TurnOnRange(int x1, int y1, int x2, int y2) {
		for (int x = x1; x <= x2; x++) {
			for (int y = y1; y <= y2; y++) {
				Lights[x][y] = 1;
			}
		}
	}

	public int GetToggledLights() {
		int numToggledLights = 0;

		for (int x = 0; x < 1000; x++) {
    		for (int y = 0; y < 1000; y++) {
        		if (Lights[x][y] == 1) {
					numToggledLights += 1;
				}
    		}
		}

		return numToggledLights;
	}
}
