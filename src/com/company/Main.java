package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        System.out.println(mll.isEmpty());
        System.out.println(mll.size());
        mll.add(0);
        mll.add(100);
        mll.add(200);
        mll.add(300);
        mll.add(333, 3);


        System.out.println(mll.get(1));
        System.out.println(mll.get(3));
        System.out.println(mll.contains(4));
        System.out.println(mll.remove(4));
        mll.set(1, 111);
        System.out.println(mll.get(1));

        System.out.println(mll.isEmpty());

        System.out.println(mll.indexOf(200));
        System.out.println(mll.contains(2));
        System.out.println(mll.contains(4));
        mll.clear();
        System.out.println(mll.size());


    }
}
