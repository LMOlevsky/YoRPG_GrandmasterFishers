//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Warrior extends Character{

    //constructors

    //initialize all attributes
    public Warrior(){
	name = "Nobody";
	hp = 125;
	strength = 100;
	defense = 40;
	offense = 0.4;
    }
    //init. all attributes and rename warrior
    public Warrior(String newName){
	this();
	name = newName;
    }

    public String about(){
	return "\nWarriors are melee specialists wielding close range weaponry and good at fighting enemies in head-to-head combat.";
    }
    
    public void specialize(){
	defense = 20;
	offense = 0.8;
    }
    public void normalize(){
	defense = 40;
	offense = 0.4;
    }
    
}
