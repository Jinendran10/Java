 import java.util.*;
 class RandomNumberGenerator implements Runnable {
    public void run() {
        int b = 1;
        while (b == 1) {
            int n = (int) (Math.random() * 100);
            System.out.println("The generated number is: " + n);
            if (n % 2 == 0) {
                SquareCalculator even = new SquareCalculator(n);
                Thread evenThread = new Thread(even);
                evenThread.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else {
                CubeCalculator odd = new CubeCalculator(n);
                Thread oddThread = new Thread(odd);
                oddThread.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
 }
 class SquareCalculator implements Runnable {
    private int number;
    SquareCalculator(int n) {
        number = n;
    }
    public void run() {
        System.out.println("The square of the number is " + (number * number));
    }
 }
 class CubeCalculator implements Runnable {
    private int number;
    CubeCalculator(int n) {
        number = n;
    }
    public void run() {
 System.out.println("The cube of the number is " + (number * number *
 number));
    }
 }
 class SharedNumber {
    private int number;
    public synchronized void setNumber(int number) {
        this.number = number;
    }
    public synchronized int getNumber() {
        return number;
    }
 }
 class multithread {
    public static void main(String[] args) {
        RandomNumberGenerator t = new RandomNumberGenerator();
        Thread thread = new Thread(t);
        thread.start();
    }
 }
 OUTPUT:
 PS D:\Java\Cycle 6> javac multithread.java
 PS D:\Java\Cycle 6> java multithrea
