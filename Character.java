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
    protected double money;

    public double getMoney(){
	return money;
    }
    
   public boolean isAlive(){
	return hp > 0;
    }

    //accessors
    public int getDefense(){
	return defense;
    }

    public int getHP(){
	return hp;
    }
    
    public String getName(){
	return name;
    }
    
    //Decreases life attribute by damage
    public void lowerHP(int dmg){
	hp -= dmg;
    }

    public int attack(Character opponent){
	int dmg= (int)(strength * offense) - opponent.getDefense();
	if (dmg < 0){
	    dmg = 0;
	}
	opponent.lowerHP(dmg);
	return dmg;
    }

}
