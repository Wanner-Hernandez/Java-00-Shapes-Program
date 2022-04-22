/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cmsc335_project1;

/**
 * Wanner hernandezR
 * CMSC335 Project1 
 * //The class for this project was base on Design, implement and test a Java
 * class Inheritance hierarchy that would satisfy the 
 * following is-a and has-a relationship//
 * Professor Mujeye, Douglas
 * January 26, 2021
 */
public class Triangle implements TwoDimensionalShape {
    int height, base;

    @Override
    public double getArea() {
        return (height * base)/2;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public int numberOfDimentions() {
        return 2;
    }
}
