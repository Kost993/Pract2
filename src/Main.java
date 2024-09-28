import java.util.Scanner;

class PrimitiveInfo {

    public static void main(String[] args) {
        // Вывод информации о примитивных типах данных
        System.out.println("Примітивні типи даних:");
        System.out.println("byte: розмір = " + Byte.BYTES + " байтів, мінімальне значення = " + Byte.MIN_VALUE + ", максимальне значення = " + Byte.MAX_VALUE);
        System.out.println("short: розмір = " + Short.BYTES + " байтів, мінімальне значення = " + Short.MIN_VALUE + ", максимальне значення = " + Short.MAX_VALUE);
        System.out.println("int: розмір = " + Integer.BYTES + " байтів, мінімальне значення = " + Integer.MIN_VALUE + ", максимальне значення = " + Integer.MAX_VALUE);
        System.out.println("long: розмір = " + Long.BYTES + " байтів, мінімальне значення = " + Long.MIN_VALUE + ", максимальне значення = " + Long.MAX_VALUE);
        System.out.println("float: розмір = " + Float.BYTES + " байтів, мінімальне значення = " + Float.MIN_VALUE + ", максимальне значення = " + Float.MAX_VALUE);
        System.out.println("double: розмір = " + Double.BYTES + " байтів, мінімальне значення = " + Double.MIN_VALUE + ", максимальне значення = " + Double.MAX_VALUE);
        System.out.println("char: розмір = " + Character.BYTES + " байтів, мінімальне значення = " + (int) Character.MIN_VALUE + ", максимальне значення = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: розмір = 1 біт, значення = " + Boolean.FALSE + " або " + Boolean.TRUE);

        Scanner scanner = new Scanner(System.in);

        // Вводимо та перетворюємо строку до різних типів даних
        System.out.println("\nВведіть ціле число (int):");
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println("Ви ввели ціле число: " + intValue);

        System.out.println("\nВведіть дробове число (float):");
        String floatInput = scanner.nextLine();
        float floatValue = Float.parseFloat(floatInput);
        System.out.println("Ви ввели дробове число: " + floatValue);

        System.out.println("\nВведіть логічне значення (boolean):");
        String booleanInput = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanInput);
        System.out.println("Ви ввели логічне значення: " + booleanValue);

        System.out.println("\nВведіть символ (char):");
        String charInput = scanner.nextLine();
        char charValue = charInput.charAt(0);
        System.out.println("Ви ввели символ: " + charValue);

        scanner.close();
    }
}
