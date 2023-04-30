public class FluxControl {
    public static void main(String[] args) throws Exception {

        ifArrow();
        ifNoArrow();
        ifVacation();
        ifSmaller();
        switchWeek();
    }

    private static void ifArrow() {

        int month = 9;

        if (month == 1) {
            System.out.println("January");
        } else {
            if (month == 2) {
                System.out.println("February");
            } else {
                if (month == 3) {
                    System.out.println("March");
                } else {
                    if (month == 4) {
                        System.out.println("April");
                    } else {
                        if (month == 5) {
                            System.out.println("May");
                        } else {
                            if (month == 6) {
                                System.out.println("June");
                            } else {
                                if (month == 7) {
                                    System.out.println("July");
                                } else {
                                    if (month == 8) {
                                        System.out.println("August");
                                    } else {
                                        if (month == 9) {
                                            System.out.println("September");
                                        } else {
                                            if (month == 10) {
                                                System.out.println("October");
                                            } else {
                                                if (month == 11) {
                                                    System.out.println("November");
                                                } else {
                                                    if (month == 12) {
                                                        System.out.println("December");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private static void ifNoArrow() {

        int month = 8;

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        }
    }

    private static void ifVacation() {

        String month = "August";

        if (month == "August" || month == "December" || month == "January") {
            System.out.println("FERIAS");
        }
    }

    private static void ifSmaller() {

        double monthlySalary = 11893.58d;
        double averageWage = 10500d;

        int numberOfDependents = 4;
        int averageDependents = 2;

        if ((monthlySalary < averageWage) && (numberOfDependents >= averageDependents)) {
            System.out.println("Employee should receive assistance");
        }
        boolean lowPay = monthlySalary < averageWage;
        boolean manyDependents = numberOfDependents >= averageDependents;

        if ((lowPay) && (manyDependents)) {
            System.out.println("Employee should receive assistance");
        }

        boolean receiveHelp = (lowPay) && (manyDependents);
        if (receiveHelp) {
            System.out.println("Employee should receive assistance");
        } else {
            System.out.println("Employee should not receive assistance");
        }
    }

    private static void switchWeek() {

        String day = "Monday";
        switch (day){
            case "Monday":
            System.out.println(2);
            break;
            case "Tuesday":
            System.out.println(3);
            break;
            case "Wednesday":
            System.out.println(4);
            break;
            case "Thursday":
            System.out.println(5);
            break;
            case "Friday":
            System.out.println(6);
            break;
            case "Saturday":
            System.out.println(7);
            break;
            case "Sunday":
            System.out.println(1);
            break;
            default:
            System.out.println("day indefined");
            break;
        }
    }
}
