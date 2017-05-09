package pl.sdacademy.model;

import pl.sdacademy.enums.BodyType;
import pl.sdacademy.interfaces.IAction;
import pl.sdacademy.interfaces.ICar;

public class Car extends Vehicle implements ICar, IAction {

	BodyType bodyType;

	public Car() {
		super("benzine", 4, 2000.5); // wykonanie klasy ojciec

	}

	public Car(BodyType bodyType, double weight) {
		this(bodyType);
		setWeight(weight);
	}

	public Car(BodyType bodyType) {
		this(); // wywołanie konstruktora domyslnego w danej klasie;
		setBodyType(bodyType);
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public void refuel() {
		// TODO Auto-generated method stub

	}

	public void openDoor() {
		// TODO Auto-generated method stub

	}

	public void startEngine() {
		// TODO Auto-generated method stub

	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		System.out.println("GO GO GO");

	}

}
