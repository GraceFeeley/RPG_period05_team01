public class Demon extends Monster{
    private int scythe;
    
    public Demon(int scythe1){
		health = 80;
		strength = 50;
		defense = 45;
		scythe = scythe1;
		rating = 0.7;
    }
    
    public void attack(Angel n){
		health=(int)((scythe * strength * rating) - n.getDefense()); 
		if (health < 10)
			System.out.println ("Great! Keep going! Monster almost down");
	}
	
	public String toString(){
		return "The health of this Demon is " + health + ". The weapon it is using is a scythe" +
			". The power on the scythe is " + scythe + ". The rating of this Demon is " + rating + ". Good luck!";
	}
}