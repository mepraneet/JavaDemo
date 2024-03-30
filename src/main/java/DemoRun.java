public class DemoRun extends Student{

    public static void main(String [] args)
    {
        School sc1= new School();
        sc1.name="NEST";
        sc1.address="Pune";
        sc1.principle="PNG";

        Teacher tc1=new Teacher();
        tc1.name="MB Ravat";
        tc1.subject="Math";

        Student st1= new Student();
        st1.name=" RDJ";
        st1.age=18;

        Student st2= new Student();
        st1.name="SRJ";
        st1.age=21;

        ClassRoom cls1 = new ClassRoom();
        cls1.floorNo=5;
        cls1.seatCount=53;




    }
}
