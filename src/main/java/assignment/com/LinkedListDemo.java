package assignment.com;

import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to LinkedList Data Structures Problems.");

        Scanner sc = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        int choice;
        do {
            System.out.println();
            System.out.println("SIMPLE LINKED LIST OPERATIONS");
            System.out.println("1. INSERT FIRST ELEMENT ");
            System.out.println("2. INSERT LAST ELEMENT");
            System.out.println("3. DISPLAY LIST ");
            System.out.println("4. INSERT AT Nth POSITION ");
            System.out.println("5. DELETE FIRST ELEMENT ");
            System.out.println("6. DELETE LAST ELEMENT ");
            System.out.println("7. SEARCH ELEMENT ");
            System.out.println("8. INSERT AFTER NODE");
            System.out.println("9. DELETE NODE ");
            System.out.println("10. EXIT ");
            System.out.println("Enter the Choice for Operation : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data to Insert at First : ");
                    int dataFirst = sc.nextInt();
                    linkedList.insertFirst(dataFirst);
                    break;
                case 2:
                    System.out.println("Enter the Data to Insert at Last : ");
                    int dataLast = sc.nextInt();
                    linkedList.insertLast(dataLast);
                    break;
                case 3:
                    linkedList.showLinkedList();
                    break;
                case 4:
                    System.out.println("Enter the Data After which to Insert New Data : ");
                    int nthData = sc.nextInt();
                    System.out.println("Enter the Data : ");
                    int data = sc.nextInt();
                    linkedList.insertNthPosition(data, nthData);
                    break;
                case 5:
                    linkedList.pop();
                    System.out.println("After First Node Delete");
                    linkedList.showLinkedList();
                    break;
                case 6:
                    linkedList.popLast();
                    System.out.println("After Last Node Delete");
                    linkedList.showLinkedList();
                    break;
                case 7:
                    System.out.println("Enter the Data to Search within Linked List : ");
                    linkedList.searchNode(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Enter the Data After which to Insert New Data : ");
                    int nthData2 = sc.nextInt();
                    System.out.println("Enter the Data : ");
                    linkedList.insertAtLocation(sc.nextInt(), nthData2);
                    break;
                case 9:
                    System.out.println("Enter the Node to Delete from Linked List : ");
                    linkedList.deleteNode(sc.nextInt());
                    break;
            }
        } while (choice != 10);
    }
}
