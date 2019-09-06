package virtualPetShelter;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class VirtualPetShelter {
	
	Map<String, String> mapPets = new HashMap<String, String>();
	
	int hunger = 10;
	int thirst = 15 ;
	String bathroom = "No";
	int boredom =5 ;
	String sick = "No"; 
	String name ;
	String description;
	String favoriteFood;
	
	


	
	
	
	public void viewAllPetsStatuses() {
		System.out.println("\nHere is a fresh status of all of our pets");
		System.out.println("NAME:    |hunger|Thirst |Boredom|Bathroom  | Sick  ");
		System.out.println("-------- |------|-------|-------|----------|--------");
		for (Entry <String, String> entry: mapPets.entrySet()) {			
			VirtualPet pet = new VirtualPet(entry.getKey(), entry.getValue(), hunger, thirst, bathroom, boredom, sick, favoriteFood);			
			tick();		
			System.out.println(pet.name +"\t" + " |" + pet.hunger + "\t" + "|" + pet.thirst + "\t" + "|" +  pet.boredom + "\t" + "|" + pet.waste +  "\t" + "   |"  + pet.sick);
		}
	}
	

	public void displayUserChoicesToPick() {
		System.out.println("Here are your options:");
		System.out.println("1. Feed the pets ");
		System.out.println("2. Water the pets");
		System.out.println("3. Play with a pet ");
		System.out.println("4. Adopt a pet ");
		System.out.println("5. Admit a pet ");
		System.out.println("6. Take pets to bathroom ");
		System.out.println("7. Quit ");
		
		
	}
	
	public void tick() {
		
		Random rand = new Random(); 
		int h = rand.nextInt(5);
		hunger = h * 5;
		
		Random randt = new Random(); 
		int t = rand.nextInt(5);
		thirst = t * 5;
		
		Random randb = new Random(); 
		int b = rand.nextInt(5);
		boredom = b * 5;
		
		Random randWaste = new Random();
		int w = rand.nextInt(10);
		if (w % 2 == 0)
			bathroom = "Yes";
		else bathroom = "No";
		
		Random randSick = new Random();
		int s = rand.nextInt(10);
		if (s % 2 == 0)
			sick = "Yes";
		else sick = "No";
		
	}
	
	
	
	
	public void addAPet(String name, String description) {
		
		mapPets.put(name, description);
		
	}
	
	public void viewAllPets() {
		System.out.println("ALL OF OUR PETS:");
		System.out.println("NAME:   |DESCRIPTION");
		System.out.println("------- |------------------------");
		for (Entry <String, String> entry: mapPets.entrySet()) {			
			System.out.println(entry.getKey() + "\t|" + entry.getValue());
		}
	}
	
	
	public void viewAPet(String name) {
		System.out.println("NAME:   |DESCRIPTION");
		System.out.println("------- |------------------------");
		String petDescription = mapPets.get(name);
		System.out.println(name + "\t|" + petDescription);
	}
	
	
	public void feedThePets() {
		for (Entry <String, String> entry: mapPets.entrySet()) {
			System.out.println("You have fed:  " + entry.getKey());
		}
		System.out.println("The pets are now ready to play");
	}
	
	public void takeThePetsToTheBathroom() {
		for (Entry <String, String> entry: mapPets.entrySet()) {
			System.out.println("You have taken " + entry.getKey() + " to the bathroom");
		}
		System.out.println("Thank you!");
	}
	
	public void waterThePets() {
		for (Entry <String, String> entry: mapPets.entrySet()) {
			System.out.println("You have watered:  " + entry.getKey());
		}
	}
	
	public void playWithAPet(String petName) {
		if(mapPets.containsKey(petName))
			System.out.println("You have played with: " + petName);
		else System.out.println("We could not find :" + petName);
	}
	
	public void removeAPet(String petName) {
		if (mapPets.containsKey(petName)) {
		mapPets.remove(petName);
		System.out.println("You have successfully adopted: " + petName);
	}  else System.out.println(petName + " could not be found");
	}
	
}
