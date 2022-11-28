package cata;

import java.util.Arrays;
import java.util.Random;

/*
 * Fes un programa que generi 20 números aleatoris entre 0 i 100, i els guardi en un array.
 * Un cop tenim l'array amb els 20 números, el programa ha de passar tots els parells a
 * les primeres posicions de l'array, i tots els imparells a les posicions finals de l'array.
 * Si ho necessites pots utilitzar més d'un array per poder fer la solució final.
 */
public class Main2 {

	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		Integer[] arr = new Integer[20]; 
		
		for (int i = 0; i < arr.length; i++) {
			
			int rand = rd.nextInt(100); 
			arr[i] = rand;
	    }
		
		for (int i = 0; i < arr.length; i++) {	
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] % 2 == 1 && arr[j] %2 == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		    }
	    }
		
		System.out.println(Arrays.toString(arr));
		

	}

}
