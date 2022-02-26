package ru.netology.lesson1;

import java.util.function.*;

public class Calculator {
    // Создали статическую переменную типа Supplier, с ее помощью получили экземпляр класса Calculator
    static Supplier<Calculator> instance = Calculator::new;

    // Добавили несколько переменных типа BinaryOperator для мат.операций над двумя числами
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // Добавили несколько переменных типа UnaryOperator для мат.операций над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Добавили переменную типа Predicate для определения положительное ли число
    Predicate<Integer> isPositive = x -> x > 0;

    // Добавили переменную типа Consumer для вывода числа в консоль
    Consumer<Integer> println = System.out::println;
}
