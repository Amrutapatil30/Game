package game;
import java.util.*;

public class Player {
  String name;
  int guess;
  
  Player(String name){
	  this.name=name;
  }
  Scanner scn=new Scanner(System.in);
  
  void makeGuess() {
	  System.out.println(name + " guessed "+guess);
	  guess=(int)(Math.random()*10);
  }
}
