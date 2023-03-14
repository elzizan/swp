package vererbungsBspHue;

public class teacher extends person {
	private String fachgebiet;

	public teacher(String name, int alter, String fachgebiet) {
		     super(name, alter);
		     this.fachgebiet = fachgebiet;
		}

	public String getFachgebiet() {
		    return fachgebiet;
		}

	public void lehren() {
		    System.out.println("Ich unterrichte " + fachgebiet + ".");
		}
}

