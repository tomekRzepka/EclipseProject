package pl.sdacademy.utils;

import java.util.Random;

import pl.sdacademy.interfaces.ITableUtils;

public class TableUtils implements ITableUtils {

	/**
	 * Zamiana elementów w tablicy</br>
	 * i,j elementy od 0 do n, gdzie n to lenght table
	 * 
	 * @param i
	 * @param j
	 */

	public int[] generateNumbers(int lenght, int from, int to) {
		if (from >= to) {
			// zrzucenie wyjatku
			throw new IllegalArgumentException("Wyjebalo");
		}
		int[] table = new int[lenght];
		Random random = new Random();
		for (int i = 0; i < table.length; i++) {
			table[i] = random.nextInt(to - from) + from;

		}
		return table;

	}

	public void changeElement(Object[] table, int i, int j) {
		Object tem = table[i];
		table[i] = table[j];
		table[i] = tem;

	}

	public void print(Object[] table) {
		for (Object element : table) {
			System.out.println(element);
		}

	}

	public Object[] createTable(int n) {
		Object[] table = new Object[n];
		for (int i = 0; i < n; i++) {
			table[i] = i + 1;
		}
		return table;
	}

}
