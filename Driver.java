public class Driver {
	public static void main(String[] args){
		Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
		Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin Series", "Pearson");
		Course cs4800 = new Course("CS4800: Software Engineering", nima, cleanCode);

		cs4800.print();
	}
}
