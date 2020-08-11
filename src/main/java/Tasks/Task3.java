package Tasks;
/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {
    public static void main(String[] args) {
        String s = "Gennady";
        int j, i = 0;
        while (i < 5) {
            j = 0;
            while (j < 9) {
                System.out.print (s + " ");
                j++;
            }
            System.out.println (s + " ");
            i++;
        }

    }

}
