package pl.sdacademy.search;

public class SearchAlghoritm implements ISearchAlgorithm {

	@Override
	public int search(int[] array, int value) throws Exception {
		if (array == null) {
			throw new Exception("Array is null!");
		} else if (array.length == 0) {
			return -1;
		} else {
			for (int i = 0; i < array.length; ++i) {
				if (array[i] == value) {
					return i;
				}
			}
			return -1;
		}
	}

	@Override
	public void search(int[] array) {
		// TODO Auto-generated method stub

	}

}
