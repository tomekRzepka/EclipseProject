package pl.sdacademy.model;

import java.util.function.Predicate;

import pl.sdacademy.enums.Plec;

public class Predykat {

	public static int WIEK_PELNOLETNOSCI = 18;

	public Predicate<Kursant> isAdult() {
		return kursant -> kursant.getWiek() >= WIEK_PELNOLETNOSCI;
	}

	public Predicate<Kursant> isGender(Plec plec) {
		return kursant -> kursant.getPlec().equals(plec);

	}

	public Predicate<Kursant> isMan() {

		return isGender(Plec.MEZCZYZNA);

	}

	public Predicate<Kursant> isWoman() {

		return isGender(Plec.KOBIETA);

	}

	public Predicate<Kursant> isAdultWoman() {

		return isWoman().and(isAdult());

	}

}
