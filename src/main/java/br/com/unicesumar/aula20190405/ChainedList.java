package br.com.unicesumar.aula20190405;

import static java.util.Objects.isNull;

public class ChainedList<T> {
    private Element<T> first;

    public ChainedList(T first) {
        this.first = new Element<>(first);
    }

    public void add(T element) {
        if (isNull(first.value)){
            this.first = new Element<>(element);
        }
        else {
            Element<T> temporary = first;
            boolean isNotAdded = true;
            while (isNotAdded){
                if (isNull(temporary.nextValue)){
                    temporary.nextValue = new Element<>(element);
                    isNotAdded = false;
                } else {
                    temporary = temporary.nextValue;
                }
            }
        }
    }

    private static class Element<T> {
        private T value;

        private Element<T> nextValue;

        Element(T value) {
            this.value = value;
        }
    }
}


