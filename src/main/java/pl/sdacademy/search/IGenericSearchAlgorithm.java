package pl.sdacademy.search;

import java.util.function.Predicate;

/**
 * http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/
 * 
 */
public interface IGenericSearchAlgorithm {
	<T extends Comparable> int search(T[] array, Predicate<T> predicate);
}
