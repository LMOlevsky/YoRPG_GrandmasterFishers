//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public abstract class Character{

    //instance vars
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected double offense; //attack rating


   public boolean isAlive(){
	return hp > 0;
    }

    //accessors
    public int getDefense(){
	return defense;
    }
    
    public String getName(){
	return name;
    }
    
    //Decreases life attribute by damage
    public void lowerHP(int dmg){
	hp -= dmg;
    }

    public int attack(Character shrek){
	int dmg= (int)(strength * offense) - shrek.getDefense();
	if (dmg < 0){
	    dmg = 0;
	}
	shrek.lowerHP(dmg);
	return dmg;
    }
    //prepares warrior to perform a special attack
    //decreases defense by 20
    //increases offense by .4
    public abstract void specialize();
    public abstract void normalize();

    public abstract String about();
}
