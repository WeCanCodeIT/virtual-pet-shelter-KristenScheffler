package virtual.pet.shelter;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "\t Welcome to the Virtual Pet Shelter!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        do {
            menu();
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
            case 1:
                System.out.println("Enter the name of the new pet:");
                String newPetName = scanner.nextLine();
                System.out.println("Enter the description of the new pet:");
                String newPetDescription = scanner.nextLine();
                shelter.intakePet(newPetName, newPetDescription);
                break;
            case 2:
                System.out.println("Enter the name of the pet you want to adopt:");
                String adoptPetName = scanner.nextLine();
                shelter.adoptPet(adoptPetName);
                break;
            case 3:
                System.out.println("Enter the name of the pet you want to play with:");
                String playPetName = scanner.nextLine();
                shelter.playWithPet(playPetName);
                break;
            case 4:
                shelter.feedAllPets();
                break;
            case 5:
                shelter.waterAllPets();
                break;
            case 6:
                System.out.println("Good bye!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice");
                break;
            }

            shelter.tick();

        } while (userChoice != 6);

        scanner.close();

    }

    public static void menu() {
        System.out.println("           What would you like to do?");
        System.out.println("             1. Admit a pet");
        System.out.println("             2. Adopt a pet");
        System.out.println("             3. Play with a pet");
        System.out.println("             4. Exit");
        System.out.println("             5. Feed all pets");
        System.out.println("             6. Water all pets");
        System.out.print("           Enter your choice here: ");
    }
}
