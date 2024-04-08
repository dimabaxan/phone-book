import java.util.*;

public class Main {
    private static final Map<String, List<String>> phoneBooks = new HashMap<>();

    public static void main(String[] args) {
        addNewContact("Ion", "12564164534");
        addNewContact("Ion", "12564164532");
        addNewContact("Ion", "12564164533");
        addNewContact("Ion", "12564164543");
        addNewContact("Ion", "12564164657");
        addNewContact("Ion", "12564164888");
        addNewContact("Dorin", "4145454545956");
        addNewContact("Dorin", "4145454545956");
        addNewContact("Dorin", "4145454545956");
        addNewContact("Dorin", "4145454545956");
        addNewContact("Vasile", "4145454545956");
        addNewContact("Vasile", "4145454545956");
        addNewContact("Vasile", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");
        addNewContact("Dima", "4145454545956");

        printContacts();
    }

    private static void addNewContact(String name, String phoneNumber) {
        if (phoneBooks.containsKey(name)) {
            phoneBooks.get(name).add(phoneNumber);
        } else {
            phoneBooks.put(name, new ArrayList<>());
            phoneBooks.get(name).add(phoneNumber);
        }
    }

    private static void printContacts() {
        List<Map.Entry<String, List<String>>> entryList = new ArrayList<>(phoneBooks.entrySet());

        entryList.sort(Comparator.comparingInt(entry -> entry.getValue().size()));

        entryList.reversed().forEach(contact -> System.out.println(contact.getKey() + ": " + contact.getValue()));
    }
}