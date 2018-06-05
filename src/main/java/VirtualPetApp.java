import java.util.Scanner;

public class VirtualPetApp {

	private static void gameLoop(VirtualPet animals, VirtualPetShelter pets, String actionChoice) {
		Scanner input2 = new Scanner(System.in);
		if (animals.getHunger() >= 0 || animals.getThirst() >= 0) {
			pets.gameTick();
			// FEEDING
			if (actionChoice.equals("1")) {
				pets.feedAllPets();
				System.out.println("You have feed all of the pets!");
				pets.getVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName() + " hunger is " + pet.getHunger());
				});
			//WATERING
			} else if (actionChoice.equals("2")) {
				pets.waterAllPets();
				System.out.println("You have watered all of the pets!");
				pets.getVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName() + " thirst is " + pet.getThirst());
				});
			//PLAY WITH ANIMALS
			} else if (actionChoice.equals("3")) {
				pets.playWithAPet(" ");
				System.out.println("Which animal do you want to plays with?");
				String commandOne = input2.nextLine();
				if (commandOne.equals(pets.getVirtualPets())) {
					System.out.println("You have played with " + pets.getVirtualPets() + "play level is at ");
				}
			//REST WITH ANIMALS
			} else if (actionChoice.equals("4")) {
				System.out.println("Which animal do you want to rest with");
				System.out.println("Please enter the pets name");
				String petChoice2 = input2.nextLine();
				if (petChoice2.equals(pets.getVirtualPets())) {
					System.out.println("you played with " + petChoice2);
				}
			//ADOPT OUT A PET
			} else if (actionChoice.equals("5")) {
				pets.adoptOutAPet();
				System.out.println("Would you like to adopt a pet? y / n");
				String petChoice3 = input2.nextLine();
				if (petChoice3.equals("y")) {
					System.out.println("You have adopted a pet" + pets.getVirtualPets());
				}
			//TAKE IN A PET
			} else if (actionChoice.equals("6")) {
				System.out.println("Please enter the animal you want us to watch");
				String newPet = input2.nextLine();
				pets.takeInAPet(pets.fetchVirtualPet(newPet));
				System.out.println("We'd be glad to take care of " + newPet);

				pets.takeInAPet(pets.fetchVirtualPet(newPet));
				pets.getVirtualPets().forEach(pet -> {
					System.out.println(pet.getPetName());
				});
			} else if (actionChoice.equals("7")) {
				System.out.println("You have ended the game!");
				System.exit(0);
			} else {
				System.out.println("You have killed all the animals");
			}

		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter pets = new VirtualPetShelter();
		VirtualPet animals = new VirtualPet();

		System.out.println("Welcome to Uncle Charles's Animal Shelter\nthe finest animal shelter in the Netherlands");
		System.out.println(" ");
		pets.takeInAPet(new VirtualPet("Black Philip", "Mouse", 50, 80, 30, 50));
		pets.takeInAPet(new VirtualPet("Leafy Beef", "Snake", 70, 60, 40, 60));
		pets.takeInAPet(new VirtualPet("Bellywiggles", "Cat", 40, 30, 40, 30));

		pets.getVirtualPets().forEach(pet -> {
			System.out.println("Name \t| Hunger \t| Thirst \t| Play level \t| Rest Level \t|");
			System.out.println("\t _____________________________________________________________");
			System.out.println(pet.getPetName() + " \t| " + pet.getDescription() + " \t|" + pet.getHunger() + " \t| "
					+ pet.getThirst() + "\t|" + pet.getPlay() + " \t| " + pet.getRest());
			System.out.println("\t ______________________________________________________________");
		});

		for (int count = 0; count < 100; count++) {
			System.out.println(" ");
			System.out.println("What would you like to do?");
			System.out.println("Pres 1: to feed the animals");
			System.out.println("Press 2: to water the animals");
			System.out.println("Press 3: to play with an animal");
			System.out.println("Press 4: give an animal a rest");
			System.out.println("Press 5: to adopt an animal");
			System.out.println("Press 6: to  give an animal for intake to the shelter");
			// ask for a name upon adoption
			System.out.println("Press 7: to quit playing");

			String actionChoice = input.nextLine();
			gameLoop(animals, pets, actionChoice);
		}
		System.out.println("Game Over, you have killed your animals");
		input.close();
	}
}