package cata;

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
		
		//Creating array
		Integer[] arr = new Integer[20]; 
		Arrays.setAll(arr, n->rd.nextInt(100));
		
		System.out.println(Arrays.toString(arr));
		
		//Sorting
		
		Arrays.sort(arr);
		Arrays.sort(arr, (n1,n2)->n1%2 - n2%2);

		System.out.println(Arrays.toString(arr));
		

	}

}
