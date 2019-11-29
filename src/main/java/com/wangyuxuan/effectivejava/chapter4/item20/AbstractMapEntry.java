package com.wangyuxuan.effectivejava.chapter4.item20;

import java.util.Map;
import java.util.Objects;

/**
 * @author wangyuxuan
 * @date 2019/11/29 16:33
 * @description Skeletal implementation class
 */
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<?, ?> e = (Map.Entry) obj;
        return Objects.equals(e.getKey(), getKey())
                && Objects.equals(e.getValue(), getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    @Override
    public String toString() {
        return getKey() + "=" + getValue();
    }
}
