package bank.analysis;

public class account_node
{
    int actNum;
    String firstname;
    String lastName;
    Double balance;
    account_node next;
	
    // could create a version with node, or the one with the 4 parameter
    
    account_node(int act, String FN, String LN, double b)
    {
        /*
        Assign four parameters to four class attributes;
        Assign null to next
        */
        actNum = act;
        firstname = FN;
        lastName = LN;
        balance = b;
        next = null;
    }

    // constructor that accepts node and creates a copy
    account_node(account_node node){

    }
}
