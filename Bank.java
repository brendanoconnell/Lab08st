
// Lab08st.java
// The Deluxe Bank Class
// This is the driving file for the Bank class used in Lab 08.
// The only changes you make to this file are removing comments for 
// the 90, 100 and 110 point versions.
// The file Bank.java is where all of the actual work is done.

public class Bank
{
    private double checkingBal;
    private double savingsBal;
    private String name;

    public Bank()
    {
        name = "...b.l.a.n.k...";
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n)
    {
        name = n;
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n, double c)
    {
        name = n;
        checkingBal = c;
        savingsBal = 0.0;
    }    
    
    public Bank(String n, double c, double s)
    {
        name = n;
        checkingBal = c;
        savingsBal  = s;
    }

    public double getChecking()
    {
        return checkingBal;
    }

    public double getSavings()
    {
        return savingsBal;
    }

    public double getCombined()
    {
        return checkingBal + savingsBal;
    }

    public void checkingDeposit(double amount)
    {
        checkingBal += amount;
    }

    public void savingsDeposit(double amount)
    {
        savingsBal += amount;
    }

    public void checkingWithdrawal(double amount)
    {
        if(amount <= checkingBal){
            checkingBal -= amount;
        } 
        else if(amount > checkingBal){
            System.out.println("Insufficient Funds");
        }
    }    
    
    public void savingsWithdrawal (double amount)
    {
        savingsBal -= amount;
    }    
    public void transferToChecking (double amount)
    {
        if (amount <= savingsBal)
        {
            savingsBal -= amount;
            checkingBal += amount;
        }
        else if (amount > savingsBal)
        {
            System.out.println("Insufficient Funds");
        }
    }    
    
     public void transferToSavings (double amount)
    {
        if (amount <= checkingBal)
        {
            savingsBal += amount;
            checkingBal -= amount;
        }
        else if (amount > checkingBal)
        {
            System.out.println("Insufficient Funds");
        }
    }    
    
    public void closeChecking()
    {
        checkingBal = 0;
    }

    public void closeSavings()
    {
        savingsBal = 0;
    }

    public void showBalances()
    {
        System.out.println();
        System.out.println("Account balances for " + name);
        System.out.println("Checking: $" + getChecking());
        System.out.println("Savings:  $" + getSavings());
        System.out.println("Combined: $" + getCombined());
        System.out.println();
    }
}

