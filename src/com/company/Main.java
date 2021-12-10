package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        System.out.println(mll.isEmpty());
        mll.add(0);
        mll.add(100);
        mll.add(200);
        mll.add(300);

        System.out.println(mll.get(1));

        mll.set(1, 111);
        System.out.println(mll.get(1));

        System.out.println(mll.isEmpty());


        System.out.println(mll.size());
        mll.clear();
        System.out.println(mll.size());
    }
}
