package contactbook;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Contact> contacts = ContactStorage.loadContacts();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Enter action (add, list, edit, delete, exit, search): ");
            String command = scanner.nextLine();
            switch (command.toLowerCase().trim()){
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
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available");
                    } else {
                        System.out.println("__________________");
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println("Index: " + i);
                            System.out.println(contacts.get(i).toString());
                            System.out.println("__________________");
                        }
                    }
                }
                case "edit" -> {
                    System.out.println("Enter index of the record to edit: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    
                    if (index >= 0 && index < contacts.size()) {
                        Contact contact = contacts.get(index);
                        System.out.println("Select field to edit (first name, last name, phone number): ");
                        String field = scanner.nextLine();
                        switch (field.toLowerCase().trim()){
                            case "first name" -> {
                                System.out.println("Enter new first name: ");
                                String newFirstName = scanner.nextLine();
                                contact.setFirstName(newFirstName);
                            }
                            case "last name" -> {
                                System.out.println("Enter new last name: ");
                                String newLastName = scanner.nextLine();
                                contact.setLastName(newLastName);
                            }
                            case "phone number" -> {
                                System.out.println("Enter new phone number: ");
                                String newPhoneNumber = scanner.nextLine();
                                contact.setPhoneNumber(newPhoneNumber);
                            }
                            default -> System.out.println("Invalid field");
                        }
                        System.out.println("The record has been updated");
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "delete" -> {
                    System.out.println("Enter index of the record to delete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    
                    if (index >= 0 && index < contacts.size()) {
                        contacts.remove(index);
                        System.out.println("The record has been deleted");
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "search" -> {
                    System.out.println("Enter the name/phone number to search for: ");
                    String search = scanner.nextLine();
                    boolean found = false;
                    
                    for (Contact contact : contacts) {
                        if(contact.getFirstName().toLowerCase().contains(search.toLowerCase()) ||
                                contact.getLastName().toLowerCase().contains(search.toLowerCase()) ||
                                contact.getPhoneNumber().contains(search)){
                            if (!found) {
                                System.out.println("Found records:");
                                found = true;
                            }
                            System.out.println(contact);
                            System.out.println("__________________");
                        }
                    }
                    
                    if (!found) {
                        System.out.println("No records found");
                    }
                }
                case "exit" -> {
                    ContactStorage.saveContacts(contacts);
                    running = false;
                }
                default -> System.out.println("Invalid command");
            }
        }
        scanner.close();
    }
}
