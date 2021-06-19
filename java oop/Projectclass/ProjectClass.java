class ProjectClass{
    String name;
    String desc;


 public ProjectClass() {

    
 }

 public ProjectClass(String name) {
     this.name = name;


 }
public ProjectClass(String name, String desc) {

    this.name = name;
    this.desc = desc;



}


    public void setName(String name){
        this.name = name;  

    }

    public void setDesc(String desc){
        this.desc = desc;  

    }

    public String getName(){

        return name;
    }

    public String getDesc(){

        return desc;
    }






}