public class LoopingDemo {

    public static void main(String [] args)
    {
        //forDemo();
        //forDemo2();
        //forDemo3();
        //forDemo4();
        forDemo5();

    }

    public static void forDemo()
    {
      //  int iCnt;
        for(int iCnt=0; iCnt<=10;iCnt++)
        {
            System.out.println("Jay Ganesh "+iCnt);
        }
    }

    // While infinite Loop
    public static void forDemo2()
    {
        for(; ;) // if dont provide this it will executing infinite time
        {
            System.out.println("Jay Ganesh ");
        }
    }

    //Star Printing Function
    public static void forDemo3()
    {
       for(int i=0; i<5; i++)
        {
            for(int j=0; j<5-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void forDemo4()
    {
        int iCnt=1;
        while(iCnt<=5)
        {
            System.out.println("Jay Ganesh");

            iCnt++;
        }
    }

    public static void forDemo5()
    {
        int iCnt=0;
        while(true)
        {
            System.out.println("Jay Ganesh");

            iCnt++;
        }
    }
}
