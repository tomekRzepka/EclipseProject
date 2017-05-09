package pl.sdacademy.model;

import pl.sdacademy.enums.BodyType;

public class OpelCar extends Car {

	public OpelCar() {
		super(BodyType.COMBI, 6000);

	}

	public void refuel() {
		System.out.println("Tankuje OPELA ....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ZATANKOWALEM");
	}

}
