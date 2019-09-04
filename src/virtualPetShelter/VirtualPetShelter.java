package virtualPetShelter;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class VirtualPetShelter {
	
	ArrayList <VirtualPet> pets = new ArrayList <VirtualPet> ();
	
	public void addPet(VirtualPet newPet) {
		
		pets.add(newPet);
	}
	
	public void displayAllPets() {
		System.out.println("DISPLAY ALL PETS:");
		System.out.println("NAME:   |DESCRIPTION");
		System.out.println("--------|------------------------");
		for (VirtualPet v: pets)
		System.out.println(v.name  + "\t" +"|" + v.description );
	}

	
	public void displayPet(String petName) {
		System.out.println("DISPLAY PET BY NAME");
		for (VirtualPet v: pets) {
			if(v.name == petName)
				System.out.println("Name: " + v.name + " Description: " + v.description );
		}
	}
	
	public void removePet(String petName) {
		VirtualPet petToRemove = null;
		for (VirtualPet v: pets) {
			if(v.name == petName) {
				petToRemove = v;
				System.out.println(petName + " Has been successfully adopted");
			}
		}		
	pets.remove(petToRemove);
	}
	

	public void feedPet(String petName) {
		for (VirtualPet v: pets) {
			if (v.name == petName)
				System.out.println(v.name + " has been fed");
		}
	}

	public void feedAllPets() {
		for (VirtualPet v: pets)
			feedPet(v.name); 
	}
	
	public void waterPet(String petName) {
		for (VirtualPet v: pets) {
			if (v.name == petName)
				System.out.println(v.name + " has been watered");
		}
	}

	public void waterAllPets() {
		for (VirtualPet v: pets)
			waterPet(v.name); 
	}
	
	public void playWithPet(VirtualPet playPet) {
		if (pets.contains(playPet))
			System.out.println("You have played with " + playPet.name);
		else System.out.println( playPet.name + " Does not exist");
		
/*		boolean found = false;
		for (VirtualPet v : pets) {
			if (v.name == petName) {
				System.out.println("You have played with " + petName);
				found = true;
			}		
		}
		if(!found) System.out.println(petName + " could not be found.");
*/

	}
	
	public void displayAllPetStatusesAndPromptUserInput() {
		System.out.println("\nHere is a status of all of our pets");
		System.out.println("NAME:    |hunger|Thirst |Boredom|Waste  | Sick  ");
		System.out.println("-------- |------|-------|-------|-------|--------");
		for (VirtualPet v: pets)
		System.out.println(v.name +"\t" + " |" + v.hunger + "\t" + "|" + v.thirst + "\t" + "|" +  v.boredom + "\t" + "|" + v.waste +  "\t" + "|"  + v.sick);
		System.out.println("\n" + "What would you like to do next?");
		System.out.println("1. Feed the pets - working");
		System.out.println("2. Water the pets - working");
		System.out.println("3. Play with a pet - cannot figure how to use pets.contains(object) to find is object exists");
		System.out.println("4. Adopt a pet - cant figure to remove - pets.remove(object)");
		System.out.println("5. Admit a pet - working");
		System.out.println("6. View a pet *** string from user input will not work on a method. but arbitrary string works");
		System.out.println("7. Quit  -- Need to randomize waste and sick boolean variables");
		
		
	}

	
	public void tick() {
		
		for (VirtualPet v: pets) {
			Random rand = new Random(); 
		int h = rand.nextInt(5);
		v.hunger = h * 5;

		}
		
		for (VirtualPet v: pets) {
			Random rand = new Random(); 
		int h = rand.nextInt(5);
		v.thirst = h * 5;
		}

		for (VirtualPet v: pets) {
			Random rand = new Random(); 
		int h = rand.nextInt(5);
		v.boredom = h * 5;
		}
	
	}
		
	
	
}
