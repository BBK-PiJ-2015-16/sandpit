public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient next;

	public Patient(String n, int a, String i) {
		this.name = n;
		this.age = a;
		this.illness = i;
	}

	public Patient getNext() {
		return next;
	}

	public void setNext(Patient nextpatient) {
		this.next = nextPatient;
	}

	public String getName() {
		return this.name;
	}
}