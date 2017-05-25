package pl.sdacademy.przychodnia;

public class Osoba implements IWyszukiwanieOsoby {
	String pesel;
	String imieNazwisko;

	public Osoba(String imieNazwisko) {

		// this.pesel = pesel;
		this.imieNazwisko = imieNazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getImieNazwisko() {
		return imieNazwisko;
	}

	public void setImieNazwisko(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;
	}

	@Override
	public Osoba znajdz(Osoba[] lista, String pesel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Osoba [pesel=" + pesel + ", imieNazwisko=" + imieNazwisko + "]";
	}

}
