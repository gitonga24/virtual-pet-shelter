package virtualPetShelter;

public class VirtualPet {

	int hunger ;
	int thirst ;
	String waste ;
	int boredom ;
	String sick; 
	String name ; 
	int Rand;
	String favoriteFood;
	String description;
	
	
	public VirtualPet (String name, String description) {
		
		this.name = name;
		this.description = description; 
		
	}
	

	
	public VirtualPet(String name, String description, int hunger, int thirst, String bathroom, int boredom, String sick,  String favoriteFood ) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = bathroom;
		this.boredom = boredom;
		this.sick = sick;
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.description = description;

	}
	
}
