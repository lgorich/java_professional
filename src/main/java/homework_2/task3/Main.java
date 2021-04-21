package homework_2.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        getIntegerList();
    }

    public static void getIntegerList() throws IOException {
        List<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number");
            String s = reader.readLine();
            list.add(Integer.valueOf(s));
        }

        getMinimum(list);
    }

    public static void getMinimum(List<Integer> l) {
        System.out.println(Collections.min(l));
    }
}
