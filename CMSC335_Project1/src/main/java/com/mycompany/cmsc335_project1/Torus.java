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
public class Torus implements ThreeDimensionalShape {

    int majorRadius, minorRadius;

    public int getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(int majorRadius) {
        this.majorRadius = majorRadius;
    }

    public int getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(int minorRadius) {
        this.minorRadius = minorRadius;
    }

    public Torus(int majorRadius, int minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (3.14 * minorRadius * minorRadius) * (2 * 3.14 * majorRadius);
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
