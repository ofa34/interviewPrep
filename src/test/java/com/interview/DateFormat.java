package com.interview;

public class DateFormat {


    // do we have a single format ? ddmmyyyy
    // days and months have always two digit right ?




    public static void main(String[] args) {


        int time = 10082022;

        System.out.println(dateFormat(time));

    }

    public static String dateFormat(int time) {

        String[] suffix ={"th","st","nd","rd","th","th","th","th","th"};
        String[] months ={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

        String date = time +"";

        String day = date.substring(0,2);
        String month = date.substring(2,4);
        String year = date.substring(4,8);

        day = day + suffix[Integer.parseInt(day.substring(1,2))];
        month = months[Integer.parseInt(month)];

        return day + " " + month + " " + year;



    }


}
