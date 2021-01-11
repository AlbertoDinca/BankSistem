package Resources;

public abstract class Account {
    private long Iban;
    private double Balance;
    private String Currency;


    public Account(long Iban, String Currency){
        this.Iban= Iban;
        this.Currency=Currency;
        this.Balance=0;
    }


    public long GetIban(){
        return Iban;
    }

    public void deposit(double amount){
        Balance += amount;
    }

    public void withdraw(double amount){
        if (Balance < amount){
            System.out.println("Insufficient funds");
        }else {
        Balance -= amount;
    }
    }

    public double GetBalance(){
        return Balance;
    }
    public String GetCurrency(){
        return Currency;
    }

}
