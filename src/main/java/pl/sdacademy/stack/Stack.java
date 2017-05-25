package pl.sdacademy.stack;

import java.lang.reflect.Array;

public class Stack<T> implements IStack<T> {

	private int maxStackSize;
	private T[] arrayStack;
	private int peek;

	public Stack(int sizeStack, Class<T> elementlaStacClass) {
		maxStackSize = sizeStack;
		arrayStack = (T[]) Array.newInstance(elementlaStacClass, maxStackSize);
		peek = -1;

	}

	@Overide
	public void push(T element) {
		peek++;
		arrayStack[peek] = element;
	}

	@Overide
	public T pop() {
		T element = arrayStack[peek];
		arrayStack[peek] = null;
		peek--;
		return element;
	}

	@Override
	public T peek() {
		return arrayStack[peek];

	}

	@Override
	public int size() {

		return (peek + 1);
	}

	@Override
	public boolean isEmpty() {

		return (peek == -1);
	}

}
