//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public abstract class Pc extends Character{

    //instance variables
    
    //Give Pc 10 inventory spaces
    public Item empty = new Item(); //An empty item object
    //Initialize player with a potion that heals 25 hp.
    public Item[] _inventory = {new Potion( "hp", 25 ), empty, empty, empty, empty, empty, empty, empty, empty, empty}; 


    public boolean useItem(int i){
	Item item = _inventory[i];
	boolean retBool=false;
        if ( item.toString() == "Potion" ){	    
	    //typecast to class Potion to use usedBy() method
	    retBool = ((Potion)item).usedBy(this);
	    _inventory[i] = empty;
	}
	else if ( item.toString() == "Empty" ){
	    System.out.println("Not a valid item.");
	}
	return retBool;
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
    
    public abstract String about();
}
