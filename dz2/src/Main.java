import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

    public static void Task2(int[] intArray, int divider)
    {
        try {
            double catchedRes1 = intArray[8] / divider;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static float DateInput()
    {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true)
        {
            System.out.print("Enter the decimal number: ");
            try {
                number = Float.parseFloat(scanner.next());
                break;
            }catch (Exception e){
                System.out.println("Failed to convert to a number");
            }
        }
        return number;
    }



}

