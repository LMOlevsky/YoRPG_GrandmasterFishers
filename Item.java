//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

//To be used in inventory of class Pc
public class Item{
    //instance vars
    protected String _type;

    //constructors
    public Item(){
	_type="Empty";
    }

    public Item(String type){
	_type=type;
    }
    
    public String toString(){
	return _type;
    }
    
    public boolean isEqual(Item thing){
	return _type.equals(thing.toString());
    }
    
}
