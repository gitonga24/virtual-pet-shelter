package virtualPetShelter;

public class VirtualPet {

	int hunger ;
	int thirst ;
	boolean waste ;
	int boredom ;
	boolean sick; 
	String name ; 
	int Rand;
	String favoriteFood;
	String description;
	
	
	public VirtualPet (String name, String description) {
		
		this.name = name;
		this.description = description; 
		
	}
	
	public VirtualPet (String name) {
		
		this.name = name;
	}
	
	public VirtualPet(String name, String description, int hunger, int thirst, boolean waste, int boredom, boolean sick,  String favoriteFood ) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sick = sick;
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.description = description;

	}
	
}
