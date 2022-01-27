package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int NUMBERS_ARRAY_SIZE = 12;
    public static final int ERROR_CALL = -1;
    public static final int INITIAL_NUMBER_ARRAY = -1;

    private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];

    public int getTotal() {
        return total;
    }

    public int total = INITIAL_NUMBER_ARRAY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_NUMBER_ARRAY;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CALL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CALL;
        return numbers[total--];
    }

}
