/*
Create a program that implements a simple mobile phone with the following capabilities.
Able to store, modify, remove and query contact names.
You will want to create a separate class for Contacts (name and phone number).
Create a master class (MobilePhone) that holds the ArrayList of Contacts
The MobilePhone class has the functionality listed above.
Add a menu of options that are available.
Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
and search/find contact.
When adding or updating be sure to check if the contact already exists (use name)
Be sure not to expose the inner workings of the Arraylist to MobilePhone
e.g. no ints, no .get(i) etc
MobilePhone should do everything with Contact objects only.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactList = new Contacts();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;

        displayHome();
        while (!quit){
            System.out.print("\nEnter command: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    displayHome();
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContactList();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    processArrayList();
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void displayHome(){
        System.out.println("\t===================================");
        System.out.println("\n\tPress ");
        System.out.println("\t 0 - Display options.");
        System.out.println("\t 1 - Print contact list.");
        System.out.println("\t 2 - Add new contact");
        System.out.println("\t 3 - Update existing contact");
        System.out.println("\t 4 - Remove contact");
        System.out.println("\t 5 - Exit application");
        System.out.println("\t\n===================================");
    }

    //Add contact to contactList
    public static void addContact() {
        System.out.print("Please enter the contact to add: ");
        contactList.addContact(scanner.nextLine());
    }

    //Use the updateContact method (class Contacts) to perform the update
    public static void updateContactList() {
        System.out.print("Enter the contact to update: ");
        String currentContact = scanner.nextLine();
        System.out.print("Enter the new name of contact: ");
        String newItem = scanner.nextLine();
        contactList.updateContact(currentContact,newItem);
    }

    //Remove contact from contactList
    public static void removeContact() {
        System.out.print("Enter the contact to delete: ");
        String itemNo = scanner.nextLine();
        contactList.removeContact(itemNo);
    }

    //Update contactList based on selection
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(contactList.getContactList());

        ArrayList<String> nextArray = new ArrayList<>(contactList.getContactList());

        String[] myArray = new String[contactList.getContactList().size()];
        myArray = contactList.getContactList().toArray(myArray);


    }
}
