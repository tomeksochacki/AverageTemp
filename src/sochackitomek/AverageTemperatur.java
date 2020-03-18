package sochackitomek;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperatur {

    public static void main(String[]args){
    int []tabTemperature = new int [7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <tabTemperature.length; i++){
            System.out.println("Enter to temperature " + i);
            tabTemperature[i] = scanner.nextInt();
            }

        double average = 0;
        double sum = 0;
        for(int j = 0; j<tabTemperature.length; j++){
            sum = tabTemperature[j] + sum;
            average = sum/tabTemperature.length;
        }
        System.out.println("Average " + average);
        System.out.println("Sum " + sum);
        System.out.println(Arrays.toString(tabTemperature));


}
}
