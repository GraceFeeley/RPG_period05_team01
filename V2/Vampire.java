public class Vampire extends Monster{
    private fangSize;
    
    /*
    constructor */
    public Vampire(int fangs){
	health = 100;
	strength = 50;
	defense = 45;
	fangSize = fangs;
	rating = 1 + fangSize * 1.5;
    }
    
    public int attack(Character c){
    System.out.println("CHOMP!");
    int damage = (int)(strength * rating - c.getDefense());
    c.lowerHP(damage);
    System.out.println("Om nom nom nom!");
    return damage;
  }

    public String toString(){
	return "Uh oh, here's comes a vamp! Look ath those teeth, they're practically " + fangSize + " inches! I wouldn't want to be their next snack, though with a health of " + health + " and a strength of " + strength + " you just might be!!";
}
