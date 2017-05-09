/**
 * 
 */
package pl.sdacademy.main;

import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Car;
import pl.sdacademy.model.OpelCar;
import pl.sdacademy.model.SeatCar;

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
		tomeksSeat.refuel();
		carTable[0] = adamsOpel;
		carTable[1] = tomeksSeat;
		for (int i = 0; i < carTable.length; i++) {
			System.out.println(carTable[i].getInfo());

		}
	}

}
