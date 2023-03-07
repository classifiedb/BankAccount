package bank.analysis;

// import java.util.Scanner;
import java.io.*;
// import java.util.ArrayList;

public class accountAnalysis
{
    private String accountDB;
    // linkedlist of account_node
    private account_list newList; 
    
    public accountAnalysis(String accountDB){
        this.accountDB = accountDB;
        //newList will not be inialized here because each method uses different order of lists
    }
    
    public void searchAccount() throws IOException{
        /*
        (1) Call constructor of account_list to initialize newList
        (2) Open file accountDB
        (3) Read all accounts in file. For every account,
                create an instance of account_node
                insert account_node into Linkedlist through calling method 
                    insert_to_front() of newList.
        (4) Close file stream (Scanner)
        (5) Ask user to enter an account number
        (5) Call searchNode() method of newList with parameter of
            user entered account number
        */

    }
    
    public void displayAccountsIncreasing() throws IOException{
        /*
        (1) Call constructor of account_list to initialize newList
        (2) Open file accountDB
        (3) Read all accounts in file. For every account,
                create an instance of account_node
                insert account_node into Linkedlist through calling method 
                    insert_increasing_actnum() of newList.
        (4) Close file stream (Scanner)
        (5) Call showNodes() method of newList 
        */
    }
    
    public void displayAccountsDecreasing() throws IOException{
        /*
        (1) Call constructor of account_list to initialize newList
        (2) Open file accountDB
        (3) Read all accounts in file. For every account,
                create an instance of account_node
                insert account_node into Linkedlist through calling method 
                    insert_decreasing_balance() of newList.
        (4) Close file stream (Scanner)
        (5) Call showNodes() method of newList 
        */

    }
}