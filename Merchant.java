public class Merchant extends Npc{

    //what's in shop
    static String[] shop = {"p1", "p2", "t1", "t2"};
    
    //prints out all the items in merchant
    public static void whatHas(){
	for(int i = 0; i < shop.length; i++){
	    if(i != shop.length - 1){
		System.out.print(shop[i] + ", ");
	    }
	    else{
		System.out.print(shop[i]);
	    }
	}
    }

    
    public static void main(String[] args){
	whatHas();
    }
    
}
