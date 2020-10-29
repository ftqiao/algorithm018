学习笔记
# HashMap 总结（jdk1.8）
    ## 部分代码
    1. 内部实现有链表结构
    ```
        static class Node<K,V> implements Map.Entry<K,V> {
            final int hash;
            final K key;
            V value;
            Node<K,V> next;
    
            Node(int hash, K key, V value, Node<K,V> next) {
                this.hash = hash;
                this.key = key;
                this.value = value;
                this.next = next;
            }
    
            public final K getKey()        { return key; }
            public final V getValue()      { return value; }
            public final String toString() { return key + "=" + value; }
        }
    ```
    2. 获取数据时，先判断有无结果，如有返回节点的值  
        ```
        public V get(Object key) {
            Node<K,V> e;
            return (e = getNode(hash(key), key)) == null ? null : e.value;
        }
        ```
    3. containsValue 和 containsKey 都是对 Node<K,V>[] 数据的遍历
