 public class Wizard extends Human{

       int health = 50;
       int intelligence = 8;
       public void heal(Human attacker , Human attacked) {
        attacked.health += attacker.intelligence;
    }
     public void fireball(Human attacker , Human attacked) {
        attacked.health -= attacker.intelligence*3;
    }

   }