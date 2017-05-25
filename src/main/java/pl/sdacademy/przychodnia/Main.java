package pl.sdacademy.przychodnia;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		///////////////// *Tablica*///////////////////////////////////////
		Osoba[] tablicaOsob = new Osoba[5];
		tablicaOsob[0] = new Pacjent("1234567899", "Krzysztof_Gonciarz", "Złamanie nogi");
		tablicaOsob[1] = new Lekarz("9876543211", "Zbigniew_Religa", "Chirurg");
		tablicaOsob[2] = new Pacjent("22334455661", "Adam Popielarz", "Uraz głowy");
		tablicaOsob[3] = new Pacjent("12345678901", "Zbigniew_Stonoga", "Utrata litra krwii");
		tablicaOsob[4] = new Lekarz("98765432113", "Jose Arkadio Morales", "Onkolog");

		//////////////////////////////////////////////////////////////
		System.out.println("Prosze podac PESEL poszukiwanej osoby");
		//////////////// *Tworzymy scanner*//////////////////////////////

		Scanner scanner = new Scanner(System.in);

		String szukanyPesel = scanner.nextLine();

		///////////////////////////////////////////////////////////////

		IWyszukiwanieOsoby szukanaOsoba = new IWyszukiwanieOsoby() {

			@Override
			public Osoba znajdz(Osoba[] lista, String szukanyPesel) {
				int liczbaOperacji = 1;
				Predicate<Osoba> znalezionoPesel = (osoba) -> {
					return szukanyPesel.equals(osoba.getPesel());
				};
				liczbaOperacji++;
				Osoba poszukiwanaOsoba = null;
				liczbaOperacji++;
				for (int i = 0; i < tablicaOsob.length; i++) {
					if (znalezionoPesel.test(tablicaOsob[i])) {
						liczbaOperacji++;
						System.out.println("Znalazło osobę o podanym peselu");
						liczbaOperacji++;
						poszukiwanaOsoba = tablicaOsob[i];
						liczbaOperacji++;
						System.out.println("liczba opreracji = " + liczbaOperacji);
						return poszukiwanaOsoba;

					}
					liczbaOperacji++;
				}
				liczbaOperacji++;
				System.out.println("liczba opreracji = " + liczbaOperacji);
				return poszukiwanaOsoba;
			}
		};

		Osoba znalezionaOsoba = szukanaOsoba.znajdz(tablicaOsob, szukanyPesel);
		System.out.println(znalezionaOsoba);

	}

}
