package paskaita18_10.blackJack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<>();

    public void addCard( Card card ){
        hand.add( card );
    }

    public void printHand(){
        hand.forEach( System.out::print );
        System.out.println( "\nHand Value: " + calcHandSum() );
    }

    public int calcHandSum(){
        int temp = 0;
        int ace = 0;

        for (Card card: hand ) {
            temp += card.getValue();
            if( card.isAce() ){
                ace++;
            }
        }
        if( temp > 21 && ace > 0 ){
            while( temp > 22 && ace > 0 ){
                temp -= 10;
                ace--;
            }
        }
        return temp;
    }

    public boolean checkIfBusted() {
        if( calcHandSum() > 21 ){
            return true;
        }
        return false;
    }
}
