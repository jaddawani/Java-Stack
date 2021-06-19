public class HumanTest{

public static void main(String[] args){

Human jad = new Human();
Human lana = new Human();
Ninja ghazal = new Ninja();
Samurai sonokrot = new Samurai();
Wizard kalb = new Wizard();
jad.attack(lana,jad);
System.out.println(jad.health);
ghazal.steal(ghazal , jad);
System.out.println(ghazal.health);
kalb.fireball(kalb , lana);
System.out.println(lana.health);


}



}