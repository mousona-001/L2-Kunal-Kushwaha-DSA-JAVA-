import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("Red fruit");
//                break;
//            case "orange":
//                System.out.println("round fruit");
//                break;
//            default:
//                System.out.println("Please enter the valid fruit");
//        }

        // another syntax where break statement is not required :

//        switch(fruit){
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("Red fruit");
//            case "Orange" -> System.out.println("round fruit");
//            default -> System.out.println("Please enter a valid fruit");
//
//        }

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
