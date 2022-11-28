package cata;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
 * Fes un programa que generi 20 números aleatoris entre 0 i 100, i els guardi en un array.
 * Un cop tenim l'array amb els 20 números, el programa ha de passar tots els parells a
 * les primeres posicions de l'array, i tots els imparells a les posicions finals de l'array.
 * Si ho necessites pots utilitzar més d'un array per poder fer la solució final.
 */
public class Main {

	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		Integer[] arr = new Integer[20]; 
		
		int lastEven = 0;
		int lastOdd = 19;
		
		for (int i = 0; i < arr.length; i++) {
			
			int rand = rd.nextInt(100); 
			if (rand % 2 == 0) {
				arr[lastEven] = rand;
				lastEven++;
			} else {
				arr[lastOdd] = rand;
				lastOdd--;
			}
	    }
		
		System.out.println(Arrays.toString(arr));
		

	}

}
