package pl.sdacademy.przychodnia;

public class Lekarz extends Osoba implements IWyszukiwanieOsoby {
	String specjalizacja;

	public Lekarz(String pesel, String imieNazwisko, String specjalizacja) {
		super(pesel, imieNazwisko);
		this.specjalizacja = specjalizacja;
	}

	public String getSpecjalizacja() {
		return specjalizacja;
	}

	public void setSpecjalizacja(String specjalizacja) {
		this.specjalizacja = specjalizacja;
	}

	@Override
	public String toString() {
		return "Lekarz [specjalizacja=" + specjalizacja + ", pesel=" + pesel + ", imieNazwisko=" + imieNazwisko + "]";
	}

}
