public class PhonebookManager {
    private ListNode head;

    public PhonebookManager() {
        head = null;
    }

    public void addEntry(String name, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(name, address, city, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println();
            current = current.next;
        }
    }

    public void sortAlphabetically() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            ListNode current = head;
            ListNode prev = null;
            ListNode next = head.next;

            while (next != null) {
                if (current.name.compareTo(next.name) > 0) {
                    swapped = true;
                    if (prev == null) {
                        ListNode temp = next.next;
                        next.next = current;
                        current.next = temp;
                        head = next;
                        prev = next;
                    } else {
                        ListNode temp = next.next;
                        next.next = current;
                        current.next = temp;
                        prev.next = next;
                        prev = next;
                    }
                } else {
                    prev = current;
                    current = next;
                }
                next = current.next;
            }
        } while (swapped);
    }
}