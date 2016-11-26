//Team Grandmaster Fishers -- Youki Wu, Areef Roktim, Levee Olevsky
//APCS1 pd4
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

//To be used in inventory of class Pc
public class Item{
    //instance vars
    protected String _type;
    protected int _quantity;

    //constructors
    public Item(){
	_type="Empty";
	_quantity=0;
    }

    public Item(String type, int quantity){
	_type=type;
	_quantity=quantity;
    }
    
    
    public String toString(){
	return _type;
    }
    
    public boolean isEqual(Item thing){
	return _type==thing.toString();
    }

    //accessors
    public int getQuantity(){
	return _quantity;
    }
    
}
