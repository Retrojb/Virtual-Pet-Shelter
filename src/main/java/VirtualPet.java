
public class VirtualPet {
	
	private int hunger = 50;
	private int thirst = 50;
	private int rest = 50;
	private int play = 50;
	private int actionAmount = 10;
	private int tickActionAmount = 5;
	private String petName;
	private String description;
	

public int getHunger() {
	return hunger;
}
public void setHunger(int hunger) {
	this.hunger = hunger;
}
public int feedPet () {
	hunger += actionAmount;
	return hunger;
}
public void feedPetTick() {
	hunger -= tickActionAmount;
}


public int getThirst() {
	return thirst;
}
public void setThirst(int thirst) {
	this.thirst = thirst;
}
public int waterPet () {
	thirst += actionAmount;
	return thirst;
}
public void waterPetTick() {
	thirst -= tickActionAmount;
}


public int getRest() {
	return rest;
}
public void setRest(int rest) {
	this.rest = rest;
}
public int restWithPet() {
	rest += actionAmount;
	return rest;
}
public void restPetTick() {
	rest -= tickActionAmount;
}


public int getPlay() {
	return play;
}
public void setPlay(int play) {
	this.play = play;
}
public int playWithPet() {
	play += actionAmount;
	return play;
}
public void playPetTick () {
	rest -= tickActionAmount;
}


public int getActionAmount() {
	return actionAmount;
}
public void setActionAmount(int actionAmount) {
	this.actionAmount = actionAmount;
}

public String getPetName() {
	return petName;
}
public void setPetName(String petName) {
	this.petName = petName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public VirtualPet() {
	
}
public VirtualPet (int hunger, int thirst, int rest, int play, int actionAmount, String petName, String description) {
		
	super();
	this.petName = petName;
	this.description = description;
	this.hunger = hunger;
	this.thirst = thirst;
	this.rest = rest;
	this.play = play;
	this.actionAmount = actionAmount;
}


}
