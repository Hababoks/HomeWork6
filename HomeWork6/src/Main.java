public class Main {
    //  1 Напишите метод, который принимает три строки и строку-разделитель.
    //  Метод возвращает единую строку, состоящую из исходных строк,
    //  разделённых строкой-разделителем.
    //  Например, на входе "один", "два", "три", "|".
    //  На выходе: "один|два|три"
    //  2 Напишите метод, который выводит в консоль первый символ переданной в него строки.
    public static void main(String[] args) {
        String s = concat("stroka 1", "stroka 2", "stroka 3", "|");
        System.out.println(s);
    }

    private static String concat(String s1, String s2, String s3, String delimiter) {
        return s1 + delimiter + s2 + delimiter + s3;
    }

}