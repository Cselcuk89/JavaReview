package org.Selcuk;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> items = new java.util.ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("apple");

        printDouble(items);

    }

    private static void printDouble(java.util.ArrayList<Integer> items) {
//        for(Object i : items){
//            System.out.println((Integer)i * 2);
//        }
        for(int i : items){
            System.out.println((Integer)i * 2);
        }
    }
}
