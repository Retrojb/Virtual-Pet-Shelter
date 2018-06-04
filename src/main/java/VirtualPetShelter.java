import java.util.ArrayList;
import java.util.Collection;

public class VirtualPetShelter {

	private Collection<VirtualPet> virtualPets = new ArrayList<VirtualPet>();

	public Collection<VirtualPet> getVirtualPets() {
		return virtualPets;
	}

	public void setVirtualPets(Collection<VirtualPet> virtualPets) {
		this.virtualPets = virtualPets;
	}

	public VirtualPet fetchVirtualPet(String petName) {
		return virtualPets.stream().filter(pet -> pet.getPetName().equals(petName)).findFirst().orElse(null);
		// functional programming "loop"
		// stream reads thru the byte streams, to gather the info out of the
		// virtualPets, use filter
		// to pass a lambda and apply it to all objects in the stream, and returns true.
		// all other will not show.
		// the '.' is a entire method in one line, spit across all the 3 lines and is it
		// all the same method call.
		// this loops through the whole list hold the loop, so this iterates over the
		// list.
	}

	public void feedAllPets() {
		virtualPets.stream().forEach(pet -> pet.feedPet());

	}

	public void waterAllPets() {
		virtualPets.stream().forEach(pet -> pet.waterPet());
	}

	public void playWithAPet(String petName) {
		virtualPets.stream().filter(pet -> pet.getPetName().equals(petName))
				// if you have 3 pets with the same name it will play with all of them
				// could add findFirst to play with the first pet.
				.forEach(pet -> pet.playWithPet());

	}

	public void restWithAPet(String petName) {
		virtualPets.stream().filter(pet -> pet.getPetName().equals(petName)).forEach(pet -> pet.restWithPet());
		// Argument matches the same as play with pet, that if multiple of same pet
		// all pets with matching name will rest. could use findFirst.
	}

	public void takeInAPet(VirtualPet pet) {

		virtualPets.add(pet);

	}

	public VirtualPet adoptOutAPet() {
		VirtualPet adoptedPet = virtualPets.stream().findFirst().orElse(null);
		// runs stream adopts first virtual pet, then moves it to adoptedPet, then
		// removes the pet.
		virtualPets.remove(adoptedPet);
		return adoptedPet;

	}

	public void gameTick() {
		// inserted indv tick methods to attribute changes
		virtualPets.stream().forEach(pet -> {
			pet.feedPetTick();
			pet.waterPetTick();
			pet.playPetTick();
			pet.restPetTick();
		});
	}

}
