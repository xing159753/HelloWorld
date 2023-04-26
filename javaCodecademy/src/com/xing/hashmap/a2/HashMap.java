package com.xing.hashmap.a2;

public class HashMap {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        return hashCode;
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(1);
        System.out.println(newHashMap.hash("c"));
        System.out.println(newHashMap.hash("ca"));
        System.out.println(newHashMap.hash("car"));
    }
}
