package virtual.pet.shelter;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Welcome to the Virtual Pet Shelter!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);

        int duration = 0;
        int userChoice;

        do {
            System.out.println("\nDuration: " + duration);

            menu();
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                intakePet(shelter, scanner);
                break;
            case 2:
                adoptPet(shelter, scanner);
                break;
            case 3:
                shelter.playWithPet();
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

        } while (userChoice != 6);
        scanner.close();

    }

    public static void menu() {
        System.out.println("\t What would you like to do?");
        System.out.println("1. Admit a pet");
        System.out.println("2. Adopt a pet");
        System.out.println("3. Play with a pet");
        System.out.println("4. Exit");
        System.out.print("Enter your choice here: ");
    }
}
