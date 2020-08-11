package Tasks;

public class Task1 {
    /* Минимум трех чисел
       Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    //Здесь не рассматривается вариант когда все числа равны между собой.

    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }

    public static int min(int a, int b, int c) {
        int m;
        if ((a < b) && (a < c)) {
            m = a;
        } else if ((b < a) && (b < c)) {
            m = b;
        } else {
            m = c;
        }
        return m;
    }
}
