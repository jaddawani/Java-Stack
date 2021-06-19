public class ProjectClassTest{

    public static void main(String[] args){

        ProjectClass m = new ProjectClass("jad" , "hi");

        System.out.println(m.name + m.desc);


        m.setDesc("lana");

        String w = m.getDesc();

        System.out.println(w);



    }

    








}