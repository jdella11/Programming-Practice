import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contactList = new ArrayList<>();

    //Add input name to contactList
    public void addContact(String name){
        contactList.add(name);
    }

    //Print entire contactList
    public void printContactList(){
        System.out.println("You have "+contactList.size() + " contact(s).");
        for (int i = 0; i<contactList.size(); i++){
            System.out.println((i+1) + ". "+contactList.get(i));
        }
    }

    //Remove input name from contactList
    public void removeContact(String name){
        int position = findItem(name);
        if(position >=0){
            removeContactList(position);
        }
    }

    //Search for position of input name in contactList
    private int findItem(String searchName){

        return contactList.indexOf(searchName);
    }

    //Remove input int position in contactList
    private void removeContactList(int position){

        contactList.remove(position);
    }

    //Update contact list publicly by calling private methods to do the heavier lifting
    public void updateContact(String currentItem, String newItem) {

        int position = findItem(currentItem);

        //Ensure newItem is not already in the contactList by calling private method compareContact
        if(compareContact(currentItem,newItem)==true){
            if(position >= 0) {
                updateContactList(position, newItem);
            }
        }
    }

    //Compare a new contact w/ existing contactList so as to not have two entries w/ same name
    private boolean compareContact(String currentContact, String newContact){
        for(int i = 0; i < contactList.size(); i++){
            if(newContact.equals(contactList.get(i))){
                System.out.println("Error: Unable to update contact. " +
                        "Cannot have two contacts with the same name.");
                return false;
            }
        }
        return true;
    }

    //Update contactList privately as to keep as much of the array private
    private void updateContactList(int position, String newItem) {
        contactList.set(position, newItem);
        System.out.println("Contact number " + (position+1) + " has been modified.");
    }

    public ArrayList<String> getContactList() {
        return contactList;
    }
}
