package Game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Card implements CardGameInterface{
    @Override
    public int numOfPlayers() {
        //allows the user to enter the number of players in the game
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please Enter the number of players: ");

        int numOfPlayers = myObj.nextInt();
        myObj.close();
        return numOfPlayers;
    }

    @Override
    public ArrayList<Integer> inputPack(int numOfPlayers) {
        ArrayList<Integer> pack = new ArrayList<Integer>();
        //allows the user to input the pack file into the game
        //pack would be of size 0, numOfPlayers would be already entered by the user, the while loop will run until pack is valid
        while (pack.size() != numOfPlayers*8) {
            pack.clear();
            Scanner scan = new Scanner(System.in);
            System.out.print("Please Enter location of pack to load: ");
            String location = scan.nextLine();
            scan.close();
            try {
                File fileObj = new File(location);
                Scanner myReader = new Scanner(fileObj);
                while (myReader.hasNextInt()){
                    pack.add(myReader.nextInt());

                }
                myReader.close();
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        return pack;
        

    }
}
