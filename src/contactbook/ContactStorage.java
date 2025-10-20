package contactbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactStorage {
    private static final String FILE_NAME = "contacts.txt";

    public static void saveContacts(List<Contact> contact){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            outputStream.writeObject(contact);
            System.out.println("Contacts saved to file");
        } catch (IOException e) {
            System.out.println("Error saving contacts to file" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Contact> loadContacts(){
        try (ObjectInputStream inputStream = new ObjectInputStream(ContactStorage.class.getResourceAsStream(FILE_NAME))){
            return (List<Contact>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No saved contacts found, starting with a new one");
        } catch (IOException e) {
            System.out.println("Error loading contacts from file" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found" + e.getMessage());
        }
        return new ArrayList<>();
    }
}
