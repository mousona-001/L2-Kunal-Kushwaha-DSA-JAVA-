public class Function {
    public static void main(String[] args) {
        int ans = sum3(10, 22);
        System.out.println("ans = " + ans);
    }

    // Doesn't return any value

//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = in.nextInt();
//        int ans = num1 + num2;
//        System.out.println(ans);
//    }

    // Return the value
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = in.nextInt();
//        int ans = num1 + num2;
//        return ans;
//    }

    // Pass the value of numbers when you're calling the method in main()

    static int sum3(int a, int b){
        int ans = a + b;
        return ans;
    }


}
