public class setter_getter {
    public static void main(String[] args){
        Person1 person1 = new Person1();
        person1.setName("");
        person1.setAge(-1);
        System.out.println("In method name "+person1.getName());
        System.out.println("In method age "+person1.getAge());
        //person1.speak();
    }
}
class Person1{
    private String name;
    private int age;

    public void setName(String userName){
       if (userName.isEmpty()){
            System.out.println("Empty name");
        } else {
        name = userName;}
    }
    public String getName(){
        return name;
    }
 
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Uncorrect age");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }
     
        
void speak(){
    for(int i =0;i<1;i++){
System.out.println("My name is "+ name + " ,I'm " +  age +" years old");
    }
}
   // void sayHello(){
   // System.out.println("Privet");
//}
}
