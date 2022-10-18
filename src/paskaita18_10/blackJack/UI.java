package paskaita18_10.blackJack;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner( System.in );

    public void showCards(Hand hand , String prefix ){
        System.out.println( prefix );
        hand.printHand();
    }

    public boolean askDecision(){
        while(true){
            System.out.println( "Next Card? Y/N");
            String input = sc.next().toLowerCase();
            if( input.equals( "y")){
                return true;
            } else if( input.equals( "n" )){
                return false;
            }
        }
    }

    public void sayBusted(String prefix ) {
        System.out.println( prefix + " is Busted!!!" );
    }


    public void sayWins(String str) {
        System.out.println( str + " won!!!" );
    }
}
