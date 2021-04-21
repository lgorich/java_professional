package homework_2.task2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(10, (i1, i2) -> i2 - i1);

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            q.offer(rand.nextInt(100));
        }

        while (!q.isEmpty()) {
            Integer i = q.poll();
            System.out.println(i);
        }
    }
}
