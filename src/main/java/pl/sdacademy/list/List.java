package pl.sdacademy.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class List<T> implements IList {
	ListElement<T> firstElement;
	ListElement<T> lastElement;

	public List() {
		firstElement = null;
		lastElement = null;
	}

	@Override
	public Object getFirst() {

		return firstElement.getValue();
	}

	@Override
	public Object getLast() {

		return lastElement.getValue();
	}

	@Override
	public T get(int index) {
		return getElement(index).getValue();

	}

	public ListElement<T> getElement(int index) {
		if (isEmpty()) {
			return null;
		} else {
			int counter = 0;
			ListElement<T> element = firstElement;
			while (counter != index) {
				element = element.getNext();
				counter++;
			}
			return element;
		}
	}

	// @Override
	// public void add(T value) {
	// ListElement<T> addedElement = new ListElement<T>(value);
	// if (isEmpty()) {
	// firstElement = addedElement;
	// lastElement = firstElement;
	// } else {
	// lastElement.next = addedElement;
	// addedElement.previous = lastElement;
	// lastElement = addedElement;
	// }
	//
	// }

	@Override
	public void remove(int index) {
		ListElement<T> elementToRemove = getElement(index);
		ListElement<T> previousElement = elementToRemove.getPrevious();
		ListElement<T> nextElement = elementToRemove.getNext();
		if()
		previousElement.next = nextElement;
		nextElement.previous = previousElement;
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int listSize = 0;
			ListElement<T> element = firstElement;
			while (element != null) {
				element = element.getNext();
				listSize++;
			}
			return listSize;
		}
	}

	@Override
	public boolean isEmpty() {

		return firstElement.equals(null);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(Consumer action) {
		// TODO Auto-generated method stub
		IList.super.forEach(action);
	}

	@Override
	public Spliterator spliterator() {
		// TODO Auto-generated method stub
		return IList.super.spliterator();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
