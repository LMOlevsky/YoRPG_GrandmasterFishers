//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Potion extends Item{
    //instance variables
    protected String _attribute;
    protected int _strength;
    
    public Potion(){
	_type="Potion";
	_attribute="hp"; //default to healing potion
	_strength=25; //default to heal 25 hp
    }

    public Potion(String attribute, int strength){
	this();
	_attribute=attribute;
	_strength=strength;
    }

    //makes player use potion
    // if successful, returns true
    // returns false otherwise
    public boolean usedBy(Pc player){
	if (_attribute == "hp"){
	    //heal player by dealing negative damage
	    player.lowerHP(-1 * _strength);
	    return true;
	}
	return false;
    }
    
    
}
