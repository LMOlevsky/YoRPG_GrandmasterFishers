//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public abstract class Pc extends Character{

    //Give Pc 10 inventory spaces
    Item[] inventory = new Item[10];
    
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
    
    public abstract String about();
}
