public class Priest extends Protagonist{
    private String name;
    private int mana;
    /*
    constructor */
    public Priest(String nick){
	name = "Priest " + nick;
	health = 500;
	strength = 30;
	defense = 35;
	mana = 20;
	rating = .5;
    }
    public void holyHealing(){
	if ((mana - 5) > 0){
	    mana -= 5;
	    health += 100;
	}
	else System.out.println("Low mana!");
    }

    public String toString(){
	return "Priest " + name + " at your service! Here for all your holy healing needs. With a health of " + health + " a mana of " + mana + " they're not an easy one to bring down. Good luck!";
}
	
	
  
