package ru.netology;


import java.util.*;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int max;
    protected int min;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                IntStream intStream = random.ints(getMin(), getMax() + 1);
                return intStream.iterator().nextInt();

            }
        };
    }
}
