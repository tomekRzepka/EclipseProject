package pl.sdacademy.przychodnia;

public class Pacjent extends Osoba implements IWyszukiwanieOsoby {
	String diagnoza;
	// Date dataWpisu;
	// Date dataWypisu;

	public Pacjent(String pesel, String imieNazwisko, String diagnoza) {
		super(pesel, imieNazwisko);
		this.diagnoza = diagnoza;
		// this.dataWpisu = dataWpisu;
		// this.dataWypisu = dataWypisu;
	}

	public String getDiagnoza() {
		return diagnoza;
	}

	public void setDiagnoza(String diagnoza) {
		this.diagnoza = diagnoza;
	}

	@Override
	public String toString() {

		return "Pacjent [pesel=" + pesel + ", imieNazwisko=" + imieNazwisko + ", diagnoza=" + diagnoza + "]";
	}

	// public Date getDataWpisu() {
	// return dataWpisu;
	// }
	//
	// public void setDataWpisu(Date dataWpisu) {
	// this.dataWpisu = dataWpisu;
	// }
	//
	// public Date getDataWypisu() {
	// return dataWypisu;
	// }
	//
	// public void setDataWypisu(Date dataWypisu) {
	// this.dataWypisu = dataWypisu;
	// }

}
