import java.util.*;

class Puzzling {

    public ArrayList<Integer> list(int[] nums){
        ArrayList<Integer> jad = new ArrayList<Integer>();
        int sum = 0;
        int y = 10;
        for (int i = 0 ; i<nums.length ; i++){
                sum+=nums[i];
            if (y < nums[i]){
                jad.add(nums[i]);
            }

        }
        System.out.println(sum);
        return jad;
    }
    /////////////////////////////////////////////////////////////////////

    public ArrayList<String> women(ArrayList<String> myArray){

        Collections.shuffle(myArray);
        System.out.println(myArray);
        ArrayList<String> newAl = new ArrayList<String>();
        for(int i=0 ; i<myArray.size(); i++){
            if (myArray.get(i).length() > 5 ){
            newAl.add(myArray.get(i));
            }
        }
        return newAl;
    }


    public void shuffling(ArrayList<Character> jadArray){

        Collections.shuffle(jadArray);
        System.out.println(jadArray);
        System.out.println(jadArray.get(0));
        System.out.println(jadArray.get(jadArray.size()-1));
        char[] aeiou = {'a' , 'e' , 'i' , 'o' , 'u'};
        for (char i : aeiou){
            if(i == jadArray.get(0))
            System.out.println(" The first letter is vowel!!");
        }

    }

    public int[] numbersAyEshe(){

        int[] myArray = new int[10];
        Random r = new Random();
        for (int i = 0 ; i <10 ; i++){

            myArray[i] = r.nextInt(100-55)+55;
        }
        return myArray;

    }


    public ArrayList<Integer> numbersAy(){

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0 ; i <10 ; i++){

            myArray.add(r.nextInt(100-55)+55);
        }
        Collections.sort(myArray);
        System.out.println(myArray);
        System.out.println(myArray.get(0));
        System.out.println(myArray.get(myArray.size()-1));
        return myArray;

        


    }
    public String createRandoms(){
        String ran = new String();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (Character i = 'a' ; i <= 'z' ; i++){
        alphabet.add(i);
        }
        Random r = new Random();
        for (int i = 0 ; i< 5 ; i++){
            ran+=alphabet.get(r.nextInt(25));
        }
        System.out.println(ran);
        return ran;



    }

    public void generateArray(){

       ArrayList<String> gen = new ArrayList<String>();
        for (int i = 0 ; i<=9 ; i++){
            gen.add(createRandoms());
        
        }

       System.out.println(gen);


    }

    

}