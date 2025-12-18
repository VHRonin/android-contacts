package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T itemToCompare);
    boolean equals(Object o);
}
