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
public class Cone  implements ThreeDimensionalShape{

    int radius, height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (3.14 * radius * radius)*(height/3);
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
