package pl.sdacademy.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.stack.Laptop;

public class IListTest {
	IList<Laptop> emptyLaptopList;
	boolean result;
	Laptop laptopMark;
	IList<Laptop> nonEmptyList;

	/*
	 * Uruchamia sie przed kazdym testem
	 */
	@Before
	public void setUp() {
		emptyLaptopList = null;
		nonEmptyList = null;
		result = false;
		laptopMark = new Laptop("Mark");
	}

	@Test
	public void shouldAddElementIfListIsEmpty(){
			//given
		Laptop 
			//when
		
		emptyLaptopList.add(laptopMark);
		result = emptyLaptopList.getFirst().equals(laptopMark);
			//then
		assertTrue(result);
		
		
	}

	@Test
	public void shouldGetFirstElementOfNonEmptyList() {
		// given
		Laptop firstLaptop = nonEmptyList.get(0);
		// when

		result = nonEmptyList.getFirst().equals(firstLaptop);

		// then

		assertTrue(result);

	}

	@Test
	public void shouldGetLastElementOfNonEmptyList() {
		// given
		Laptop lastLaptop = nonEmptyList.getLast();
		// when
		result = nonEmptyList.getLast().equals(lastLaptop);
		// then
		assertTrue(result);

	}

	@Test
	public void shouldReturnNullIfThereAreNoElements() {
		// given

		// when
		result = emptyLaptopList.getFirst().equals(null);
		// then
		assertTrue(result);
	}

	@Test
	public void shouldGetSpecificElementFromTheList() {
		// given

		// when
		result = nonEmptyList.get(1).equals(laptopMark);
		// then
	}

	@Test
	public void shouldRemoveElementFromNonEMptyList() {
		// given
		// when
		nonEmptyList.remove(0);
		// then
		assertTrue(nonEmptyList.get(0).equals(null));
	}

	@Test
	public void shouldThrowExceptionIfGetCalledOnEmptyList() {
		// given
		// when
		try {
			emptyLaptopList.get(0);
		} catch (Exception e) {
			result = true;
		}
		// then
		assertTrue(result);
	}

	@Test
	public void shouldThrowExceptionIfRemoveCalledOnEmptyList() {
		// given
		// when
		try {
			emptyLaptopList.remove(0);
		} catch (Exception e) {
			result = true;
		}
		// then
		assertTrue(result);
		// then
	}

}
