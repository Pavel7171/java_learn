public class objectTostring {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);
        Human2 human = new Human2("Pavel");
        System.out.println(human.toString());
        human.toString(); //hashcode
    }
}
class Human2{
    private String name;
    public Human2(String name){
        this.name = name;
        }

    public String toString(){ // zamena hascode
        return name + " "+ name;
    }
}
