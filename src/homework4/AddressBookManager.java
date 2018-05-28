
import java.util.Scanner;

import java.util.Map;

import java.util.HashMap;

class AddressBook {

    private String name;

    private String phone;

    public AddressBook(String name, String phone) {

        this.name = name;

        this.phone = phone;

    }
    public boolean isSame(String name) {

        return this.name.equals(name);

    }

    public String toString() {

        return String.format("%s(%s)", name, phone);
    }




public class AddressBookManager {


    private Map<String, String> books = null;


    public AddressBookManager() {

        //Implement to create books HashMap
        Map<String, String> books = new HashMap<String, String>();


    }

    public void add(String name, String phone) {

        //Implement to create AddressBook and add into books
        books.put(name, phone);


    }


    public void remove(String name) {


        String string = books.remove(name);
        String s = books.get(name);
        System.out.println("(" + name + "," + phone + ")");


        return;
    }

    public void printAll(int count, AddressBook [] books) {


        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());

        }

    }
        public AddressBook findByName (String name, int count, AddressBook [] books ){



            AddressBook books = null;
            for (int i = 0; i < count; i++) {
                if ( books[i].isSame(name) == true) {
                    books = books[i];
                    break;
                }
            }

            return books;

        }

    }

    public static void showMenu() {

        System.out.println("===== Menu =====");

        System.out.println("1. Add Address");

        System.out.println("2. PrintAll");

        System.out.println("3. Find By Name");

        System.out.println("4. Remove By Name");

        System.out.println("5. Quit");

    }


    public static int getMenu(Scanner sc) {

        return Integer.parseInt(sc.nextLine().trim());


}

        public static void main(String []args) {

            Scanner sc = new Scanner(System.in);

            int count = 0;



            AddressBookManager bookManager = new AddressBookManager();



            while(true) {

                showMenu();

                int menu = getMenu(sc);

                if (menu == 1) {

                    String name = sc.nextLine();

                    String phone = sc.nextLine();

                    bookManager.add(name, phone);

                } else if (menu == 2) {

                    bookManager.printAll();

                } else if (menu == 3) {

                    String name = sc.nextLine();

                    AddressBook book = bookManager.findByName(name);

                    if (book != null) {

                        System.out.println("Find: " + book.toString());

                    } else {

                        System.out.println("There is no address : " + name);

                    }

                } else if (menu == 4) {

                    String name = sc.nextLine();

                    AddressBook books = AddressBookManager.remove(name);

                    if (books != null) {

                        System.out.println("Delete: " + books.toString());

                    } else {

                        System.out.println("There is no address : " + name);

                    }

                } else if (menu == 5) {

                    break;

                }

            }

        }

    }
}
