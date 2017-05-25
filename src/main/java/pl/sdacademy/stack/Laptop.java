package pl.sdacademy.stack;

public class Laptop {

	Karteczka karteczka;

	public Laptop(String imie) {
		this.karteczka = new Karteczka("Laptop");
		this.karteczka.setNapis(imie);
	}

}
