import java.util.Scanner;

public class ConditionalStatementDemo {



    public String getEgeCategory(int age) {

        String ageCategory = null;    // null is default value of string

        /*
        age >0 and age<18  :child
        age>=18 and age <60 : adult
        age > 60 :Senior citizen
         */

        if ((age > 0) && (age < 18))
        {
            //System.out.println("Child");
            ageCategory="Child";
        }
        else if ((age >= 18) && (age < 60))
        {
           // System.out.println("Adults");
            ageCategory="adult";
        }
        else
        {
            //System.out.println("Senior citizen");
            ageCategory="Senior citizen";
        }

        return ageCategory;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConditionalStatementDemo d1= new ConditionalStatementDemo();


        System.out.println("Enter Age : ");
        int iValue=sc.nextInt();

        String result = d1.getEgeCategory(iValue);

        System.out.println(result);


    }


}
