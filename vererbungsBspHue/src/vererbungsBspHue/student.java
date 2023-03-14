package vererbungsBspHue;

public class student extends person {
	 private int matrikelnummer;

	 public student(String name, int alter, int matrikelnummer) {
	     super(name, alter);
	     this.matrikelnummer = matrikelnummer;
	 }

	 public int getMatrikelnummer() {
	     return matrikelnummer;
	 }

	 public void lernen() {
	     System.out.println("Ich lerne gerade.");
	 }
	}
