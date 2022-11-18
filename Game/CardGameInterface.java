package Game;
import java.io.Serializable;
import java.util.*;
public interface CardGameInterface extends Serializable {
    int numOfPlayers();
    ArrayList<Integer> inputPack(int numOfPlayers);
}