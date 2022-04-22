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
public class Circle implements TwoDimensionalShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int numberOfDimentions() {
        return 2;
    }
    
    int circumference;

    public Circle (int radius) {
	this.circumference = 2 * 3.14 * radius;
    }

    @Override
    public double getCircumference() {
	return 2 * 3.14 * radius;
    }
   
    public int getRadius() {
	return radius;
    }
    
    public void setRadius(int radius) {
	this.radius- radius;
    } 


