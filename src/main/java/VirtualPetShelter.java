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
	
	public VirtualPet fetchVirtualPet (String petName) {
		return
		virtualPets.stream()
		.filter(pet -> pet.getPetName().equals(petName))
		.findFirst()
		.orElse(null);
		//functional programming "loop"
		// stream reads thru the byte streams, to gather the info out of the virtualPets, use filter
		//to pass a lambda and apply it to all objects in the stream, and returns true. all other will not show.
		// the '.' is a entire method in one line, spit across all the 3 lines and is it all the same method call.
		//this loops through the whole list hold the loop, so this iterates over the list.
	}
	
	public void feedAllPets() {
		virtualPets.stream()
		.forEach(pet -> pet.feedPet());
		
	}
	public void waterAllPets() {
		virtualPets.stream()
		.forEach(pet -> pet.waterPet());
	}
	
	
}
