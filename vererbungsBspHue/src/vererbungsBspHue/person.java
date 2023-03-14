package vererbungsBspHue;


public class person {
 private String name;
 private int alter;

 public person(String name, int alter) {
     this.name = name;
     this.alter = alter;
 }

public String getName() {
     return name;
 }

 public int getAlter() {
     return alter;
 }

 public void vorstellen() {
     System.out.println("Mein Name ist " + name + " und ich bin " + alter + " Jahre alt.");
 }
}




