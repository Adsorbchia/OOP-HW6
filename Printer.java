package ru.gb.oseminar.service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Printer {
    public void print(List <Student>list){
    Iterator <Student>iterator = list.iterator();
    while (iterator.hasNext()){
        Student el =  iterator.next();
        System.out.println(el);}
}



        }

