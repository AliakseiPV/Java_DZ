import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
             DifferenceOfElements(new int[]{6,7,8,9,10}, new int[]{1,2,3,4,5});
             DivsionOfElements(new int[]{6,7,8,9,10}, new int[]{1,2,0,4,5});
        }catch (Exception e){
            System.out.println(e);
        };
        System.out.println("End");
    }

    public static int[] DifferenceOfElements(int[] a, int[] b)
    {
        var result = new int[a.length];
        if(a.length == b.length)
        {
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
        }else throw new ArrayIndexOutOfBoundsException("Arrays lengths are not equals(DifferenceOfElements)");

        return result;
    }

    public static double[] DivsionOfElements(int[] a, int[] b)
    {
        var result = new double[a.length];
        if(a.length == b.length)
        {
            for (int i = 0; i < a.length; i++) {
                if(b[i] == 0)
                    throw new ArithmeticException("Divide by zero exeption");
                result[i] = a[i] / b[i];
            }
        }else throw new ArrayIndexOutOfBoundsException("Arrays lengths are not equals(DivsionOfElements)");

        return result;
    }

}


//      Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого,
//        равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//      Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен частному элементов
//        двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение,
//        которое пользователь может увидеть - RuntimeException, т.е. ваше.