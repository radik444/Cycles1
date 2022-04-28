import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        //Здание 1
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }


        System.out.println();
        int start2 = 10;
        while (start2 > 0) {
            System.out.print(start2 + " ");
            start2--;
        }


        System.out.println();
        //Задание 2
        int firstFriday = 1;
        int dateOfMonth = 2;
        for (firstFriday = 1; firstFriday < 5; firstFriday = firstFriday + 1) {
            dateOfMonth = dateOfMonth + 7;
            System.out.println(" Сегодня пятница " + dateOfMonth + "-е число,необходимо подготовить отчет ");
        }


        //Задание 3
        int year = 0;
        for (year = 0; year <= 2122; year = year + 79)
            if (year % 79 == 0 && year > 1822 && year < 2122) {
            System.out.println(year);
        }
    }

}