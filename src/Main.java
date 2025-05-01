import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] cars = new int[3];
        cars[0] = 1;
        cars[1] = 2;
        cars[2] = 3;
        double[] trucks = {1.57, 7.654, 9.986};
        long[] carsAndTrucks = {100, 1_000, 1_000_000, 10_000_000, 100_000_000};

        System.out.println("Task 2");
        System.out.printf("%d, %d, %d%n",cars[0],cars[1],cars[2]);
        System.out.printf("%.2f, %.3f, %.3f%n",trucks[0], trucks[1], trucks[2]);
        System.out.print(Arrays.toString(carsAndTrucks));
        System.out.println();

        System.out.println("Task 3");
        System.out.printf("%d, %d, %d%n",cars[2],cars[1],cars[0]);
        System.out.printf("%.3f, %.3f, %.2f%n",trucks[2], trucks[1], trucks[0]);
        System.out.printf("%d, %d, %d, %d, %d%n", carsAndTrucks[4], carsAndTrucks[3], carsAndTrucks[2], carsAndTrucks[1], carsAndTrucks[0]);

        System.out.println("Task 4");
        int[] cars1 = {1, 2, 3};
        for (int i = 0; i < cars1.length; i++) {
            if (cars1[i] % 2 != 0) {
                cars1[i] +=1;
            }
            System.out.println(cars1[i]); // 1 вариант вывода результата преобразования в консоль
            }
        System.out.println(Arrays.toString(cars1)); // 2 вариант вывода результата преобразования в консоль
    }
}

