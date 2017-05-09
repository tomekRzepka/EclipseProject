package pl.sdacademy.model;

import pl.sdacademy.enums.BikeType;
import pl.sdacademy.interfaces.IAction;

public class Bike extends Vehicle implements IAction {
	BikeType bikeType;

	public Bike() {
		super("foot", 2, 15);

	}

	public Bike(BikeType bikeType) {
		this();
		setBikeType(bikeType);
	}

	public BikeType getBikeType() {
		return bikeType;
	}

	public void setBikeType(BikeType bikeType) {
		this.bikeType = bikeType;
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		System.out.println("Naciśnij pedał i jedz");

	}

}
