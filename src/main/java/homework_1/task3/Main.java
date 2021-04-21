package homework_1.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortItOut(new Double[] {11d,33d,55d,55d,90.4,78d,44d,22d,4d}));
    }

    // https://www.codewars.com/kata/reviews/5801085259da1eb62f000074/groups/607f4287bbc17200012fe210
    public static Double[] sortItOut(Double[] array) {
        ArrayList<Double> even = new ArrayList();
        ArrayList<Double> odd = new ArrayList();

        for (Double num : array) {
            if (num.intValue() % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(even);
        odd.addAll(even);

        for (int i = 0; i < array.length; i++) {
            array[i] = odd.get(i);
        }

        return array;
    }
}
