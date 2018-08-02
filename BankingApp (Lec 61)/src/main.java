/*
You job is to create a simple banking application.

There should be a Bank class

It should have an arraylist of Branches

Each Branch should have an arraylist of Customers

The Customer class should have an arraylist of Doubles (transactions)

Customer:
Name, and the ArrayList of doubles.

Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transactions for that customer/branch

Bank:
Add a new branch
Add a customer to that branch with initial transaction
Add a transaction for an existing customer for that branch
Show a list of customers for a particular branch and optionally a list
of their transactions

Demonstration autoboxing and unboxing in your code
Hint: Transactions
Add data validation.
e.g. check if exists, or does not exist, etc.
Think about where you are adding the code to perform certain actions
*/


import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank arrayList = new Bank();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;

        displayHome();
        while (!quit){
            System.out.print("\nEnter command: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    displayHome();
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContactList();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    processArrayList();
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void displayHome(){
        System.out.println("\t===================================");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Display options");
        System.out.println("\t 1 - Sign in as: Customer");
        System.out.println("\t 2 -             Branch");
        System.out.println("\t 3 -             Bank");
        System.out.println("\t 4 - Exit application");
        System.out.println("\n\t===================================");
    }

    public static void displayCustomerLogin(){
        System.out.println("\t===================================");
        System.out.println("\n\t    --Customer Login--");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Sign in");
        System.out.println("\t 1 - Create new account");
        System.out.println("\t 2 - Return home");
        System.out.println("\n\t===================================");
    }

    public static void displayCustomerHome(){
        System.out.println("\t===================================");
        System.out.println("\n\t    --Customer Home--");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Display options");
        System.out.println("\t 1 - View balance");
        System.out.println("\t 2 - Deposit");
        System.out.println("\t 3 - Withdraw");
        System.out.println("\t 4 - Return home");
        System.out.println("\n\t===================================");
    }

    public static void displayBranchLogin(){
        System.out.println("\t===================================");
        System.out.println("\n\t    --Branch Login--");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Sign in");
        System.out.println("\t 1 - Create new account");
        System.out.println("\t 2 - Return home");
        System.out.println("\n\t===================================");
    }

    public static void displayBranchHome(){
        System.out.println("\t===================================");
        System.out.println("\n\t    --Branch Home--");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Display options");
        System.out.println("\t 1 - View all customers");
        System.out.println("\t 2 - Add customer");
        System.out.println("\t 3 - Remove customer");
        System.out.println("\t 4 - Deposit to customer");
        System.out.println("\t 5 - Withdraw from customer");
        System.out.println("\t 6 - View customer transaction history");
        System.out.println("\t 7 - Return home");
        System.out.println("\n\t===================================");
    }

    public static void displayBankHome(){
        System.out.println("\t===================================");
        System.out.println("\n\t    --Bank Home--");
        System.out.println("\n\tSelect from the following options");
        System.out.println("\t 0 - Display options");
        System.out.println("\t 1 - View all branches");
        System.out.println("\t 2 - Add branch");
        System.out.println("\t 3 - Remove branch");
        System.out.println("\t 4 - Add new customer to branch");
        System.out.println("\t 5 - View a branches customers (and transaction history)");
        System.out.println("\t 6 - Exit application");
        System.out.println("\n\t===================================");
    }



}
