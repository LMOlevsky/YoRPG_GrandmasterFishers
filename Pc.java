//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public abstract class Pc extends Character{

    //instance variables
    
    //Give Pc 10 inventory spaces
	public Item empty = new Item(); //An empty item object
    //Initialize player 2 potions and the rest empty
    public Item[] _inventory = {new Potion(), new Potion(), empty, empty, empty, empty, empty, empty, empty, empty}; 


    public boolean useItem(int i){
	Item item=_inventory[i];
	boolean retBool=false;
        if ( item.toString() == "Potion" ){	    
	    //typecast to class Potion to use usedBy() method
	    retBool = ((Potion)item).usedBy(this);
	    if (item.getQuantity() == 0){
		_inventory[i]=empty;
	    }
	}
	/* example for potential Armor item,
	   else if ( item.toString() == "Armor"){
	   defense+=20;
	   retBool=true;
	   }
	*/
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

    public int findEmpty(){
	int i = 0;
	if(_inventory[_inventory.length - 1] != empty){
	    return -1;}
	while(_inventory[i] != empty){
	    i++;
	}
	return i;
    }

    public void addPotion(){
	_inventory[findEmpty()] = new Potion();
    }

    public String buyPotion(){
	if(findEmpty() != -1 && money >= 50){
	    money -= 50;
	    addPotion();
	    return "You bought a potion";
	}
	return "Insufficient funds or your inventory is full";
    }
}
