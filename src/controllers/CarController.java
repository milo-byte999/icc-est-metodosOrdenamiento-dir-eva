package controllers;

import models.Car;

public class CarController {

    public void sortByName(Car[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (cars[j].getName().compareToIgnoreCase(cars[j + 1].getName()) > 0) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }
}