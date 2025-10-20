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
            System.out.println("Enter action (add, list, edit, delete, exit): ");
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
                case "edit" -> {
                    System.out.println("Enter index of the record to edit: ");
                    int index = scanner.nextInt();
                    for (Contact contact : contacts) {
                        if(index == contacts.indexOf(contact)){
                            System.out.println("Select field to edit: ");
                            scanner.nextLine();
                            String field = scanner.nextLine();
                            switch (field.toLowerCase()){
                                case "first name" -> {
                                    System.out.println("Enter new first name: ");
                                    String newFirstName = scanner.nextLine();
                                    contact.setFirstName(newFirstName);
                                }
                                case "last name" -> {
                                    System.out.println("Enter new last name: ");
                                    String newLastName = scanner.nextLine();
                                }
                                case "phone number" -> {
                                    System.out.println("Enter new phone number: ");
                                    String newPhoneNumber = scanner.nextLine();
                                }
                                default -> System.out.println("Invalid field");
                            }
                        }
                    }
                    System.out.println("The record has been updated");
                }
                case "delete" -> {
                    System.out.println("Enter index of the record to delete: ");
                    int index = scanner.nextInt();
                    for (Contact contact : contacts) {
                        if(index == contacts.indexOf(contact)){
                            contacts.remove(contact);
                        }
                    }
                    System.out.println("The record has been deleted");
                }
                case "exit" -> running = false;
                default -> System.out.println("Invalid command");
            }
        }
    }


}
