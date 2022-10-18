import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput1 = scan.nextLine();
        // Halving words.
        if ((userInput1.length() % 2) == 0){
            int index1 = userInput1.length() - 1;
            int s1 = index1 / 2;
            String p1 = userInput1.substring(0, s1 + 1);
            String p2 = userInput1.substring(s1 + 1);
            System.out.println("First half: " + p1);
            System.out.println("Second half: " + p2);
        } else {
            int index2 = userInput1.length() - 1;
            int split1 = (index2 - 1) / 2;
            int split2 = (split1 + 1);
            String a1 = userInput1.substring(0, split1 + 1);
            String a2 = userInput1.substring(split2);
            System.out.println("First half: " + a1);
            System.out.println("Second half: " + a2);
        }
        // Determining length.
        System.out.print("Enter second string: ");
        String userInput2 = scan.nextLine();
        if (userInput1.length() > userInput2.length()){
            System.out.println(userInput1 + " is longer");
        } else if (userInput2.length() > userInput1.length()){
            System.out.println(userInput2 + " is longer");
        } else if (userInput1.length() == userInput2.length()){
            System.out.println("Both strings have the same length.");
        }
        // Determining alphabetical order.
        if (userInput1.compareTo(userInput2) > 0){
            System.out.println(userInput2 + " is first alphabetically");
        } else if (userInput1.compareTo(userInput2) < 0){
            System.out.println(userInput1 + " is first alphabetically");
        } else if(userInput1.equals(userInput2)){
            System.out.println("Both strings have the exact same characters");
        }
        // Determining if userInput2 is found in userInput1.
        if (userInput1.indexOf(userInput2) > -1){
            int index = userInput1.indexOf(userInput2);
            System.out.println(userInput2 + " is found in " + userInput1 + " at index " + index);
        } else if (userInput1.indexOf(userInput2) == -1){
            System.out.println(userInput2 + " is NOT found in " + userInput1);
        }

    }
}
