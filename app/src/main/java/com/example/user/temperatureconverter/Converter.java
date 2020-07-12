package com.example.user.temperatureconverter;

public class Converter {

    public static double cel2fahr(double f){
        return (f-32)*5/9;
    }

    public static double fahr2cel(double c){
        return 32+c*9/5;
    }
}