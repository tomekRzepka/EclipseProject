package pl.sdacademy.lambda.example1;

import pl.sdacademy.model.Jedzenie;

public class Kanapka extends Jedzenie {

	public Kanapka(String nazwa) {
		super(nazwa);

	}

	@Override
	public String toString() {
		return "Kanapka [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
	}

}
