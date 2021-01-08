package Resources;

public class Card {
    private final long CardNo;
    private final int cvv;
    private final int pin;

    public Card(long CardNo, int cvv, int pin){
        this.CardNo=CardNo;
        this.cvv=cvv;
        this.pin=pin;
    }

    public long getCardNo() {
        return CardNo;
    }

    public int getCvv() {
        return cvv;
    }

    public int getPin() {
        return pin;
    }
}
