package contactbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Enter action: ");
            String command = scanner.nextLine();
            switch (command.toLowerCase()){
                case "add" -> {
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.add(new Contact(firstName, lastName, phoneNumber));
                    System.out.println("Contact added");
                }
                case "list" -> {
                    System.out.println("__________________");
                    for (Contact contact : contacts) {
                        System.out.println(contact.toString());
                        System.out.println("__________________");
                    }
                }
                case "exit" -> running = false;
                default -> System.out.println("Invalid command");
            }
        }
    }


}
