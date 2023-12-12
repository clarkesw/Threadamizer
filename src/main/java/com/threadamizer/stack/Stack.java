/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.stack;

/**
 *
 * @author Clarke S.
 */
public class Stack {
    private int[] elements;
    private final int len;
    private int current = 0;

    public Stack(int len) {
        this.len = len;
        elements = new int[len];
    }
    
    public void push(int element){        
        elements[current] = element;
        current++;
    }
    
    public int pop(){
        current--;
        return elements[current];
    }
    
    private boolean checkLen(){
        if(0 >= current && current <= len){
            return true;
        }
        return false;
    }
}
