package game;

public class Game {
	//Computer Guess
	private int computerGuess;
	
	//Player Guess
   Player p1,p2,p3;
   
   Game(String name1,String name2,String name3){
	   p1=new Player(name1);
	   p2=new Player(name2);
	   p3=new Player(name3);
   }
   
   boolean checkWinner(){
	   if(computerGuess==p1.guess) {
		   System.out.println(p1.name+" Won!!!");
		   return true;
	   }else if(computerGuess==p2.guess) {
		   System.out.println(p2.name+" Won!!!");
		   return true;
	   }
	   else if(computerGuess==p3.guess) {
		   System.out.println(p3.name+" Won!!!");
		   return true;
	   }
	   return false;
   }
   
   void play() {
	   System.out.println("Welcome to Game !!!");
	   computerGuess=(int)(Math.random()*10);
	   System.out.println("Number to guess is : "+computerGuess);
	   
	   while(true) {
	   p1.makeGuess();
	   p2.makeGuess();
	   p3.makeGuess();
	   
	   boolean someHasWon = checkWinner();
	   if(someHasWon) {
		   System.out.println("Game Over!");
		   break;
	   }
	   else {
		   computerGuess=(int)(Math.random()*10);
	   }
	   }
	   
   }
   
}
