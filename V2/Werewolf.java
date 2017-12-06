public class Werewolf extends Monster{
    private int awoo;

    public Werewolf(int power){
	health = 60;
	rating = .4;
	defense= 50;
	strength= 70;
	awoo = 500;
    }

    public void howl(Protagonist mike){
	d = awoo * rating + strength;
	d -= mike.defense;
	health = d;
    }

    public string toString(){
	return "This monster is a werewolf. It has a health of "+health+" and an
attack rating of "+ rating+". It has the special attribute of awoo, which equals"+awoo+"! Watch out y'all!";
}
