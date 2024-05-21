package farwest;


public class Main {
 public static void main(String[] args) {

	 Cheval jolluJumper = new CHeval("Jolly Jumper","appaloosa");
	 System.out.println(jollyJumper.decrire());

	 
     
     Heros heros = new Heros("Lucky", "Luke", "Cow-boy",jollyJumper);
     System.out.println(jollyJumper.decrire());
     
     Bandit joeDalton = new Bandit("Joe", "Dalton", 150);
     System.out.println(joeDalton.decrire());
     
}
