public class Ninja extends Human{

       int stealth = 10;
       public void steal(Human attacker , Human attacked) {
        attacked.health -= attacker.stealth;
        attacker.health+=attacker.stealth;
    }

     public void runaway(Human attacke) {
         this.health -= 10;

     

   }

}
