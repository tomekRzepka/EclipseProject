package pl.sdacademy.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IStackTest {
	boolean result;
	int maxElement;
	IStack<Laptop> laptopStack;
	IStack<Laptop> laptopStackOverflow;
	IStack<Laptop> emptyStack;

	/*
	 * Uruchamia sie przed kazdym testem
	 */
	@Before
	public void setUp() {
		maxElement = 3;
		result = false;
		laptopStack = new Stack(maxElement, Laptop.class);
		Laptop newLaptop = new Laptop("Ania");
		laptopStack.push(newLaptop);
		laptopStackOverflow = new Stack<>(maxElement, Laptop.class);
		laptopStackOverflow.push(new Laptop("Jerzyk"));
		laptopStackOverflow.push(new Laptop("Brajan"));
		laptopStackOverflow.push(new Laptop("Stefano"));
		emptyStack = new Stack(maxElement, Laptop.class);
	}

	@Test
	public void shouldPushElementToEmptyStack() {
		// given
		Laptop laptop = new Laptop("Rysiu z Klanu");

		// when
		if (emptyStack.isEmpty()) {
			emptyStack.push(laptop);
			Laptop tmp = emptyStack.peek();
			result = laptop.equals(tmp);
		}

		// then
		assertTrue(result);

	}

	@Test
	public void shouldPushElementToFilledStack() {
		// given
		Laptop laptopTomka = new Laptop("Tomek");

		// when
		laptopStackOverflow.push(laptopTomka);
		if (!laptopTomka.equals(laptopStackOverflow.peek())) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void shouldDeleteValueafterPopping() {

		Laptop firstLaptop = laptopStack.peek();
		laptopStack.pop();
		Laptop newFirstLaptop = laptopStack.peek();
		if (firstLaptop.equals(newFirstLaptop)) {
			result = false;
		}
		assertTrue(result);

	}

	@Test
	public void shouldReceiveValueWhenPeekingButNotDeleteIt() {
		// given
		Laptop firstLook = laptopStack.peek();
		// when
		Laptop secondLook = laptopStack.peek();
		// then
		if (secondLook.equals(firstLook)) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void shouldReturnZeroAsSizeOfEmptyStack() {

		assertTrue(emptyStack.size() == 0);
	}

	@Test
	public void shouldReturnCorrectSizeForFilledStack() {
		assertTrue(laptopStack.size() == maxElement);
	}

	@Test
	public void shouldReturnTrueIfThereWereNoValuesPutOnStack() {
		assertTrue(laptopStackOverflow.isEmpty());
	}

	@Test
	public void shouldReturnFalseIfPushWasCalledPreviusly() {
		emptyStack.push(new Laptop("Madzia"));
		assertFalse(emptyStack.isEmpty());

	}

	@Test
	public void shouldReturnTrueIfElementWasPushedAndPoped() {
		emptyStack.push(new Laptop("Julia"));
		emptyStack.pop();
		assertTrue(emptyStack.isEmpty());
	}
}
