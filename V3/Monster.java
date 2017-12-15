public class Monster extends Character {
    public Monster() {
        health = 250;
        strength = (int)(20 + 40 * Math.random());
        defense = 40;
        rating = 0.3;
     }
    public String toString(){
	return "Ahh run away from the monster! It has a health of "+health+", a strength of "+strength+", a defense of "+defense+", and a rating of "+rating+".";
}
