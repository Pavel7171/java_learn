public class Arrays {
    public static void main(String[] args){
   // int number = 10; // primitive type    [10]
   // char character = 'a'; // primitive type
   // String s = "Hello";
   // String s1 = new String("Hello");
    int [] numbers = new int[10];          // numbers -> [massive] Ssilochniy type
   // numbers[0] = 10; prisvoenie
    for(int i =0; i<numbers.length; i++){
    numbers[i] = i*12;
    }
    for(int i =0; i<numbers.length; i++){
    System.out.println(numbers[i]);   //0 1 2 3 4 
    }

}
}
