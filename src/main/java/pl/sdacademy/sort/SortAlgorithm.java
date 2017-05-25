package pl.sdacademy.sort;

public class SortAlgorithm implements ISortAlghoritm {

	public SortAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort(int[] array, boolean ascending) {
	//
	// boolean flagThereWasSwap = true;
	// int step = 1;
	// for (int i = 0; i < array.length - 1; i++) {
	// System.out.print(array[i] + ",");
	//
	// }
	// if (ascending) {
	// while (flagThereWasSwap) {
	// System.out.println("\nKrok " + step + " :\n");
	// step++;
	// flagThereWasSwap = false;
	// for (int i = 0; i < array.length - 1; i++) {
	// System.out.print(array[i] + ",");
	// if (array[i] > array[i + 1]) {
	// int tmp = array[i + 1];
	// array[i + 1] = array[i];
	// array[i] = tmp;
	// flagThereWasSwap = true;
	// }
	// }
	// }
	// } else {
	// while (flagThereWasSwap)
	// flagThereWasSwap = false;
	// for (int i = 0; i < array.length - 1; i++) {
	// if (array[i] < array[i + 1]) {
	// int tmp = array[i + 1];
	// array[i + 1] = array[i];
	// array[i] = tmp;
	// flagThereWasSwap = true;
	// }
	// }
	// }
	//
	// }

	/**
	 * Jak testować implementacje ?</br>
	 * https://drive.google.com/file/d/0B4cxGqCXZKnKdEpMbVExR3lTeDg/view?usp=
	 * sharing wejsc w powyzszy link</br>
	 * testować na przykladzie z obrazka</br>
	 * wypisywac krok po kroku kolejne iteracje petli</br>
	 * i sprawdzac czy sa jak na obrazku. </br>
	 * </br>
	 * Po wykonaniu implementacji testujemy. </br>
	 * Możemy testować w trakcie implementacji</br>
	 * Implementacja będzie zakończona,</br>
	 * gdy wszystkie testy będą zakończone sukcesem.
	 * 
	 */

	// TODO Zaimplementuj ponizszy pseudokod
	// procedure BubbleSort( var a: array of TItemBubbleSort );
	// var
	// n, newn, i:integer;
	// begin
	// n := high( a );
	// repeat
	// newn := 0;
	// for i := 1 to n do
	// begin
	// if a[ i - 1 ] > a[ i ] then
	// begin
	// swap( a[ i - 1 ], a[ i ]);
	// newn := i ;
	// end;
	// end ;
	// n := newn;
	// until n = 0;
	// end;
	//
	// end.

	public void heapSort(int[] array) {

		int n = array.length;
		/*
		 * i-zmienna licznikowa pętli umieszczającej kolejne elementy zbioru w
		 * kopcu, i -> Naturalne, i -> {2,3,...,n} j,k - indeksy elementów
		 * leżących na ścieżce od wstawianego elementu do korzenia, j,k->
		 * Całkowite tmp - zmienna pomocnicza przechowująca tymczasowo element
		 * wstawiany do kopca
		 */
		int i, j, k, tmp;
		// Kopiec - montaż
		for (i = 2; i < n; i++) {
			if (i < n) {
				j = i;
				k = j / 2;
				tmp = array[i];
			} else {
				break;
			}
			while ((k > 0) && array[k] < tmp) {
				array[j] = array[k];
				j = k;
				k = j / 2;
			}
			array[j] = tmp;
		}
		
		// demontaż kopca
		
		for (int i = n; i>1; i--) {
			int m;
			array[i]=tmp;
			array[i]=array[1];
			array[1]=tmp;
			while(k<1){
				if((k+1<i)&&(array[k+1]>array[i])){
					m=k+1;
				}else{ m=k;}
				if(array[m]<=array[j]){break};
					array[m]=tmp;
					array[m]=array[j];
					array[j=tmp;
					j=m;k=j+1;
			}
		}
			
		}
		
		
		
		// prezentuj wynik

		
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
