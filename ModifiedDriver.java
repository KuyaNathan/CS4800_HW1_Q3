public class ModifiedDriver {
	public static void main(String[] args){
		Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
		Instructor man = new Instructor("Andrew", "Man", "456-1234");
		Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin Series", "Pearson");
		Textbook softwareDesign = new Textbook("Software Design Strategies", "Mr. Science", "Fake Publisher");
	
		ModifiedCourse modded = new ModifiedCourse("CS1234: Demo Class", nima, man, cleanCode, softwareDesign);
		modded.print();
	}
}
