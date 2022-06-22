enum Apple{
    Jonathan,GoldenDel,RedDel,Winesap,Cortland;
}
public class EnumDemo {
    public static void main (String args[]){
        Apple ap;
        ap = Apple.RedDel;
        System.out.print("Значение ap: "+ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel)
            System.out.println("ap содержит GoldenDel");
        if (ap == Apple.RedDel)
            System.out.println("Error");
        switch(ap){
            case Jonathan:
                System.out.println("Jonathan");
                break;
            case GoldenDel:
                System.out.println("GoldenDel");
                break;
            case RedDel:
                System.out.println("RedDel");
                break;
            case Winesap:
                System.out.println("Winesap");
                break;
            case Cortland:
                System.out.println("CortLand");
                break;
        }
    }
}
