package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VacationMonthsService service = new VacationMonthsService();
        int count = service.calcService(100000, 60000, 150000);

        System.out.println(count);
    }
}
