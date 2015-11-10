public class Hospital {
		private Patient start = null;

		public Hospital () {
			this.start = null;
		}

		public void addPatient(Patient newPatient) {
			if(start == null) {
				this.start = newPatient;
			} else {
				Patient current = start;
				while(current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(newPatient);
			}
		}

		public void removePatient(String name) {
			if(start == null) {
				return;
			} else if (start.getName().equals(name)) {
				start = start.getNext();
			} else {
				Patient current = start;
				while(!current.getNext().getName().equals(name) && current.getNext() != null) {
					current = current.getNext();
				}
				if (current.getNext != null) {
					current.setNext(current.getNext().getNext())
				}
			}
		}

		public void launch() {
			Patient john = new Patient("John",22,"Flu");
			this.addPatient(john);
			Patient dave = new Patient("Dave",57,"Man Flu");
			this.addPatient(dave);
			Patient sarah = new Patient("Sarah", 32, "Gout");
			this.addPatient(sarah);

			this.removePatient("Dave");
		}

		public static void main(String[] args) {
			Hospital hospital = new Hospital();
			hospital.launch();
		}
}