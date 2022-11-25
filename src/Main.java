public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Number of Days in Month");
        System.out.println("");

/*        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));*/

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }

        boolean leapOfTheYear = false;
        int remainderYear = 0;
        int leapYear =  (year / 4) * 4;

        if (leapYear == year){
            leapYear =  (year / 100) * 100;
            if (leapYear == year){
                leapYear = (year / 400) * 400;
                if (leapYear == year){
                    leapOfTheYear = true;
                }
            } else {
                remainderYear = year % 100;
                if (remainderYear == ((remainderYear / 4) * 4)){
                    leapOfTheYear =true;
                }
            }
        }else {
            leapOfTheYear = false;
        }

        return leapOfTheYear;
    }

    public static int getDaysInMonth(int month, int year){
        boolean checkLeapYear = false;
        int returnValue = 0;

        if (month < 1 || month > 12){
            returnValue = -1;
        } else if(year < 1 || year > 9999){
            returnValue = -1;
        } else{
            checkLeapYear = isLeapYear(year);
            switch (month){
                case 1:
                case 2:
                    if(checkLeapYear ==true){

                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
            }

            returnValue = 1;
        }

        return returnValue;
    }

}