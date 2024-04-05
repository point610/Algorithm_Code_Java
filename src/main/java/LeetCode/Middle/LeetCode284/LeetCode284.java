package LeetCode.Middle.LeetCode284;
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer  value;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        value = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return value;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer temp = value;
        value = iterator.hasNext() ? iterator.next() : null;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return value != null;
    }
}

public class LeetCode284 {
}
