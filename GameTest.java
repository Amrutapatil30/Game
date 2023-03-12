package game;
import java.util.*;

public class GameTest {
     public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("enter Player1 Name: ");
         String S1=scn.next();
         System.out.println("enter Player2 Name: ");
         String S2=scn.next();
         System.out.println("enter Player3 Name: ");
         String S3=scn.next();
         
    	 Game game=new Game(S1,S2,S3);
    	 game.play();
    	 
     }
	
}
