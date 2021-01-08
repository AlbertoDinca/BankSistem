package Resources;

public class Account {
    private long Iban;
    private double Balance;
    private String Currency;
    private Card Card1;

    public Account(long Iban, String Currency, Card Card1){
        this.Iban= Iban;
        this.Currency=Currency;
        this.Balance=0;
    }

    public void SetCard(Card Card1){
        this.Card1 = Card1;
    }

    public long GetIban(){
        return Iban;
    }

    public void deposit(double amount){
        Balance += amount;
    }

    public void withdraw(double amount){
        Balance -= amount;
    }

    public double GetBalance(){
        return Balance;
    }
    public String GetCurrency(){
        return Currency;
    }
}
