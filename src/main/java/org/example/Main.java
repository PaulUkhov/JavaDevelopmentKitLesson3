package org.example;
//1 Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
//2 Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
// Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
//3 Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
// Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(),
// возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.




public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Double res = calculator.sum(5, 6);
        System.out.println(res);
        Integer[] arr = {1, 2, 3};
        Double[] arr2 = {1.2, 2.3, 3.4};
        Pair<String,Integer> pair = new Pair("Hello", 5);
       String res3 = pair.getFirst();
       Integer res4 = pair.getSecond();
        System.out.println(res4 + " " + res3);
        boolean res2 = calculator.compareArrays(arr, arr2);
        System.out.println(res2);
    }
}