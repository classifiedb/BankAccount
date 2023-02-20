package bank.analysis;

public class transactionRecord
{
    private int actNumber;
    private char type; //'D' represents deposit; 'W' represents withdrawl 
    private double amount;
    private String time;

    public transactionRecord(int act, char type, double amount, String time)
    {
        this.actNumber = act;
        this.type = type;
        this.amount = amount;
        this.time = time;
    }

    public int getActnum()
    {
        return this.actNumber;
    }

    public char getType()
    {
        return this.type;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public String getTime()
    {
        return time;
    }
}
