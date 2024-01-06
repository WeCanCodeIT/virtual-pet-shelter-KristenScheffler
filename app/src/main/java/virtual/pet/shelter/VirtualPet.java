package virtual.pet.shelter;

public class VirtualPet {
    private String name;
    private String description;
    private int hungerLevel;
    private int thirstLevel;
    private int boredLevel;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hungerLevel = 50;
        this.thirstLevel = 50;
        this.boredLevel = 50;
    }

    public VirtualPet(String name, String description, int hungerLevel, int thirstLevel, int boredLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredLevel = boredLevel;
    }

    public void feed() {
        this.hungerLevel -= 10;
    }

    public void water() {
        this.thirstLevel -= 10;
    }

    public void play() {
        this.boredLevel -= 10;
    }

    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredLevel += 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getBoredLevel() {
        return boredLevel;
    }

    public void setBoredLevel(int boredLevel) {
        this.boredLevel = boredLevel;
    }

    public void petStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Hunger: " + this.hungerLevel);
        System.out.println("Thirst: " + this.thirstLevel);
        System.out.println("Bored Status: " + this.boredLevel);
    }

}
