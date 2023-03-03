import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                switch(department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "BSC":
                        System.out.println("BSC department");
                        break;
                    default:
                        System.out.println("No dept entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter valid employee id");
        }
    }
}
