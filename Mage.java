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
<<<<<<< HEAD
	lv = 1;
	exp = 0;
	maxExp = 100;
=======
	money = 100;
>>>>>>> 80d88c3be2604be67b2a82ea0315e1def98fa6f1
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
