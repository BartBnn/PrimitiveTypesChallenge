package pl.bart;

public class Main {

    public static void main(String[] args) {

        byte firstByte = 10;
        short firstShort = 20;
        int firstInt = 50;
        long sum = (firstByte + firstShort + firstInt);
        long firstLong = 50000L + 10L * sum;
        System.out.println(firstLong);

    }
}
