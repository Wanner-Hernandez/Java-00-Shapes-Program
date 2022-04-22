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
public class Cube  implements ThreeDimensionalShape{

    int area;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Cube(int area) {
        this.area = area;
    }

    @Override
    public double getVolume() {
        return area * area * area;
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}

