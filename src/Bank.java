import Resources.*;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Welcome new customer, please register your account");
        System.out.println("Please Enter Your First Name");
        Scanner FirstNameScan = new Scanner(System.in);
        String FirstName = FirstNameScan.nextLine();

        System.out.println("Please Enter Your Last Name");
        Scanner LastNameScan = new Scanner(System.in);
        String LastName = LastNameScan.nextLine();

        System.out.println("Please Enter Your Sex");
        Scanner SexScan = new Scanner(System.in);
        String Sex = SexScan.nextLine();

        System.out.println("Please Enter Your CNP");
        Scanner CNPScan = new Scanner(System.in);
        long CNP = CNPScan.nextLong();

        System.out.println("Please Enter The Currency Of Your Account");
        Scanner CurrencyScan = new Scanner(System.in);
        String Currency= CurrencyScan.nextLine();
        long CardNo = ThreadLocalRandom.current().nextLong(1000000000L, 9999999999L);
        int cvv = ThreadLocalRandom.current().nextInt(100,999);
        int pin = ThreadLocalRandom.current().nextInt(1000, 9999);
        long Iban = ThreadLocalRandom.current().nextLong(10000000,99999999);

        Card Card1Customer1 = new Card(CardNo, cvv, pin);
        DebitAccount AccountCustomer1 = new DebitAccount(Iban, Currency, Card1Customer1 );
        Person Customer1 = new Person(FirstName, LastName, Sex, CNP, AccountCustomer1 );
        AccountCustomer1.deposit(20);
        System.out.println(AccountCustomer1.GetBalance() + " "+ AccountCustomer1.GetCurrency());
        System.out.println("Hello " + Customer1.GetFullName() + " your information has been received");
        System.out.println("Your card number is "+Card1Customer1.getCardNo()+ "\n"
        + "Your CVV is "+ Card1Customer1.getCvv()+"\n"
        +"Your Pin is "+ Card1Customer1.getPin()+"\n"
        +"Your Iban is "+ AccountCustomer1.GetIban()+"\n " +
                "We added 20"+ AccountCustomer1.GetCurrency()+ " to your account as a welcoming gift, enjoy \n" +
                "Current Balance is "+ AccountCustomer1.GetBalance()+ AccountCustomer1.GetCurrency() );


        Card Card1Customer2 = new Card(12547856998L, 254, 6985);
        DebitAccount AccountCustomer2= new DebitAccount(52469875654L,"RON", Card1Customer2);
        Person Customer2 = new Person("Alba", "Iulia", "F", 1254789682L, AccountCustomer2);
        AccountCustomer2.deposit(50);
        System.out.println(AccountCustomer1.GetBalance() + " "+AccountCustomer2.GetBalance());
       AccountCustomer1.Transfer(22, AccountCustomer2);
        System.out.println(AccountCustomer1.GetBalance() + " "+AccountCustomer2.GetBalance());
        AccountCustomer1.withdraw(19);
        System.out.println(AccountCustomer1.GetBalance());

        EconomyAccount Account =  new EconomyAccount(464984646L) ;
        Account.deposit(1000);
        System.out.println(Account.GetBalance());
    }
}
