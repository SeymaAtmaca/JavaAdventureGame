package JavaOOPOyun;
import java.util.Scanner;

public class Game{
    private Scanner input = new Scanner(System.in);
    public Game(){

    }

    public void start(){
        
        System.out.println("Please enter a name : ");
        String playerName = input.nextLine();
        System.out.println("Welcome " + playerName + " 😈😈😈");
        Player player = new Player(playerName);
        player.setCharacter();

    }
}