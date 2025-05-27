package Level1.exercise1.application;

import Level1.exercise1.model.Month;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ProgramRunner {
    public static void run() {

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        List<Month> months = new ArrayList<>(Arrays.asList(january, february, march, april,
                may, june, july, september, october, november, december));


        if (!months.contains(august)) {
            months.add(7, august);
        }
        if (!months.contains(september)) {
            months.add(4, september);
        }

        System.out.println("unique months: ");
        HashSet<Month> uniqueMonths = new HashSet<>(months);
        for (Month month : months) {
            System.out.println(month);
        }
    }
}


