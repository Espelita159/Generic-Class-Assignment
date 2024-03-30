package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMap<String, String> myMap = new MyMap<>();
        int choice;

        do {
            System.out.println("\n");
            System.out.println("Choices:");
            System.out.println("1. Add key-value pair");
            System.out.println("2. Get value by key");
            System.out.println("3. Remove key-value pair");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine();
                    myMap.put(key, value);
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    String getKey = scanner.nextLine();
                    String result = myMap.get(getKey);
                    if (result != null) {
                        System.out.println("Value for key " + getKey + ": " + result);
                    } else {
                        System.out.println("Key does not exist.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    String removeKey = scanner.nextLine();
                    String removedValue = myMap.remove(removeKey);
                    if (removedValue != null) {
                        System.out.println("Removed value for key " + removeKey + ": " + removedValue);
                    } else {
                        System.out.println("Key does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

}