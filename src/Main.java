import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1. Count digit in a number

//            System.out.println("Enter the number: ");
//            Scanner input = new Scanner(System.in);
//            int n = input.nextInt();
//            int count = 0;
//            while (n > 0) {
//                n = n / 10;
//                count++;
//            }
//            System.out.println("Digit count is " + count);


        // 2. Reverse a number
//
//            System.out.println("Enter the number: ");
//            Scanner input = new Scanner(System.in);
//            int num = input.nextInt();
//            int rem=0;
//            int reverse=0;
//            while(num!=0)
//            {
//                rem = num % 10;
//                num = num/10;
//                reverse = reverse * 10 + rem;
//
//            }
//            System.out.println("Reverse is : " + reverse);

        // 3. Digit extraction

//            System.out.println("Enter the number: ");
//            Scanner input = new Scanner(System.in);
//            int num = input.nextInt();
//            int temp = num; //Storing the num in a temporary variable for future use.
//
//            // count the digit :
//            int count = 0;
//            while (num > 0) {
//                num = num / 10;
//                count++;
//            }
//            // divisor :
//            int div = (int)Math.pow(10,count-1);
//
//           // Find digit :
//            while(temp>0)
//            {
//                int dig = temp / div;
//                System.out.println(dig);
//                temp = temp % div;
//                div = div/10;
//            }
//
//            // Exceptional Cases in finding digits like 10000,1000,100,10 etc. :
//
//            while(div>0)
//            {
//                int dig = temp / div;
//                System.out.println(dig);
//                temp = temp % div;
//                div = div/10;
//            }

        // 4. Print the numbers from 1 to 5 :
//            for(int num = 1; num <= 5; num++)
//            {
//                System.out.println(num);
//            }
//
//
        // print the numbers from 1 to n :

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.println("Hello World");
//        }

        // While loop
//        int num = 1;
//        while(num <= 5)
//        {
//            System.out.println(num);
//            num++;
//        }

        // 5. Find the largest number :
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//        if(b > max) {
//            max = b;
//        }
//        if(c > max) {
//            max = c;
//        }
//        System.out.println(max);


        // Case_check
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }
//        else{
//            System.out.println("Uppercase");
//        }

        // Fibonacci number:
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count <= n){
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count ++;
//        }
//        System.out.println(b);


        // Count the number of 3's :
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            if(rem == 3){
//                count ++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);


        // reverse a number:
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int rem = 0;
//        int ans = 0;
//        while(n>0){
//            rem = n%10;
//            ans = ans *10 + rem;
//            n = n/10;
//        }
//        System.out.println(ans);
//
//    }


        // Calculator :
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            //take the user input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("ans = " + ans);
            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                    System.out.println("Invalid operator!!");
                }
            }

        }
    }

