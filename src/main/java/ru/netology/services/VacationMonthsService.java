package ru.netology.services;

public class VacationMonthsService {

    public int calcService(int income, int expenses, int threshold) {

        int money = 0; //Количество денег на счету
        int count = 0; //Количество месяцев отдыха
        // int threshold; Нужный остаток

        for (int months = 0; months < 12; months++) {
            if (money >= threshold) { // проверяем, можем ли мы отдыхать
                count++; // если можем, то счетчик месяцев отдыха увеличивается на 1
                money = (money - expenses) / 3; // если отдыхаем, то количество денег на счету будет по формуле
            } else {
                money = money - expenses + income; // если не отдыхаем, то количество денег рассчитываем по формуле
            }
        }
        return count;
    }
}
