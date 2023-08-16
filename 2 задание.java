package com.example.palindrome;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До обмена: a = " + a + ", b = " + b);
        int[] swappedValues = swap(a, b);
        a = swappedValues[0];
        b = swappedValues[1];
        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int[] swappedValues = {a, b};
        return swappedValues;
    }
}