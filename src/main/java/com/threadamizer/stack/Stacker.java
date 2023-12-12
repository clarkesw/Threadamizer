/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.stack;

/**
 *
 * @author Clarke S.
 */
public class Stacker {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        System.out.println(myStack.pop() + "  " + myStack.pop());
    }
}
