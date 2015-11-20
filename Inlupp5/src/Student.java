public class Student {
	private String name;
	private Course ongoingCourse;
	private Course completedCourse;
	private Book[] books;

	public Student(Room r, Course oCourse, Course cCourse, Book[] books) {
		super(r);
		this.ongoingCourse = oCourse;
		this.completedCourse = cCourse;
		this.books = books;
	}
}