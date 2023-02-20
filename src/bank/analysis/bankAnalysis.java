package bank.analysis;

import java.io.IOException;
import java.util.Scanner;

public class bankAnalysis
{
    private String accountDB;
    private String transactionDB;

    public bankAnalysis(String accountDB, String transactionDB)
    {
        this.accountDB = accountDB;
        this.transactionDB = transactionDB;
    }
	
    public void transactionAnalysis() throws IOException
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean done = false;
        
        transactionAnalysis TA = new transactionAnalysis(transactionDB);
        TA.loadDB();

        while(done == false)
        {
            System.out.println("\n************************************");
            System.out.println("Transaction Analysis menu:");
            System.out.println("************************************");
            System.out.println("Please choose from the following options:");
            System.out.println("1. List all transactions");
            System.out.println("2. List transactions of one account");
            System.out.println("9. Return to the parent menu");

            System.out.print("\nYour choice: ");
            choice = input.nextInt();
          
            if(choice == 1) TA.listAllTransactions();
            else if (choice == 2) TA.listTransactions();
            else if (choice == 9) done = true;
            else  System.out.println("Please enter a valid input!");
        }
    }
	
    public void accountAnalysis() throws IOException
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean done = false;
        
        /*
        Your code goes here:
        Create an instance of accountAnalysis and pass parameter accountDB
        
        */
        accountAnalysis AA = new accountAnalysis(accountDB);

        while(done == false)
        {
            System.out.println("\n************************************");
            System.out.println("Account Analysis menu:");
            System.out.println("************************************");
            System.out.println("Please choose from the following options:");
            System.out.println("1. Search an account");
            System.out.println("2. List accounts in increasing order of account number");
            System.out.println("3. List accounts in decreasing order of balance");
            System.out.println("9. Return to the parent menu");

            System.out.print("\nYour choice: ");
            choice = input.nextInt();

            /*
            Your code goes here:
            Modify the following three lines of code:
            If user picks 1, call method searchAccount()
            If user picks 2, call method displayAccountsIncreasing()
            If user picks 3, call method displayAccountsDecreasing()
            */
            //if(choice == 1) System.out.println("to be done!");
           // else if (choice == 2) System.out.println("to be done!");
            // else if (choice == 3) System.out.println("to be done!");
            if(choice == 1) AA.searchAccount();
            else if(choice == 2) AA.displayAccountsIncreasing();
            else if (choice == 3) AA.displayAccountsDecreasing();
            else if (choice == 9) done = true;
            else  System.out.println("Please enter a valid input!");
        }
    }
}
