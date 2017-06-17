package MemoryLeak;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by Yo on 2017/4/22.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INTI_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INTI_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /**
     * 释放无用的元素
     * @return
     */
    public Object popRelease() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        elements[size] = null;
        return elements[--size];
    }
    /**
     * 增加数组长度
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
