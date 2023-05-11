	// Assignment Note: Task 1: Define three private instance variables
	private String make;
	private String model;
	private int year;
	
	// Assignment Note: Task 2: Create a Constructor that accepts the make, model and year as parameters
	public SimpleCarClass (String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	// Assignment Note: Task 3: Implement getter and setter methods for each instance variable
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Assignment Note: Task 4: Implement toString() method that returns a formatted string with the make, model and year
	
	@Override
	public String toString() {
		return "I drive a " + year + " " + make + " " + model + "!";
	}
	
}
