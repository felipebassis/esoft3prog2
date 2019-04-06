package br.com.unicesumar.aula20190226.classes;

public class Person {
    public final String name;
    public final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age + "}";
    }
}
