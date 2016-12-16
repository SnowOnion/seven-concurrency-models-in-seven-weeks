/***
 * Excerpted from "Seven Concurrency Models in Seven Weeks",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/pb7con for more book information.
 ***/
package com.paulbutcher;

import java.util.Date;
import java.util.Random;

@SuppressWarnings("Duplicates")
class Philosopher extends Thread {
    private Chopstick left, right;
    private Random random;
    private int thinkCount=0;
    private int eatCount=0;

    public Philosopher(Chopstick left, Chopstick right) {
        this.left = left;
        this.right = right;
        random = new Random();
    }

    /**
     * 约定：哲学家以左手边的筷子id作为自己的id。筷子id为0,1,2,3,4，按逆时针排列。
     * @return
     */
    @Override
    public String toString() {
        return "Philosopher "+left.getId();
    }

    public void run() {
        try {
            while (true) {
                ++thinkCount;
//                if (thinkCount % 10 == 0)
//                    System.out.println(new Date()+" | "+ this + " has thought " + thinkCount + " times");
                Thread.sleep(random.nextInt(1000));     // Think for a while
                synchronized (left) {                    // Grab left chopstick
                    synchronized (right) {                 // Grab right chopstick
                        ++eatCount;
//                        if (eatCount % 10 == 0)
                            System.out.println(new Date()+" | " + this + " has eaten " + eatCount + " times");
                        Thread.sleep(random.nextInt(1000)); // Eat for a while
                    }
                }
            }
        } catch (InterruptedException e) {
        }
    }
}
