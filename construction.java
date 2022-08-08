public class construction {
    public static void main(String[] args) {
        Human1 human1 = new Human1();  
        System.out.println(human1);
    }
}
class Human1{
    private String name;
    private int age;
     
    public Human1(){
        System.out.println("Hello from first construction");
    }
    public Human1(String name){
        System.out.println("Hello from twice construction");
        this.name=name;
    /* 
    public Human1(String name, int age){     // Name+age in main void
        System.out.println("Hello from third construction");
        this.name=name;
        this.age=age;
    }*/
    }
 
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
        public String getName(){
        return name;
        }
        public int getAge(){
       return age;
        }
    public void getInfo(){
        System.out.println("human1"+name+ "," + age);
} 
    }
      

