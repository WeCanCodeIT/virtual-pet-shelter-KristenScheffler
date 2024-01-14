package virtual.pet.shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public VirtualPet getPetByName(String name) {
        return pets.get(name);
    }

    public void intakePet(String name, String description) {
        VirtualPet newPet = new VirtualPet(name, description);
        pets.put(name, newPet);
    }

    public VirtualPet adoptPet(String name) {
        return pets.remove(name);
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithPet(String name) {
        VirtualPet pet = pets.get(name);
        pet.play();
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

}