import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class VirtualPetTest {
	VirtualPet pet = new VirtualPet();

	@Test
	public void shouldReturnActionAmount() {
		int underTest = pet.getActionAmount();
		Assert.assertEquals(10, underTest);
	}

	@Test
	public void shouldReturnHunger() {
		int underTest = pet.getHunger();
		Assert.assertEquals(50, underTest);
	}

	@Test
	public void shouldReturnFeedingTickDeduction() {
		int underTest = pet.feedPetTick();
		Assert.assertEquals(45, underTest);
	}

	@Test
	public void shouldReturnThirst() {
		int underTest = pet.getThirst();
		Assert.assertEquals(50, underTest);
	}

	@Test
	public void shouldReturnThirstTickDeduction() {
		int underTest = pet.waterPetTick();
		Assert.assertEquals(45, underTest);
	}

	@Test
	public void shouldReturnRest() {
		int underTest = pet.getRest();
		Assert.assertEquals(50, underTest);
	}

	@Test
	public void shouldReturnRestTickDeduction() {
		int underTest = pet.restPetTick();
		Assert.assertEquals(45, underTest);
	}

	@Test
	public void shouldReturnPlay() {
		int underTest = pet.getRest();
		Assert.assertEquals(50, underTest);
	}

	@Test
	public void shouldReturnPlayTickDeduction() {
		int underTest = pet.playPetTick();
		Assert.assertEquals(45, underTest);
	}

	@Test
	public void shouldReturnFeedAllAnimals() {
		int underTest = pet.feedPet();
		Assert.assertEquals(60, underTest);
	}

	@Test
	public void shouldReturnWaterAllAnimals() {
		int underTest = pet.waterPet();
		Assert.assertEquals(60, underTest);
	}

}
