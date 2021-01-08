package Resources;

import java.util.Scanner;

public class Person {
    private String FirstName;
    private String LastName;
    private String Sex;
    private long CNP;
    private Account Account1;

    public Person(String FirstName, String LastName, String Sex, long CNP , Account Account1 ){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Sex=Sex;
        this.CNP=CNP;
    }

    public void SetAccount(Account Account){
        this.Account1=Account;
    }

    public String GetFullName(){
      return FirstName + " "+ LastName ;
    }
}
