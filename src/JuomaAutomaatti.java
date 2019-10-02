
public class JuomaAutomaatti {

	private int kahvia;
	private int teet‰;
	private int kaakaota;

	// tehd‰‰n konstruktorit
	public JuomaAutomaatti() {
		this.kahvia = 50;
		this.teet‰ = 50;
		this.kaakaota = 50;
	}

	public JuomaAutomaatti(int kahvia, int teet‰, int kaakaota) {
		this.kahvia = kahvia;
		this.teet‰ = teet‰;
		this.kaakaota = kaakaota;
	}

	// generoidaan getterit ja setterit

	public int getKahvia() {
		return kahvia;
	}

	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}

	public int getTeet‰() {
		return teet‰;
	}

	public void setTeet‰(int teet‰) {
		this.teet‰ = teet‰;
	}

	public int getKaakaota() {
		return kaakaota;
	}

	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}


	public void valmistaKahvi() {
		if (this.kahvia < 10) {
			this.kahvia = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Kahvia ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.kahvia -= 10;
			System.out.println("Odota hetki, kahvisi valmistuu. ");
		}

	}

	public void valmistaTee() {
		if (this.teet‰ < 10) {
			this.teet‰ = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Teet‰ ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.teet‰ -= 10;
			System.out.println("Odota hetki, teesi valmistuu. ");
		}
	}

	public void valmistaKaakao() {
		if (this.kaakaota < 10) {
			this.kaakaota = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Kaakaota ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.kaakaota -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. ");
		}
	}

	// luodaan onnistuuko metodi

	public boolean onnistuuko() {
		int luku = (int) (Math.random() * 100 + 1);
		if (luku <= 25) {
			return false;
		} else {
			return true;
		}
	}

	// generoidaan toString() metodi ja muokataan se halutuksi
	@Override
	public String toString() {
		return "Kahvia j‰ljell‰: " + kahvia + ", Teet‰ j‰ljell‰: " + teet‰ + ", Kaakaota j‰ljell‰: " + kaakaota;
	}

}
