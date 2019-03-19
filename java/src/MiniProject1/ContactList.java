package MiniProject1;

import java.util.ArrayList;


public class ContactList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<>();
    }


    public void addContact() {
        String userName = InputCollector.getUserInput("Enter name:", true);
        String  userMobile = InputCollector.getPhoneNumber("Enter phone number (mobile):", true);
        String  workPhone = InputCollector.getPhoneNumber("Enter phone number (work):", false);
        String  homePhone = InputCollector.getPhoneNumber("Enter phone number (home):", false);
        String userCity = InputCollector.getUserInput("Enter city:", false);
        Contact newContact = new Contact(userName, userMobile, workPhone, homePhone, userCity);

        if (!contactList.contains(newContact)) {
            contactList.add(newContact);
            System.out.println("Successfully added a new contact!");
        } else {
            System.out.println("----- Failed to add a new contact -----");
            System.out.println("This contact (same name and mobile) is already exist.");
        }
    }


    public boolean isEmpty() {
        if (contactList.isEmpty()) {
            System.out.println("There are nothing to show...");
        }
        return contactList.isEmpty();
    }


    public void showAllContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println(i + ". " + contact);
        }
    }


    public void removeContact() {
        int index = InputCollector.getUserInputAsInt("Enter the index of the contact to remove:", 0, contactList.size() - 1);
        Contact contact = contactList.get(index);
        String NameOfContact = contact.getMyName();
        contactList.remove(index);
        System.out.println("Successfully removed " + NameOfContact);

    }


    public void updateContact() {
        int index = InputCollector.getUserInputAsInt("Enter the index of the contact to update:", 0, contactList.size() - 1);
        Contact contact = contactList.get(index);

        String name = InputCollector.getUserInput("Enter name:", false);
        if (!name.equals("")) contact.setMyName(name);

        String mobile = InputCollector.getPhoneNumber("Enter phone number (mobile):", false);
        if (!mobile.equals("")) contact.setMobile(mobile);

        String work = InputCollector.getPhoneNumber("Enter phone number (work):", false);
        if (!work.equals("")) contact.setWorkPhone(work);

        String home = InputCollector.getPhoneNumber("Enter phone number (home):", false);
        if (!home.equals("")) contact.setHomePhone(home);

        String city = InputCollector.getUserInput("Enter city:", false);
        if (!city.equals("")) contact.setCityName(city);

        System.out.print("Successfully update " + contact);
    }

}
