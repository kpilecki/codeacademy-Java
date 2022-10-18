package paskaita18_10.blackJack;

public class GM {
    Deck deck = new Deck();
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    UI ui = new UI();
    public void start(){
        deck.shuffle();
        dealerHand.addCard( deck.getNextCard() );
        ui.showCards( dealerHand, "Dealer hand" );
        boolean shouldDealForDealer = dealForPlayer();

        if(shouldDealForDealer){
            dealForDealer();
            chooseWinner();
        }
    }

    private void chooseWinner() {
        if( dealerHand.checkIfBusted() ){
            //Dealer Busted
            ui.sayBusted( "Dealer");
            ui.sayWins( "Player" );
            return;
        }
        ui.sayWins(dealerHand.calcHandSum() > playerHand.calcHandSum() ? "Dealer" : "Player");

    }

    private void dealForDealer() {
        dealerHand.addCard( deck.getNextCard() );
        dealerHand.addCard( deck.getNextCard() );
        ui.showCards( dealerHand, "Dealer hand" );

        while( dealerHand.calcHandSum() <= 16 ){
            dealerHand.addCard( deck.getNextCard() );
            ui.showCards( dealerHand, "Dealer hand" );
        }
    }
    private boolean dealForPlayer(){
        playerHand.addCard( deck.getNextCard() );
        playerHand.addCard( deck.getNextCard() );
        ui.showCards( playerHand , "Player hand");

        boolean shouldContinue = true;
        while ( shouldContinue ){
            shouldContinue = ui.askDecision();

            if( shouldContinue ) {
                playerHand.addCard(deck.getNextCard());
                ui.showCards(playerHand, "Player hand");
            }
            if( playerHand.checkIfBusted() ){
                shouldContinue = false;
                ui.sayBusted( "Player");
                return false;
            }
        }
        return true;
    }
}
