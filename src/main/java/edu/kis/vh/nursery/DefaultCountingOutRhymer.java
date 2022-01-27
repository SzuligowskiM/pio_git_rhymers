package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int NUMBERS_ARRAY_SIZE = 12;
    private static final int ERROR_CALL = -1;
    private static final int INITIAL_NUMBER_ARRAY = -1;

    private final int[] numbers = new int[getNumbersArraySize()];

    public static int getNumbersArraySize() {
        return NUMBERS_ARRAY_SIZE;
    }

    public static int getErrorCall() {
        return ERROR_CALL;
    }

    public static int getInitialNumberArray() {
        return INITIAL_NUMBER_ARRAY;
    }

    public int getTotal() {
        return total;
    }

    public int total = getInitialNumberArray();

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == getInitialNumberArray();
    }

    public boolean isFull() {
        return total == getNumbersArraySize() - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return getErrorCall();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getErrorCall();
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
