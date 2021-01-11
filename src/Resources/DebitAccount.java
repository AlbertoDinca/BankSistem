package Resources;
import java.util.Currency;
public class DebitAccount extends Account {
    private Card Card1;
    public DebitAccount(long Iban, String Currency, Card Card1) {
        super(Iban, Currency);
        this.Card1 = Card1;
    }

    public void setCard1(Card card1) {
        Card1 = card1;
    }

    public void Transfer(double Sum, Account Account){
        if (super.GetBalance() < Sum){
            System.out.println("Insufficient Funds");
        }else if(!super.GetCurrency().equals(Account.GetCurrency())){
            System.out.println("The accounts have different currencies");
        }
        else {
            super.withdraw(Sum);
            Account.deposit(Sum);
        }
    }

}
