package q4lab2;

public class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String name, String id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public Student(String name, String id) {
		this(name,id,0);
	}

	public Student(String id) {
		this(null,id,0);
	}

	public void display() {
			if(name!=null)
			{
				System.out.print(name+", ");
			}
			System.out.print(id+", ");
			if(grade!=0)
			{
				System.out.print(grade);
			}
	}

	public void display(int year) {
			this.display();
			System.out.print(", "+year);
	}

}
