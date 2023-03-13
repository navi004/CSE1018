//java program to create sword tournament
import java.util.*;
public class Main {
  //initalizing the instance variables
    int piercingDamage,slashDamage,playerXP;
    String swordName;
  //creating constructors with parameter
      Main(String swordName) {
       //refer the instance variable to intialized variable
        this.swordName = swordName;           
    }
    //creaate a function to start the game
    public static void startTheGame() {
        System.out.println("Start The Game");
    }
    //method to attack
    public void attack(Main opponent) {
        System.out.println("Player Attacked Using:"+swordName);
                  // decreasing the player 2 XP for player1 attack
          opponent.playerXP = opponent.playerXP-piercingDamage;
    }
    //method to parry
    public void parry(Main opponent) {
        System.out.println("Player Parried Using:"+swordName);
                  // decreaing the player1 XP due to player2 parry
        opponent.playerXP = opponent.playerXP-slashDamage;
    }
    //method to get the features of the players
    public void getWeaponFeatures(int a,int b,int c) {
        piercingDamage = a;
        slashDamage = b;
        playerXP = c;
    }
    //function to end the game
    public static void endTheGame() {
        System.out.println("GAME OVER");
    }
    //method to get the game summary
    public void getGameSummary(){
        System.out.println("Sword Name:"+swordName+"\nPiercing Damage:"+piercingDamage+"\nSlash Damage:"+slashDamage+"\nPlayer XP:"+playerXP);
    }
  // main method
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String sName = input.nextLine();
            //create two objects for two players
            Main player1 = new Main(sName);   //assinging inputs to constructors
            sName = input.nextLine();
            Main player2 = new Main(sName);
          //calling the start the game method
            startTheGame();
          // taking input values of player 1 features
            player1.piercingDamage = input.nextInt();
            player1.slashDamage = input.nextInt();
            player1.playerXP = input.nextInt();
          // calling the get weapon features method with input values of player 1
            player1.getWeaponFeatures(player1.piercingDamage,player1.slashDamage,player1.playerXP);
           // taking input values of player 2 features
            player2.piercingDamage = input.nextInt();
            player2.slashDamage = input.nextInt();
            player2.playerXP = input.nextInt();
          // calling the get weapon features method with input values of player 2
            player2.getWeaponFeatures(player2.piercingDamage,player2.slashDamage,player2.playerXP);
          // calling the attack method 
            player1.attack(player2);
                  // decreasing the player 2 XP for player1 attack
                  //player2.playerXP = player2.playerXP-player1.piercingDamage;
          // calling the parry method
            player2.parry(player1);
                  // decreaing the player1 XP due to player2 parry
                  //player1.playerXP = player1.playerXP-player2.slashDamage;
          // calling the end function
            endTheGame();
            
          //printing the game summary of two players
            System.out.println("***GAME SUMMARY***");
            player1.getGameSummary();
            player2.getGameSummary();
            
          // checking the winner by means of more XP
            if(player1.playerXP>player2.playerXP) {
                System.out.println("Player 1 is Winner");
            }
            else if(player1.playerXP<player2.playerXP){
                System.out.println("Player2 is Winner");
            }
            else {
              System.out.println("TIE");
            }
        }

    }
