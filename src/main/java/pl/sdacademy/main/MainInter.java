/**
 * 
 */
package pl.sdacademy.main;

import pl.sdacademy.interfaces.IAction;
import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Car;
import pl.sdacademy.model.Cat;
import pl.sdacademy.model.Dog;
import pl.sdacademy.model.OpelCar;
import pl.sdacademy.model.SeatCar;
import pl.sdacademy.utils.TableUtils;

/**
 * @author RENT
 *
 */
public class MainInter {

	/**
	 * 
	 */
	public MainInter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car[] carTable = new Car[2];
		Bike marcinsRomet = new Bike();
		OpelCar adamsOpel = new OpelCar();
		SeatCar tomeksSeat = new SeatCar();
		// tomeksSeat.refuel();
		// carTable[0] = adamsOpel;
		// carTable[1] = tomeksSeat;
		// for (int i = 0; i < carTable.length; i++) {
		// System.out.println(carTable[i].getInfo());

		// }

		IAction[] iActionTable = new IAction[3];

		iActionTable[0] = marcinsRomet;
		iActionTable[1] = adamsOpel;
		iActionTable[2] = tomeksSeat;
		for (int i = 0; i < iActionTable.length; i++) {
			iActionTable[i].run();
		}

		voiceFromAnimals();

		TableUtils tableUtils = new TableUtils();

		tableUtils.changeElement(iActionTable, 0, 2);

	}

	/*
	 * Metoda ktora wyswietla czynnosc zaimplementowana w metodzie voice-
	 * przyklad bez interfac'u
	 */
	private static void voiceFromAnimals() {
		Object[] animals1 = new Object[2];
		Dog dog = new Dog();
		Cat cat = new Cat();
		animals1[0] = dog;
		animals1[1] = cat;

		for (int i = 0; i < animals1.length; i++) {
			Object animal = animals1[i];
			if (i == 0) {
				Dog animal1 = (Dog) animal;
				animal1.voice();
			} else {
				Cat animal2 = (Cat) animal;
				animal2.voice();
			}

		}
	}

}
