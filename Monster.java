//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Monster extends Character{
    
    // initialize all attributes
    public Monster(){
	hp = 150;
	defense = 20;
	offense = 1;
	//set strength to random int in range [20,65)
	strength = (int)(Math.random() * 45 + 20);
    }
   
}
