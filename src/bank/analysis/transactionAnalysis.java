package bank.analysis;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class transactionAnalysis
{
    private String transactionDB;
    //added <transactionRecord type because of generic type error
    private ArrayList<transactionRecord> transactions;
    
    public transactionAnalysis(String transactionDB)
    {
        this.transactionDB = transactionDB;
        transactions = new ArrayList<transactionRecord>();
    }

    public void loadDB() throws IOException
    {
        File file = new File(transactionDB);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
           int act = inFile.nextInt();
           char type = inFile.next().charAt(0);
           double amount = inFile.nextDouble();
           String time = inFile.nextLine();
           
           transactionRecord t = new transactionRecord(act, type, amount, time);
           transactions.add(t);
        }
        inFile.close();
    }
      
    public void listTransactions()
    {
	Scanner input = new Scanner(System.in);
    // added this line to close input (I was getting a warining input not closed)
    input.close();
	System.out.print("Please enter the account Number: ");
	int actNum = input.nextInt();
		
        for(int i=0; i<transactions.size(); i++)
        {
            transactionRecord t = (transactionRecord)transactions.get(i);

            if(t.getActnum()==actNum)
            {
                System.out.println(t.getActnum() + "\t" + t.getType() + "\t" + t.getAmount() + "\t" + t.getTime());
            }
        }
    }
    
    public void listAllTransactions()
    {	
        for(int i=0; i<transactions.size(); i++)
        {
            transactionRecord t = (transactionRecord)transactions.get(i);
            System.out.println(t.getActnum() + "\t" + t.getType() + "\t" + t.getAmount() + "\t" + t.getTime());
        }
    }
}