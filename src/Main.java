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
            //System.out.println("checkLeapYear = " + checkLeapYear);
            switch (month){
                case 1:
                    returnValue = 31;
                    break;
                case 2:
                    if(checkLeapYear == true){
                        returnValue = 29;
                    } else if(checkLeapYear == false){
                        returnValue = 28;
                    }
                    break;
                case 3:
                    returnValue = 31;
                    break;
                case 4:
                    returnValue = 30;
                    break;
                case 5:
                    returnValue = 31;
                    break;
                case 6:
                    returnValue = 30;
                    break;
                case 7:
                    returnValue = 31;
                    break;
                case 8:
                    returnValue = 31;
                    break;
                case 9:
                    returnValue = 30;
                    break;
                case 10:
                    returnValue = 31;
                    break;
                case 11:
                    returnValue = 30;
                    break;
                case 12:
                    returnValue = 31;
                    break;
            }
        }

        return returnValue;
    }

}