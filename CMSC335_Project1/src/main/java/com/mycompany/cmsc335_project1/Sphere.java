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
public class Sphere implements ThreeDimensionalShape {

    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4/3) * 3.14 * radius*radius*radius;
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
