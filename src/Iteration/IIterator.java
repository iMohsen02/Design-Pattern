package Iteration;

public interface IIterator <T>{
    boolean hasNext();
    void next();
    T current();
}
