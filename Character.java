//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Character{

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
    public void specialize(){
	defense -= 20;
	offense += 0.4;
    }
    //prepares warrior to perform a normal attack
    //change deffense to default
    //change offense to default
    public void normalize(){
	defense = 40;
	offense = 0.4;
    }

    public static String about(String role){
	String str = "Role: ";
	str += role;
	if (role.equals("Warrior")){
	    str += "\nWarriors are melee specialists wielding close range weaponry and good at fighting enemies in head-to-head combat.";
	}
	if (role.equals("Monster")){
	    str += "\nMonsters are NPCs that spread all over the map. Killing them can gain experience and golds and weapons.";
	}
	if (role.equals("Mage")){
	    str += "\nMage is a Glass Cannon, blasting away at long range, but easily taken down at close range.";
	}
	if (role.equals("Rogue")){
	    str += "\nRogue prefers to attack when their opponent is least aware. They also can steal properties from their opponents.";
	}
	if (role.equals("Archer")){
	    str += "\nArchers are range weaponry that can also put down traps and have a pet to assist them.";
	}
	if (role.equals("Healer")){
	    str += "\nHealers are a type of Mage that almost deal zero damage but instead they can help their teammates to regain hp.";
	}
	return str;
    }
}
