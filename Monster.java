//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Monster extends Character{
    
    // initialize all attributes
    public Monster(){
	hp = 150;
	defense = 20;
	offense = 1;
	//set strength to random int in range [20,65)
	strength = (int)(Math.random() * 45 + 20);
	exp = (int)(Math.random() * 1000);
    }
    
    public String about(){
	return  "\nMonsters are NPCs that spread all over the map. Killing them can gain experience and golds and weapons.";
    }
    
    public void normalize(){
	defense = 40;
	offense = 0.4;
    }
    public void specialize(){
	defense = 20;
	offense = 0.8;
    }
}
