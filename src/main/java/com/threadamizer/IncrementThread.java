/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

class IncrementThread extends Thread{
    private static int id_counter = 0;
    private final int id;
    private int counter = 0;

    public IncrementThread(int counter) {
        id = ++id_counter;
        this.counter = counter;
    }
    
    @Override
    public void run(){
        for(int i=0; i <= counter; i++){
            System.out.println("Thread:" + id + " Count:" + i);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
//    public int getMyId() {
//        return id;
//    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "IncrementThread{" + "counter=" + counter + '}';
    }
}
