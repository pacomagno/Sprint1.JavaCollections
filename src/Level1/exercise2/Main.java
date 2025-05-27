package Level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list2 = new ArrayList<Integer>();



        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            int number = iterator.previous();
            list2.add(number);
        }

            System.out.println(list);
            System.out.println(list2);

        }
}

