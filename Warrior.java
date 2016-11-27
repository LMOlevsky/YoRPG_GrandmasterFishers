//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Warrior extends Pc{

    //constructors

    //initialize all attributes
    public Warrior(){
	name = "Nobody";
	hp = 125;
	strength = 100;
	defense = 40;
	offense = 0.4;
	lv = 1;
	exp = 0;
	maxExp = 100;
    }
    //init. all attributes and rename warrior
    public Warrior(String newName){
	this();
	name = newName;
    }

    
    
    public String about(){
	return "\nWarriors are melee specialists wielding close range weaponry and good at fighting enemies in head-to-head combat.";
    }
    
}
