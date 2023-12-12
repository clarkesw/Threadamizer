/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.threadamizer;

/**
 *
 * @author Clarke S.
 */
public class Threadamizer {

    public static void main(String[] args) {

//        System.out.println("Thread: Main Start!");
//        Thread t1;
//        
//        t1 = new Thread(new IncrementRunnable());
//        t1.start();
//        System.out.println("Thread ID:" + t1.getId());
//           
//        System.out.println("Thread: Main End!");

    }
}

abstract class Computer {
    public abstract String getRAM();
}

class Server extends Computer{

    @Override
    public String getRAM() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
 //       IncrementRunnable[] threads = new IncrementRunnable[numThreads];
//        
//        for(int i=0; i < numThreads; i++){
//            threads[i] = new IncrementRunnable(incrementsPerThread);
//           // System.out.println("Thread:" + i);
//        }

        // Wait for all threads to finish
//        try {
//          for (IncrementRunnable thread: threads) {
//            thread.join();
//          }
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//        System.out.println("Thread: Main End!");