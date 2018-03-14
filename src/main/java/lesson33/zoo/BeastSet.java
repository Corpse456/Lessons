package lesson33.zoo;

import lesson33.zoo.domain.Beast;

public interface BeastSet<T extends Beast> {

    void add(T element);

    void remove(T element);

    boolean contains(T element);
    
    T next();

    int getSize();
}
