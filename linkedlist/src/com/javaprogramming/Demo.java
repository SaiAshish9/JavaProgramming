package com.javaprogramming;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        ListIterator<String> listIterator1=placesToVisit.listIterator();
        System.out.println(placesToVisit.isEmpty());
        while (listIterator1.hasNext())
        System.out.println(listIterator1.next());

        //placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        printList(placesToVisit);
//        placesToVisit.add(1,"Darwin");
//        printList(placesToVisit);
//        placesToVisit.remove(1);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("=========");
    }

    public static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();

        while(stringListIterator.hasNext()){
              int comparison=stringListIterator.next().compareTo(newCity);
              if(comparison==0){
                  System.out.println(newCity);
                  return  false;
              }else if(comparison>0){
                  stringListIterator.previous();
                  stringListIterator.add(newCity);
                  return true;
              }else if(comparison<0){

              }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
