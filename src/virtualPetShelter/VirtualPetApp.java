package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPetShelter ourPets = new VirtualPetShelter();
		
		String name = "unavailable";
		String description = "unavailable";
		int hunger = 10;
		int thirst = 15;
		boolean waste = false; 
		int boredom = 10;
		boolean sick = false;
		String favoriteFood = "Macoroni & Cheese";
		Scanner input = new Scanner(System.in);
		String inputName;
		
//		name, description, hunger, thirst, waste, boredom, sick,  favoriteFood 
		ourPets.addPet(new VirtualPet ("Jonny", "Saasy looking", hunger, thirst, waste, boredom, sick,  favoriteFood));
		ourPets.addPet(new VirtualPet ("Dee Dee", "Tall and handsome", hunger, thirst, waste, boredom, sick,  favoriteFood));
		ourPets.addPet(new VirtualPet ("Tommy", "Proud and fierce", hunger, thirst, waste, boredom, sick,  favoriteFood));
		ourPets.addPet(new VirtualPet ("Joey", "A humble and couragoes dog"));
		ourPets.addPet(new VirtualPet ("Jespy", "A fierce and cunning cat"));
		
		
//		ourPets.displayAllPets();		
//		ourPets.displayPet("Joey");	
//remove pet not working!!		ourPets.removePet("Garfield");		
//		ourPets.displayAllPets();		
//		ourPets.feedPet("Joey");		
//		ourPets.feedAllPets();
//		ourPets.waterAllPets();

//		ourPets.displayAllPetStatusesAndPromptUserInput();
		
		ourPets.tick();
		
		int userInput = -1;
		String userResponse = "test1";
			while (userInput != 7) {
				Scanner input2 = new Scanner(System.in);
				ourPets.displayAllPetStatusesAndPromptUserInput();
				userInput = input.nextInt();	
				if (userInput == 1)
					ourPets.feedAllPets();
				if (userInput == 2)
					ourPets.waterAllPets();
				if (userInput == 3)
					{System.out.println("OK.  Which pet would you like to play with?");
							userResponse = input2.nextLine();
							
							ourPets.playWithPet( new VirtualPet(userResponse));
					}
				if(userInput == 4) {
					System.out.println("Ok. so you'd like to adopt a pet.  Please enter the pet's name to adopt:");
					userResponse = input2.nextLine();
					ourPets.removePet(userResponse);
							
				}
				
				if (userInput == 5){
					System.out.println("OK. So you want to admit a pet");
					System.out.println("Please enter the pet's name");
					name = input2.nextLine();
					System.out.println("Please enter a brief description about the pet:");
					description = input2.nextLine();
					ourPets.addPet(new VirtualPet(name, description));
					ourPets.displayAllPets();
				}
				
				if (userInput == 6) {
					Scanner input3 = new Scanner(System.in);
					System.out.println("OK. So you want to view a pet");
					System.out.println("Please enter the pet's name");
					inputName = input3.nextLine();
					System.out.println("The input name is: " + inputName);
					ourPets.displayPet(inputName);
					//System.out.println("test if " + InputName + "has anything");
					//ourPets.displayPet("Joey");
				}
				ourPets.tick();
			} 
			
		System.out.println("Thank you for playing!");
	
		
	}

}
