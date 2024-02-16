public class ModifiedCourse {
	private String courseName;
	private Instructor[] courseInstructors = new Instructor[2];
	private Textbook[] courseTextbooks = new Textbook[2];

	public ModifiedCourse(String name, Instructor prof1, Instructor prof2, Textbook book1, Textbook book2){
		this.courseName = name;
		this.courseInstructors[0] = prof1;
		this.courseInstructors[1] = prof2;
		this.courseTextbooks[0] = book1;
		this.courseTextbooks[1] = book2;
	}

	public String getCourseName(){
		return courseName;
	}

	public void setCourseName(String name){
		courseName = name;
	}

	public Instructor[] getCourseInstructor(){
		return courseInstructors;
	}

	public void setCourseInstructor(Instructor teacher, int index){
		courseInstructors[index] = teacher;
	}

	public Textbook[] getCourseTextbook(){
		return courseTextbooks;
	}

	public void setCourseTextbook(Textbook book, int index){
		courseTextbooks[index] = book;
	}

	public void print(){
		System.out.println("Course: " + this.getCourseName() + ",\nInstructors: " 
		+ courseInstructors[0].getFirstName() + " " + courseInstructors[0].getLastName() + 
		", "+ courseInstructors[1].getFirstName() + " " + courseInstructors[1].getLastName()
		+ ",\nTextbooks: " + courseTextbooks[0].getTitle() + " by " + 
		courseTextbooks[0].getAuthor() + ", " + courseTextbooks[1].getTitle() + " by " 
		+ courseTextbooks[1].getAuthor());
	}
}
