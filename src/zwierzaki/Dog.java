package zwierzaki;

public class Dog {
	private int size;
	private String breed;
	private String name;
	
	public Dog() {
		System.out.println("Powstaje piesek");
	}
	
	public Dog(int size, String breed, String name) {
		this.size = size;
		this.breed = breed;
		this.name = name;
		System.out.println("Powstaje konkretny piesek");
	}



	void bark(String somebody) {
		String bark = "Hej " + somebody + " Ruff! Ruff!";
		System.out.println(bark);
	}
	
	void barkOnPostman() {
		String somebody = "listonosz";
		String bark = "Hej " + somebody + " Ruff! Ruff!";
		System.out.println(bark);
	}
}
