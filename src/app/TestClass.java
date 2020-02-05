package app;

public class TestClass {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        do{
            System.out.print(number);
            if(number<100) System.out.print(", ");
            sum+=number;
            number+=2;
        }while(number<=100);
        System.out.println("\nSuma liczb wynosi - " + sum);

    }
}
