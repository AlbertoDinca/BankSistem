package Resources;

public class EconomyAccount extends Account {
    public EconomyAccount(long Iban) {
        super(Iban, "RON");
    }

    @Override
    public void deposit(double amount){
        System.out.println("Deposit in economy acc");
       double interest = 0;
        if (amount > 100) {
            interest = (amount * 0.1);
        }
        else if (amount <0) {
        System.out.println("You can't deposit negative numbers");
        amount = 0;
        }
        else if (amount <= 100){
            interest = (amount * 0.05);
        }
        amount += interest;
        super.deposit(amount);
        }
    }



