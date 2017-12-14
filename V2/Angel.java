public class Angel extends Protagonist{
    private String name;
    private int wings;
 
    public Angel(String name1, int wings1){
		name = name1;
		wings = wings1;
		rating = 0.7;
		health = 450;
		strength = 60;
		defense = 50;
    }
    public void healthWarnings(Demon n){
		health=(int)((wings * strength * rating) - n.getDefense()); 
		if (health < 10)
			System.out.println ("Step up your game! Health is low");
    }
	
	public String toString(){
		return "The health of this Angel is " + health + ". The weapon it is using is its own wings" +
			". The power of its wings is " + wings + ". The rating of this Angel is " + rating + ". Good luck!";
	}
}
	