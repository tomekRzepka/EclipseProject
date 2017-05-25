package pl.sdacademy.model;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;

public class Kursant {

	Plec plec;
	int wiek;
	Miasto miasto;
	String nazwisko;
	String imie;

	public Kursant(int wiek, String nazwisko, String imie) {
		super();
		this.wiek = wiek;
		this.nazwisko = nazwisko;
		this.imie = imie;
	}

	public Kursant() {
		super();
	}

	public Plec getPlec() {
		return plec;
	}

	public void setPlec(Plec plec) {
		this.plec = plec;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public Miasto getMiasto() {
		return miasto;
	}

	public void setMiasto(Miasto miasto) {
		this.miasto = miasto;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

}
