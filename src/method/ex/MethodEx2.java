package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {

        repeating("java", 3);
        repeating("python", 5);
        repeating("javaScript", 7);
    }

    public static void repeating (String message, int times) {

        for(int i = 0; i < times ; i++){
            System.out.println(message);
        }
    }

}
