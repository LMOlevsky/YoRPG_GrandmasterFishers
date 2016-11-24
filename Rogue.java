//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Rogue extends Pc{

    //constructors

    //initialize all attributes
    public Rogue(){
	name = "Nobody";
	hp = 50;
	strength = 200;
	defense = 20;
	offense = 1.0;
    }
    //init. all attributes and rename warrior
    public Rogue(String newName){
	this();
	name = newName;
    }
    
    public String about(){
	return "\nRogue prefers to attack when their opponent is least aware. They also can steal properties from their opponents.";
    }
    
}
