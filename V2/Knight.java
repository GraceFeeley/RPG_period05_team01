public class Knight extends Protagonist{
    private int sword;

    public Knight(String s, int swordStrength){
	name = s;
	health = 400;
	strength = 70;
	defense = 55;
	rating = .9;
	sword = swordStrength;
    }

    public void Slain(Monster raul){
	health = (strength * sword * rating)-raul.defense;
    }

    public string toString(){
	return "If thou doth dares, you can go up against this knight, "+name+". It has the health of "+health+" and the strength of "+strength+". Watch out for his sword!";
}
	
