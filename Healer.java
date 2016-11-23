//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Healer extends Character{

    //constructors

    //initialize all attributes
    public Healer(){
	name = "Nobody";
	hp = 50;
	strength = 200;
	defense = 20;
	offense = 1.0;
    }
    //init. all attributes and rename warrior
    public Healer(String newName){
	this();
	name = newName;
    }

    //reset player stats for a normal attack
    public void normalize(){
	defense = 40;
	offense = 0.4;
    }

    //Lower defense and raise offense for a special attack
    public void specialize(){
	defense -= 20;
	offense += 0.4;
    }
    
}
