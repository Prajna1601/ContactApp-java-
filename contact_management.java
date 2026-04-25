import java.util.*;

public class contact_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<add_contact> contacts = new ArrayList<>();
        while (true) {
            System.out.println(
                    "Select your option:\n1.Add contacts:\n2.Display all contacts\n3.Search contact\n4.Delete contact\n5.Exit\nEnter your option:");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter name and phone number to add:");
                    String n = sc.next();
                    String p = sc.next();
                    contacts.add(new add_contact(n, p));
                    System.out.println("Contact added:");
                    break;
                case 2:
                    System.out.println("*****ALL CONTACTS*****");
                    for (add_contact a : contacts) {
                        System.out.println("Name:" + a.name + "\nPhone number:" + a.phone);
                    }
                    break;
                case 3:
                    System.out.println("Entr name to search:");
                    String key = sc.next();
                    int f = 0;
                    for (add_contact b : contacts) {
                        if (b.name.equalsIgnoreCase(key)) {
                            System.out.println("Found!!!\nName:" + b.name + "\nPhone number:" + b.phone);
                            f = 1;
                        }
                    }
                    if (f == 0) {
                        System.out.println("Contact not found!!!");
                    }
                    break;
                case 4:
                    System.out.println("Enter name to delete:");
                    String nametodelete = sc.next();
                    int fn = 0;
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equalsIgnoreCase(nametodelete)) {
                            contacts.remove(i);
                            fn = 1;
                        }
                    }
                    if (fn == 1) {
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found!!!");
                    }
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!!");

            }
        }

    }
}

class add_contact {
    String name;
    String phone;

    add_contact(String na, String ph) {
        this.name = na;
        this.phone = ph;
    }
}
