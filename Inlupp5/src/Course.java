public class Course {
	private String name;
	private Book book; 
	private int hp;
	private String question;
	private String[] answer;

	public Course(String n, Book b, int hp, String q, String[] a) {
		this.name = n;
		this.book = b;
		this.hp = hp;
		this.question = q;
		this.answer = a;
	}
}
