import java.util.Scanner;
public class Main {
    public static void displayMenu() {
        System.out.println("1. Add 5 student");
        System.out.println("2. Print 5 Student");
        System.out.println("3. Delete student from ID");
        System.out.println("4. Find by First Name");
        System.out.println("5. Display Student has the highest point");
        System.out.println("6. Quit");

    }

    public static void main(String[] args) {
        Handle handle = new Handle();
        boolean programme = true;
        Scanner sc = new Scanner(System.in);
        while (programme) {
            try {
                Main.displayMenu();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        handle.addStudent();
                        break;
                    case 2:
                        handle.outStudent();
                        break;
                    case 3:
                        handle.destroyById();
                        break;
                    case 4:
                        System.out.println("Enter the firstname: ");
                        String firstName = sc.nextLine();
                        handle.findByFirstName(firstName);
                        break;
                    case 5:
                        handle.Max();
                        break;
                    default:
                        System.out.println("Wrong");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error, restart menu");
            }
        }
    }
}