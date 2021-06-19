import java.util.*;

class PuzzlingTest{

    public static void main(String[] args){

        //int[] nums = {3,5,1,2,7,9,8,13,25,32};
        Puzzling ala = new Puzzling();
        //System.out.println(ala.list(nums));
        ///////////////////////////////////////////////////////////
        ArrayList<String> al = new ArrayList<String>();
        String[] array = {"Nancy" , "Jinichi" , "lana" , "ghazal" , "jad"};
        for(String i : array)
        al.add(i);

        System.out.println(ala.women(al));

     

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char i = 'a' ; i <= 'z' ; i++){
            alphabet.add(i);
        }
        ala.shuffling(alphabet);
   
   
    System.out.println(Arrays.toString(ala.numbersAyEshe()));
   
   
   ArrayList<Integer> myArray = ala.numbersAy();
   
   ala.createRandoms();

   ala.generateArray();
   
   }

   

   






}