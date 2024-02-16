public class Course{
	private String courseName;
	private Instructor courseInstructor;
	private Textbook courseTextbook;

	public Course(String name, Instructor teacher, Textbook book){
		this.courseName = name;
		this.courseInstructor = teacher;
		this.courseTextbook = book;
	}

	public String getCourseName(){
		return courseName;
	}

	public void setCourseName(String name){
		courseName = name;
	}

	public Instructor getCourseInstructor(){
		return courseInstructor;
	}

	public void setCourseInstructor(Instructor teacher){
		courseInstructor = teacher;
	}

	public Textbook getCourseTextbook(){
		return courseTextbook;
	}

	public void setCourseTextbook(Textbook book){
		courseTextbook = book;
	}

	public void print(){
		System.out.println("Course: " + this.getCourseName() + 
		",\nInstructor: " + courseInstructor.getFirstName() + 
		" " + courseInstructor.getLastName() + ",\nTextbook: " 
		+ courseTextbook.getTitle() + " by " + courseTextbook.getAuthor());
	}
}