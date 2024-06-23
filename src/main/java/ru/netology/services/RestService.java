package ru.netology.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {

        int balance = 0; // количество денег на счету
        int counter = 0; // счётчик месяцев отдыха

        for (int i = 0; i < 12; i++) {

            if (balance >= threshold) {
                //отдых
                balance = balance - expenses;
                balance = balance / 3;
                counter++;

            } else {
                // работа
                balance = balance + income;
                balance = balance - expenses;
            }
        }
        return counter;
    }
}
