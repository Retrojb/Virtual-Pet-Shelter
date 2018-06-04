import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPetShelter pets = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Uncle Charles's Animal Shelter\nthe finest animal shelter in the Netherlands");
		System.out.println(" ");
		pets.takeInAPet(new VirtualPet("Black Philip", "Mouse", 50, 20, 30, 50));
		pets.takeInAPet(new VirtualPet("Leafy Beef", "Snake", 70, 10, 40, 60));
		pets.takeInAPet(new VirtualPet("Bellywiggles", "Cat", 40, 20, 10, 30));

		pets.getVirtualPets().forEach(pet -> {
			System.out.println("Name \t| Hunger \t| Thirst \t| Play level \t| Rest Level \t|");
			System.out.println("\t _____________________________________________________________");
			System.out.println(pet.getPetName() + " \t| " + pet.getDescription() + " \t|" + pet.getHunger() + " \t| "
					+ pet.getThirst() + "\t|" + pet.getPlay() + " \t| " + pet.getRest());
			System.out.println("\t ______________________________________________________________");
		});
		System.out.println(" ");
		System.out.println("What would you like to do?");
		System.out.println("Pres 1: to feed the animals");
		System.out.println("Press 2: to water the animals");
		System.out.println("Press 3; to play with an animal");
		System.out.println("Press 4: give an animal a rest");
		System.out.println("Press 5: to adopt an animal");
		System.out.println("Press 6: to  give an animal for intake to the shelter");
		// ask for a name upon adoption
		System.out.println("Press 7: to quit playing");

		String actionChoice = input.nextLine();

		if (actionChoice.equals("1")) {
			System.out.println("You have feed all of the pets!");
			pets.getVirtualPets().forEach(pet -> {
				System.out.println(pet.getPetName() + " hunger is " + pet.getHunger());
			});
		}
		else if (actionChoice.equals("2")) {
			System.out.println("You have watered all of the pets!");
			pets.getVirtualPets().forEach(pet -> {
				System.out.println(pet.getPetName() + " thirst is " + pet.getThirst());
			});
		}
		else if (actionChoice.equals("3")) {
			System.out.println(" ");
		}
		System.out.println("");
	}

}
