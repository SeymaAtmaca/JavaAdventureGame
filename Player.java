package JavaOOPOyun;
import java.util.Scanner;
public class Player {
    private String playerName;
    
    Scanner input = new Scanner(System.in);
    public Player(String playerName){
        this.playerName = playerName;
    }

    public void setCharacter(){
        GameCharacters[] charList = {new Samurai(), new Artcher(), new Knight()};

        System.out.println("==================================================================");
        System.out.println("Please select a character : ");
        System.out.println("ID          Character       Damage          Healthy         Money");
        for(GameCharacters character : charList){
            System.out.println(character.getId() + " " + character.getName() + " " + character.getDamage()+ " " + character.getHealthy() + " " + character.getMoney());
        }
        System.out.println("==================================================================");

        
        int playerId = input.nextInt();
        System.out.println("Player name : " + playerName + " / Selected chaarcter : " + charList[playerId -1 ].getName() );

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
