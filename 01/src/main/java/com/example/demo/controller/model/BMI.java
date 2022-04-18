package com.example.demo.controller.model;

public class BMI {
    private double weight;
    private double height;
    private double bmi;


    public BMI() {
    }


    public BMI(double weight, double height, double bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return weight / (height * 2);
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double tinhtoan() {
        return weight / (height * 2);
    }
}

