/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

class IncrementRunnable implements Runnable{

    private int counter = 5;

    public IncrementRunnable() {}
    
    public IncrementRunnable(int counter) {
        this.counter = counter;
    }
    
    @Override
    public void run(){
        for(int i=0; i <= counter; i++){
            System.out.println("Thread Count:" + i);
            try{
                Thread.sleep(200);
//                int name = 10/0;
//                throw new InterruptedException();
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

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
