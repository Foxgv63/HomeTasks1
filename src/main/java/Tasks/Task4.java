package Tasks;
/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {
    public static void main(String[] args) {
        int j, i = 0;
        do {
            j = 0;
            do {
                System.out.print("Gennady" + " ");
                j++;
            }  while(j < 9);
            System.out.println("Gennady" + " ");
            i++;
        } while (i < 5);

    }
}
