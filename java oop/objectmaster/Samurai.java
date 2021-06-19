 public class Samurai extends Human{


    int health= 200;
    static int numSam =0;

    public Samurai() {
        numSam++;
    }
    public void deathBlow(Human attacker , Human attacked){

        attacked.health = 0;
        this.health -= this.health * 0.5;

    }

    public void meditate(){

        this.health+=this.health*0.5;
    }
    
    public int howMany(){

        return numSam;


   }
 }
