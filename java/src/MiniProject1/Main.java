package MiniProject1;


public class Main {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        while (true) {
            mainMenu();

            int userOption = InputCollector.getUserInputAsInt("Enter your option :", 1, 5);

            switch(userOption) {
                case 1:   // list all contacts
                    if (!contactList.isEmpty()) contactList.showAllContacts();
                    break;
                case 2:   // add a new contact
                    contactList.addContact();
                    break;
                case 3:   // remove a contact
                    if (!contactList.isEmpty()) {
                        contactList.showAllContacts();
                        contactList.removeContact();
                    }
                    break;
                case 4:   // update a contact
                    if (!contactList.isEmpty()) {
                        contactList.showAllContacts();
                        contactList.updateContact();
                    }
                    break;
                case 5:   // quit
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("-- Invalid input -- Please enter the number between 1 to 5.");
            }
        }
    }


    public static void mainMenu() {
        String[] choice = {"List all Contacts", "Add new Contact",
                "Remove Contact", "Update Contact", "Quit"};

        System.out.println();
        System.out.println("+-- * Contact  App * --+");
        for (int i = 0; i < 5; i++) {
            System.out.printf("| %d. %-17s |\n", i + 1, choice[i]);
        }
        System.out.println("+----------------------+");
    }

}
