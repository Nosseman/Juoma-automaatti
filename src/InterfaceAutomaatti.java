import java.util.Scanner;

public class InterfaceAutomaatti {

	public static void main(String[] args) {

		JuomaAutomaatti omaKone = new JuomaAutomaatti(); // luodaan Olio
		int valinta = 0; // alustetaan
		Scanner lukija = new Scanner(System.in);

		do {
			System.out.println("*******Juoma-Automaatti*******");
			System.out.println();
			System.out.println("1. Kahvi");
			System.out.println("2. Tee");
			System.out.println("3. Kaakao");
			System.out.println("4. Lopeta");
			System.out.println();
			System.out.println("******************************");

			valinta = lukija.nextInt();

			if (valinta == 1) {
				omaKone.onnistuuko();
				if (omaKone.onnistuuko() == true) {
					omaKone.valmistaKahvi();
					System.out.println(omaKone);
					System.out.println();
				} else {
					System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
					System.out.println();
				}
			}

			else if (valinta == 2) {
				omaKone.onnistuuko();
				if (omaKone.onnistuuko() == true) {
					omaKone.valmistaTee();
					System.out.println(omaKone);
					System.out.println();
				} else {
					System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
					System.out.println();
				}
			}

			else if (valinta == 3) {
				omaKone.onnistuuko();
				if (omaKone.onnistuuko() == true) {
					omaKone.valmistaKaakao();
					System.out.println(omaKone);
					System.out.println();
				} else {
					System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
					System.out.println();
				}
			}
		} while (valinta < 4);
		System.out.println("Nähdään taas!");
		System.out.println();
		System.out.println("******************************");
	}
}
