public class Main {
    public static void main(String[] args){
        String str1 = "CAKE";
        String str2 = new String("CAKE");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
