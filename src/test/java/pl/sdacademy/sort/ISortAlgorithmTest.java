package pl.sdacademy.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISortAlgorithmTest {

	ISortAlghoritm sortAlgorithm = new SortAlgorithm();
	int[] unSortedTable = { 2, 1, 4, 3 };
	int[] sortedTableAsc = { 1, 2, 3, 4 };
	int[] sortedTableDesc = { 4, 3, 2, 1 };

	@Test
	public void shouldSortArrayAscendingByDefault() {

		// given unSortedTable

		// when
		sortAlgorithm.sort(unSortedTable);

		// then

		assertTrue(isTableEqual(unSortedTable, sortedTableAsc));

	}

	private boolean isTableEqual(int[] tableToSort, int[] sortedTable) {
		if (tableToSort.length != sortedTable.length) {
			return false;
		}
		boolean isAllElementEqualOrEndofTable = true;

		for (int j = 0; j < sortedTable.length; j++) {
			isAllElementEqualOrEndofTable = (tableToSort[j] == sortedTable[j]);
			System.out.println(j + " | " + tableToSort[j]);

		}

		return isAllElementEqualOrEndofTable;
	}

	private boolean isEndOfTable(int[] tableToSort, int i) {
		return i == tableToSort.length - 1;
	}

	@Test
	public void shouldSortArrayDependingOnTheOrder() {

		// given

		int[] sortedTable = { 4, 3, 2, 1 };

		// when

		sortAlgorithm.sort(unSortedTable, false);

		assertTrue(isTableEqual(unSortedTable, sortedTableDesc));

	}

	@Test
	public void shouldLeaveSortedArrayUnchaged() {

		// given

		int[] tableToSort = { 1, 2, 3, 4 };

		// when

		sortAlgorithm.sort(tableToSort);

		// then

		assertTrue((isTableEqual(tableToSort, sortedTableAsc)));

	}

	@Test
	public void shouldThrowExceptionIfArrayIsNull() {
		// given
		int[] notInitArray = null;
		boolean isArrayNull = false;

		// when
		try {
			sortAlgorithm.sort(notInitArray);

		} catch (Exception e) {
			isArrayNull = true;
			e.printStackTrace();
		}
		// then
		assertTrue(isArrayNull);

	}

	@Test
	public void shouldNotThrowIfArrayIsZeroSized() {
		// given
		int[] emptyArray = {};
		boolean isThrowException = false;

		// when
		try {
			sortAlgorithm.sort(emptyArray);
		} catch (Exception e) {
			isThrowException = true;
			e.printStackTrace();
		}
		// then
		assertFalse(isThrowException);

	}

	@Test
	public void shouldSortIfElementsAreNotUnique() {
		// given
		int[] notUniqueUnsortedTable = { 1, 2, 4, 6, 2, 3, 1 };
		int[] notUniqueSortedTable = { 1, 1, 2, 2, 3, 4, 6 };
		// when
		sortAlgorithm.sort(notUniqueUnsortedTable);
		for (int i = 0; i < notUniqueUnsortedTable.length; i++) {
			System.out.print(notUniqueUnsortedTable[i] + ",");
		}
		// then
		System.out.println(isTableEqual(notUniqueUnsortedTable, notUniqueSortedTable));
		assertTrue(isTableEqual(notUniqueUnsortedTable, notUniqueSortedTable));

	}

}
