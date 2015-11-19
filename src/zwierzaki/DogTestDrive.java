package zwierzaki;

public class DogTestDrive {

	public static void main(String[] args) {
		String[] barkList = new String[3];
		barkList[0] = "s¹siad";
		barkList[1] = "listonosz";
		barkList[2] = "z³odziej";
	
		Dog myDog = new Dog(40, "Kundelek", "ugryz");
		
		for (int i = 0; i < 3; i = i + 1) {
			myDog.bark(barkList[i]);
		}
		


	}

}
