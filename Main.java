package ru.netology.lesson1;

public class Main {

    public static void main(String[] args) {
        // Создали экземпляр класса Calculator через вызов статической переменной instance
        Calculator calc = Calculator.instance.get();

        // Произвели несколько мат.операций над числами
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // Возникает ошибка при определении переменной 'c',
        // т.к. переменная 'b'=0, в результате происходит деление на '0',
        // поэтому выбрасывается исключение
        int c = calc.devide.apply(a, b);

        // Вывели результат в консоль
        calc.println.accept(c);
    }
}
