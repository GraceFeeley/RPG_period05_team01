//Base Code from Piazza
public class Protagonist extends Character {
    private String name;

    public Protagonist(String s) {
        name = s;
        health = 250;
        strength = (int)(20 + 45 * Math.random());
        defense = 40;
        rating = 0.4;
    }

    public String getName() {
        return name;
    }

    public void specialize() {
	defense = defense / 2;
	rating = rating * 2 ;
    }

    public void normalize() {
	this.defense = 75;
	this.rating = 0.4;
    }
        }
    public String toString(){
	return "Look it's "+name+"coming to save the day! " +name+" has a health of "+health+", a strength of "+strength+", a defense of "+defense+", and a rating of "+rating+".";

}
