//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Rogue extends Character{

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
    
}