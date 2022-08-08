public class learnStringBuilder {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
       // sb.append(" my").append(" friend"); 
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());
        System.out.printf("String %15d \n", 10000);
        System.out.printf("String %15d \n", 14546);
        System.out.printf("String %10d \n", 14546); //shirina
        System.out.printf("String %-15d \n", 14546); // left
        System.out.printf("String %.3f \n" , 151.31231212521); // 3 posle zapyatoy
        }
}
