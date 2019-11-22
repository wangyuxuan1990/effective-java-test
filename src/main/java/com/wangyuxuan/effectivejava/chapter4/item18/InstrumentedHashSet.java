package com.wangyuxuan.effectivejava.chapter4.item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author wangyuxuan
 * @date 2019/11/13 17:12
 * @description
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
