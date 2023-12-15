package com.company;

public class Main {

    public static void main(String[] args) {
	MySet s =new MySet();
    s.Add(5);
    s.Add(7);
    s.Add(11);
    s.Add(12);
    MySet m =new MySet();
    m.Add(5);
    m.Add(3);
    m.Add(23);
    m.Add(12);
    m.intersection(s);
    MySet c = m.intersection(s);
    System.out.println(c);
    System.out.println(s.contains(5));
    }
}
