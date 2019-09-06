package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPetShelter ourPets = new VirtualPetShelter();
		
		Scanner input = new Scanner(System.in);
		
		ourPets.addAPet("Joey", "Cool calm and collected");
		ourPets.addAPet("Tommy", "Dont mess with me pet");
		ourPets.addAPet("Sam", "I like me some milk cat");
		ourPets.addAPet("Fido", "Tall and handsome");
		ourPets.addAPet("Jonny", "Saasy looking");
		
		
		System.out.println("Welcome to Besty Beasties – Animal Shelter.  We are delighted to see you!" + "\n" + "Our pets would love to engage with visitors");
		ourPets.viewAllPetsStatuses();
		ourPets.displayUserChoicesToPick();
		System.out.println("What would you like to do?");
		
		int userInput = -1;
		userInput = input.nextInt();
		
		while (userInput != 7){
			if(userInput == 1)  ourPets.feedThePets();
			if(userInput == 2)  ourPets.waterThePets();
			if(userInput == 3) {
				Scanner input3 = new Scanner(System.in);
				System.out.println("OK. You'd like to play with a pet.  Here is what we have");
				ourPets.viewAllPets();
				System.out.println("Which pet would you like to play with?");
				String userPetPlayInput = input3.nextLine();
				ourPets.playWithAPet(userPetPlayInput);			
			}
			if(userInput == 4) {
				Scanner input4 = new Scanner(System.in);
				System.out.println("Great! Please enter the pets name you'd like to adopt:");
				String userPetToAdopt = input4.nextLine();
				ourPets.removeAPet(userPetToAdopt);
			}
			
			if(userInput == 5) {
				Scanner input5 = new Scanner(System.in);
				System.out.println("Great! We are an open door for pets: Please enter the Name of your pet:");
				String userPetToAdmit = input5.nextLine();
				System.out.println("Please enter a brief description of your pet:");
				String userPetDescription = input5.nextLine();
				ourPets.addAPet(userPetToAdmit, userPetDescription);	
			}
			if(userInput == 6) {
				ourPets.takeThePetsToTheBathroom();
				}
			
			ourPets.viewAllPetsStatuses();
			ourPets.displayUserChoicesToPick();
			System.out.println("\nWhat else would you like to do?");
			userInput = input.nextInt();
		}  	//end while loop
		
		System.out.println("Thank you for visiting. Come back and see us again soon!.");	
	
	}
}


					