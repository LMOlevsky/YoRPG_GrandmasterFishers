//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-20

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
    
}
