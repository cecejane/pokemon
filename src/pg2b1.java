import java.util.Scanner;

public class pg2b1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //GET INPUT
        String input = "Type 2 Level 5 Attack 80 Defense 60 Base 20 STAB 1 Critical 2.0 Random 0.9";

        //CUT INPUT INTO PIECES, IN A LIST
        String[] list = input.split(" ");

        //PRINT EVERY MEMBER OF THE LIST
        for(int i = 0; i<list.length; i++)
            System.out.println(list[i]);

        double t = Double.parseDouble(list[1]);          //type = t
        int l= Integer.parseInt( list[3] );             //level = l
        int a= Integer.parseInt( list[5] );            //attack = a
        int d= Integer.parseInt( list[7] );           //defence=d
        int b= Integer.parseInt( list[9] );          //base = b
        double s= Double.parseDouble(list[11]);     //STAB=s
        double c=Double.parseDouble( list[13]);    //critical=c
        double r=Double.parseDouble(list[15]);    //random=r
        int o=1;                                 //other=o
        double temp_dam=0;                      //damage=dam
        int dam=6;


        //test it
        if ( t != 0 && t!=0.25 && t!=0.5 && t!=1 && t!=2 & t!=4)
        {
            System.out.print("ERROR MOTHERFRCKKKKK");
            return;// -1;
        }
        if (l<1 || l>99)
        {
            System.out.print("ERROR RAT ON A HAYSTACK");
            return;// -1;
        }

        if (a<1)
        {
            System.out.print("error. goodbye!");
            return;// -1;
        }
        if (d<1)
        {
            System.out.print(" errrrrooooorrr!!!!!!!!!!!!");
            return;// -1;
        }
        if (b<1)
        {
            System.out.print(" ThErE hAs BeEn An ErRoR.");
            return;// -1;
        }
        if (s!=1 && s!= 1.5)
        {
            System.out.print("give me an e! give me a r! give me a r! give me an o! give me a r! what's that spell? ERROR!");
            return;// -1;
        }
        if (c !=1 && c!=2)
        {
            System.out.print(" e.r.r.o.r.");
            return;// -1;
        }
        if (r<0.85 || r>1.0 )
        {
            System.out.print("ererererror");
            return;// -1;
        }
        if (o!=1 )
        {
            System.out.print(" error.");
            return;// -1;
        }




        //DAMAGE CALUCLATION

        temp_dam = (((2*l+10)/250)*(a/d)*b+2)* s*t*c*o*r;
        dam = (int)temp_dam;
        System.out.print("Sucks to be you. Your HP is going down, son. ");
        System.out.print("You receive a damage of: ");
        System.out.print(dam);

        return;// dam;

    }

}


