package ua.com.foxminded;

import ua.com.foxminded.reflection.Reflection;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Reflection().getAnnotatedMethods());
    }
}