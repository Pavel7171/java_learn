public class learnThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Pavel");
        human1.setAge(27);
        human1.getInfo();
        Human human2 = new Human();
        human2.setName("Pavedsal");
        human2.setAge(272);
        human2.getInfo();
    }
}
class Human{
    private String name;
    private int age;

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
        System.out.println(name+ "," + age);
}
    }
