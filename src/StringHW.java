/*
7.* Задания по строкам:
a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
б) Распечатать последний символ строки. Используем метод String.charAt().
в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
ж) Заменить все символы “а” на “о”.
з) Преобразуйте строку к верхнему регистру.
и) Преобразуйте строку к нижнему регистру.
к) Вырезать строку Java c помощью метода String.substring().


 */


public class StringHW {


    public static void myStringHandler(String input) {
        if (input.length() == 0) return;
        System.out.println("Last character of the string is: " + input.charAt(input.length() - 1));
        System.out.println("ends with !!!:" + input.endsWith("!!!"));
        System.out.println("starts with \"I like \": " + input.startsWith("I like"));
        System.out.println("Is contains \"Java\": " + input.contains("Java"));
        System.out.println("Is contains \"coffee\": " + input.contains("coffee"));

        //Найти позицию подстроки
        System.out.println(input.indexOf("Java"));
        System.out.println(input.indexOf("coffee"));

        input.replace('e', 'i');
        System.out.println(input);
        System.out.println(input.replace('e', 'i'));
        System.out.println( input.toUpperCase());
        System.out.println( input.toLowerCase());
        System.out.println(input.substring(input.indexOf("coffee"), input.indexOf("coffee") + "coffee".length()));
    }

    public static void main(String[] args) {
        myStringHandler("I like coffee!!!");
    }
}
