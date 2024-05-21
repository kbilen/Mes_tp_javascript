package computerpioneers;



public class Main {
 public static void main(String[] args) {
	 
     Device turingEngine = new Device("Turing Engine", 1936);
     Device babbageAnalyticalMachine = new Device("Babbage Analytical Machine", 1837);

     System.out.println(turingEngine.toString());
     System.out.println(babbageAnalyticalMachine.toString());
     
     ComputerPioneer alanTuring = new ComputerPioneer("Alan", "Turing",turingEngine);
     ComputerPioneer AdaLovelace = new ComputerPioneer("Ada", "Lovelace",babbageAnalyticalMachine);

     System.out.println(alanTuring.toString());
     System.out.println(AdaLovelace.toString());
     
     System.out.println("Test case 3 ");
     System.out.println("-----------------");
     
     System.out.println(AdaLovelace.worksOn(babbageAnalyticalMachine));
     System.out.println(AdaLovelace.worksOn(turingEngine));
     
     System.out.println(alanTuring.worksOn(babbageAnalyticalMachine));
     System.out.println(alanTuring.worksOn(turingEngine));
     
     System.out.println("Test case 4 ");
     System.out.println("-----------------");
     
     Device turing = new Device("Turing Engine", 1936);
     Device babbage = new Device("Babbage Analytical Machine", 1837);
     
     System.out.println(AdaLovelace.worksOn(babbage));
     System.out.println(AdaLovelace.worksOn(turing));
     
     System.out.println(alanTuring.worksOn(babbage));
     System.out.println(alanTuring.worksOn(turing));

 }
}
