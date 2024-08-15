public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebook = new PhonebookManager();

        phonebook.addEntry("John Doe", "123 Maple St", "Bellingham", "555-1234");
        phonebook.addEntry("Jane Smith", "456 Oak St", "Seattle", "555-5678");
        phonebook.addEntry("Alice Johnson", "789 Pine St", "Bellingham", "555-8765");

        System.out.println("Phonebook entries:");
        phonebook.printList();

        System.out.println("Sorted phonebook entries:");
        phonebook.sortAlphabetically();
        phonebook.printList();
    }
}