public class MethodDemo {

    public static void main(String[] args)
    {
        MethodDemo d1=new MethodDemo();
        d1.SumNo();
        d1.Multi();
        d1.SumNo2(50,100);



    }

    public void SumNo()
    {
        int iNo1=10;
        int iNo2=11;

        int iSum=iNo1+iNo2;
        int iMulti=iNo1*iNo2;

        System.out.println("Multiplication is : "+iMulti);

        System.out.println("Sum is : "+iSum);

    }

    public int SumNo2(int iNo1, int iNo2)
    {
        int iSum=iNo1+iNo2;

        System.out.println("Sum is : "+iSum);

        return iSum;

    }

    public void Multi()
    {
        int iNo1=10;
        int iNo2=11;
        int iMulti=iNo1*iNo2;

        System.out.println("Multiplication is : "+iMulti);
    }




}
/*
        Function/Method sysntax

        [Access Modifier] [Return data type] [Method/Function Name][Parameters]
        {
            body of function.
        }
         */