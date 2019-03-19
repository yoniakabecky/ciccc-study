package MiniProject1;


public class Driver {
    public static void main(String[] args) {

        while (true) {
            showMainMenu();
            firstChoice();
        }

    }

    public static void showMainMenu() {
        String[] mainMenu = {"List all Contacts", "Add new Contact",
                "Remove Contact", "Update Contact", "Quit"};

        System.out.println("+-- * Contact  App * --+");
        for (int i = 0; i < 5; i++) {
            System.out.printf("| %d. %-17s |\n", i+1, mainMenu[i]);
        }
        System.out.println("+----------------------+");

    }

    public static void firstChoice() {
        String userOption = InputCollector.getUserInput("Enter your option :");
        doSomething(userOption);
    }



    public  void doSomething(String userOption) {
        switch(userOption) {
            case "1":   // list all contacts
                contactList.ShowAllContacts();
                break;
            case "2":   // add new
                String userName = InputCollector.getUserInput("Enter name :");
                String userMobile = InputCollector.getUserInput("Enter phone number (mobile) :");
                String workPhone = InputCollector.getUserInput("Enter phone number (work) :");
                String homePhone = InputCollector.getUserInput("Enter phone number (home) :");
                String userCity = InputCollector.getUserInput("Enter city:");
                Contact c = new Contact(userName, userMobile, workPhone, homePhone, userCity);
                contactList.AddContact(c);
                break;
            case "3":   // remove
                contactList.RemoveContact();
                break;
            case "4":   // update
                contactList.UpdateContact();
                break;
            case "5":   // quit
                System.out.println("Bye!");
                System.exit(0);
            default :
                System.out.println("Invalid input. Please enter the number between 1 to 5.");
                firstChoice();

        }


    }


}
