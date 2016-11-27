//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Archer extends Pc{

    //constructors

    //initialize all attributes
    public Archer(){
	name = "Nobody";
	hp = 50;
	strength = 200;
	defense = 20;
	offense = 1.0;
	lv = 1;
	exp = 0;
	maxExp = 100;
	money = 100;
    }
    //init. all attributes and rename archer
    public Archer(String newName){
	this();
	name = newName;
    }

    //about this character
    public String about(){
	return "\nArchers are range weaponry that can also put down traps and have a pet to assist them.";
    }
    
    
}
