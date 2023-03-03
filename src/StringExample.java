public class StringExample {
    public static void main(String[] args) {

        String personalized = greet("Mousona");
        System.out.println(personalized);
    }


    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
