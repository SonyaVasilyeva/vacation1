package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationMonthsServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")

    public void test1 (int expected, int income, int expenses, int threshold) {
        VacationMonthsService service = new VacationMonthsService(); // заводим объект

        int actual = service.calcService(income, expenses,threshold); // вызываем функцию, присваеваем удобную переменную

        Assertions.assertEquals(expected, actual); // сравниваем ожидаемый и фактический результаты
    }
}
