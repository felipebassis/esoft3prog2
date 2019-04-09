package br.com.unicesumar.aula20190405;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class ChainedList<T> {
    private Element<T> first;

    public ChainedList(T first) {
        this.first = new Element<>(first);
    }

    public void add(T element) {
        if (isNull(first.value)) {
            this.first = new Element<>(element);
        } else {
            Element<T> temporary = first;
            boolean isNotAdded = true;
            while (isNotAdded) {
                if (isNull(temporary.nextValue)) {
                    temporary.nextValue = new Element<>(element);
                    isNotAdded = false;
                } else {
                    temporary = temporary.nextValue;
                }
            }
        }
    }

    public void remove(T element) {
        if (first.value == element) {
            first = first.nextValue;
        } else {
            searchAndRemove(first, first.nextValue, element);
        }
    }

    private void searchAndRemove(Element<T> previousValue, Element<T> nextValue, T element) {
        if (nextValue.value == element) {
            previousValue.nextValue = nextValue.nextValue;
        } else {
            if (isNull(nextValue.nextValue)) {
                throw new RuntimeException("Element " + element + " not found");
            }
            searchAndRemove(previousValue.nextValue, nextValue.nextValue, element);
        }
    }

    public T get(int index) {
        Element<T> element = first;
        try {
            for (int iterator = 0; iterator < index; iterator++) {
                element = element.nextValue;
            }
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is null.");
        }
        if (nonNull(element)) {
            return element.value;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + index + " is null.");
    }

    private static class Element<T> {
        private T value;

        private Element<T> nextValue;

        Element(T value) {
            this.value = value;
        }
    }
}


