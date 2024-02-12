package oop;

public class Random {
    static final int P1 = 32719; // a prime number
    static final int P2 = 32749; // another prime number

    int max;
    int last;

    public Random(int max) {
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    int nextInt() {
        last = (last * P1 + 3) % P2;
        return last % max;
    }
}
