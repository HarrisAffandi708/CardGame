import Game.Card;
import Game.CardGameInterface;

public class CardGame {
    public static void main(String[] args){
        CardGameInterface game1 = new Card();
        int x = game1.numOfPlayers();
        game1.inputPack(x);
    }    
}
