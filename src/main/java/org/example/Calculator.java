package org.example;

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.intValue() + b.doubleValue();
    }

    private static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    private static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    private static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public <T extends Number, U extends Number> boolean compareArrays(T[] arr1, U[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {

            // Сравнивает объекты
            if (Double.compare(arr1[i].doubleValue(), arr2[i].intValue()) != 0) {
                return false;
            }
        }
        return true;
    }
}
