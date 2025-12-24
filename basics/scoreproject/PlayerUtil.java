package scoreproject;
import java.util.ArrayList;

import java.util.Iterator;
public  class PlayerUtil {

    static ArrayList<Player> players = new ArrayList<>();

    public static void createPlayer(String name , String role){
         players.add(new Player(name, role));
    }

    public static void displayPlayer(){

        Iterator<Player> iterator=players.iterator();
        while (iterator.hasNext()) {
        Player item = iterator.next();
         System.out.println(item.playerInfo());
        }
    }

    public static void addRun(int score, int ID){
        for(Player player : players){
            if(player.getID() == ID){
                player.setRun(score);
            }
        }
    }
}