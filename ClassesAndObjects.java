public class ClassesAndObjects {
    public static void main(String[] args){
    Person person1 = new Person();
    person1.name = "Roman";
    //person1.setName("Roman");
    person1.age = 50;
    //String s1 = "Vovan";
    person1.speak();
    person1.sayHello();
    person1.calculateYearsToRetirement();
    
          //  System.out.println("My name is "+ person1.name + " I'm " + person1.age + " years old");
    Person person2 = new Person();
    person2.name = "Vova";
    //person2.setName(s1);
    person2.age = 34;
    person2.speak();
    person2.sayHello();
    person2.calculateYearsToRetirement();
          //  System.out.println("My name is "+ person2.name + " I'm " + person2.age + " years old");

    }
}
class Person{
    //У класса могут быть
    // 1 данные
    //2 Действия, которые он может совершать (методы)
    String name;
    int age;
/* 
    public void setName(String Username){
        name = Username;
    }
    public String getName(){
        return name;
    }

    //void setName(String username){
       // name = username;
   // }
*/
    void calculateYearsToRetirement(){//тип возвращаемого метода
        int years = 65-age;
        System.out.println("Kol-vo let do pensii "+ years);
    }
    void speak(){
        for(int i =0;i<1;i++){
        System.out.println("My name is "+ name + " ,I'm " +  age + " years old");
    }
}
    void sayHello(){
    System.out.println("Privet");
}
}
