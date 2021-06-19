import java.util.HashMap;
import java.util.Set;



public class HashMapEx{
    public static  void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("hello" , "hello its me");
        trackList.put("hey" , "hello  me");
        trackList.put("hi" , " its me");
        trackList.put("hola" , "hello its");

        for (String song : trackList.keySet()){
        System.out.println("Song name" + song + "and the lyrics is  : " +trackList.get(song));
        }

        trackList.get("hey");
        System.out.println(trackList.get("hey"));


}



}