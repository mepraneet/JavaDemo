public class ConditionalStatementDemo {

    public static void main(String[] args) {
        ConditionalStatementDemo d1 = new ConditionalStatementDemo();
        d1.switchDemo(18);
        d1.examTime(4);
        d1.switchDemo2("Male");


    }

    public void switchDemo(int age) {
        switch (age) {
            case 18: {
                System.out.println("You are adult");
                break;
            }
            case 60: {
                System.out.println("You are SC");
                break;
            }
            default: {
                System.out.println("You are Younger");
                break;
            }

        }


    }

    public void examTime(int std) {
        switch (std) {
            case 1: {
                System.out.println("Your exam at 10 AM");
                break;
            }
            case 2: {
                System.out.println("Your exam at 11 AM");
                break;
            }
            case 3: {
                System.out.println("Your exam at 12 AM");
                break;
            }
            case 4: {
                System.out.println("Your exam at 1 PM");
                break;
            }
            default: {
                System.out.println("Invalid std");
                break;

            }

        }

    }

    public void switchDemo2(String gender)
    {
        switch(gender)
        {
            case "Male" :
            {
                System.out.println("Male CR");
                break;
            }
            case "Female" :
            {
                System.out.println("Female CR");
            }
            default :
            {
                System.out.println("Not valid");
            }
        }

    }
}

/*
 Accepted Data Types in Switch : char, byte ,short , int
 Not accepted Data type : float, boolean , long ,double
 */
