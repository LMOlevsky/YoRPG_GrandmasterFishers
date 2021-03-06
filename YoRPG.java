//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Pc pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private String role="";

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	

    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	s = "Choose thy class: ";
	
	while (true) {
	    
	    System.out.println( "\nChoose your role:" );
	    System.out.println( "Enter \"About <role>\" to get information about a role " );
	    System.out.print( "Archer, Healer, Mage, Rogue, Warrior: " );
	    
	    try {
		role = in.readLine();
	    }
	    catch ( IOException e ) { }

	    //instantiate the player's character
	
	    if ( role.equals("Archer") ){
		pat = new Archer(name);
		break;
	    } else if ( role.equals("Healer") ){
		pat = new Healer(name);
		break;
	    } else if ( role.equals("Mage") ){
		pat = new Mage(name);
		break;
	    } else if ( role.equals("Rogue") ){
		pat = new Rogue(name);
		break;
	    } else if ( role.equals("Warrior") ){
		pat = new Warrior(name);
		break;
	    } else if ( role.equals("About Archer") ){
		pat = new Archer(name);
		System.out.println( pat.about() );
	    } else if ( role.equals("About Healer") ){
		pat = new Healer(name);
		System.out.println(pat.about() );
	    } else if ( role.equals("About Mage") ){
		pat = new Mage(name);
		System.out.println(pat.about() );
	    } else if ( role.equals("About Rogue") ){
		pat = new Rogue(name);
		System.out.println(pat.about() );
	    } else if ( role.equals("About Warrior") ){
		pat = new Warrior(name);
		System.out.println(pat.about() );
	    }
	    
	}
	
	

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster(pat.lv);

	    while( smaug.isAlive() && pat.isAlive() ) {

		//Print player health and gold  and enemy health
		System.out.println( "\n" + pat.getName() + " has " + pat.getHP() + " hp and " + pat.getMoney() + " gold.");
		System.out.println( "Yo Olde Monster has " + smaug.getHP() + " hp.");
		
		// Print out user's current inventory
		String s="\nInventory:\n";
		for (int index=0; index < pat._inventory.length; index++){
		    s+="\t(" + index + ") " + pat._inventory[index];
		    if (index==4){ s+="\n"; } //add newline every 5 items
		}
		System.out.println(s);

		
		// Let user use items from their inventory
		boolean usedItem=false;
		//While the player hasn't used an item and has items in their inventory, prompt for player to use item
		while ( pat.hasItem() && !usedItem ){
		    try {
			System.out.print( "Use item (-1 to use no item): " );
			i = Integer.parseInt( in.readLine() );
		    }
		    catch ( IOException e ) { }
		    if (i == -1){ //if player doesnt want to use any items, break
			break;
		    } else {
			usedItem = pat.useItem(i);
		    }
		}
		
		
		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		i=1;
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");
		System.out.println( "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");


		
		
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		pat.exp += smaug.exp;
		while (pat.maxExp < pat.exp){
		    pat.exp -= pat.maxExp;
		    pat.lv += 1;
		    pat.maxExp = pat.lv * 100;
		}
		System.out.println("Your experienec: " + pat.exp
				   + "\nYour level: " + pat.lv);
		//Choice to buy something
		String shop = "";
		try {
		    System.out.println("Current money: " + pat.getMoney());
		    System.out.print("\nWould you like to buy something? (yes/no): ");
		    shop = in.readLine();
		}
		catch ( IOException e ) { }

		if(shop.equals("yes")){
		    String buy = "";
		    try {
			System.out.print("\nWanna buy a potion? (yes/no): ");
			buy = in.readLine();
		    }
		    catch ( IOException e ) { }
		    if(buy.equals("yes")){
			System.out.println(pat.buyPotion());
		    }
		}
		
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...


	//loading...
	YoRPG game = new YoRPG();
 
	int encounters = 0;
	
	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	/*================================================
	  ================================================*/
    }//end main

}//end class YoRPG


