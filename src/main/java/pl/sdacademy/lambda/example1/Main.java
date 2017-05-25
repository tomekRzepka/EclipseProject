package pl.sdacademy.lambda.example1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		IKanapka panKanapka = new IKanapka() {

			@Override
			public Kanapka zrob(Bulka bulka, Maslo maslo, Warzywo warzywo) {
				String elementyKanapka = bulka.getNazwa() + " " + maslo.getNazwa() + " " + warzywo.getNazwa();
				Kanapka kanapka = new Kanapka("Bulka z pomidorem");
				kanapka.setSkladniki(elementyKanapka);

				return kanapka;
			}

		};
		
		Bulka kajzerka =new Bulka("Kajzerka");
		Maslo manuel= new Maslo("Manuel");
		Warzywo zielone = new Warzywo("Pomidor");
		Kanapka wiosennaKanapka = panKanapka.zrob(bulka, maslo, warzywo);
		System.out.println("Kanapka Pana Kanapki: "+ wiosennaKanapka);
		
		IKanapka umiejetnosciPaniJadzi= (buleczka,maselko,warzywko)->{return new Kanapka("?")};
		Kanapka wiosennaKanapka2 = umiejetnosciPaniJadzi.zrob(bulka, maslo, warzywo);
		System.out.println("Kanapka zrobiona przez Pani Kanapki" + wiosennaKanapka2);
		
		IKanapka umiejetnosciPanaFranka=(bulka, maslo, warzywo)->{
			Kanapka kanapkaStudenta= new Kanapka("akademicka");
			kanapka.setSkladniki(bulka+" "+maslo);
			return kanapka;
		};

		Predicate<Maslo> posiadaMasloExtra = (maselko) -> {
			return maselko.getNazwa().equalsIgnoreCase("extra");
		};
	}

}
