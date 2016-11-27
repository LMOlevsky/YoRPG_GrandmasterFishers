//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Mage extends Pc{

    //constructors

    //initialize all attributes
    public Mage(){
	name = "Nobody";
	hp = 60;
	strength = 200;
	defense = 20;
	offense = 1.0;
	money = 100;
    }
    //init. all attributes and rename warrior
    public Mage(String newName){
	this();
	name = newName;
    }

    public String about(){
       return "\nMage is a Glass Cannon, blasting away at long range, but easily taken down at close range.";
    }
    
}
