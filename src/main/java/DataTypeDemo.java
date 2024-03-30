import java.util.Locale;

public class DataTypeDemo {

    public static void main(String[] args)
    {
        byte a1=127;

        short a2=47;

        int a3=123456789;

        double a4=100000022;

        float a5=10.55f;

        boolean isValid= false;

        //TypeCasting example
        char initialFirstName='A';

        int assciiValue=initialFirstName;

        char asciiValue2=(char)assciiValue;

        String name="Pranit G";

        System.out.println(name.toUpperCase(Locale.ROOT));



        int iNo1=80;
        char ch=(char)iNo1;


        System.out.println(iNo1);

        System.out.println("byte is : "+a1);
        System.out.println("short is : "+a2);
        System.out.println("int is : "+a3);
        System.out.println("double is : "+a4);
        System.out.println("assccii value from char to int  : "+assciiValue);
        System.out.println("ascii value from int to char : "+asciiValue2);

    }


}

/*

Note: String is only data type which is class
 */
