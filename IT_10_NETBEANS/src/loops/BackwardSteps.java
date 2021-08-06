/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import javax.swing.*;

/**
 *
 * @author kwhil
 */
public class BackwardSteps {

	public static void notMain(String[] args) {
		
		int yMax = 20;
		int xMax = 20;

		int yCur = 1;// how many chars to print on this line
//		int xCur = 0;
		
		char symbol = '#';
			
		for (int i = 0; i < xMax; i++) {
			for (int j = yMax; j > 0; j--) {
				if (j <= yCur) {
					System.out.print(symbol);
				} else {
					System.out.print(" ");
				}
				if (j == 1) {
					System.out.println("");
					yCur++;
				}
			}
		}
	}
}
