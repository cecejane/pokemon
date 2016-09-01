package pkmn;
import java.util.Scanner;

public class pg3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String t1 = "Trainer1";
        String t2= "Trainer2";
        boolean byebye = false;

        int choice = 0;

        Pokemon p1p1= new Pokemon();
        Pokemon p1p2= new Pokemon();
        Pokemon p1p3 = new Pokemon();
        Pokemon p1p4 = new Pokemon();

        Pokemon p2p1= new Pokemon();
        Pokemon p2p2= new Pokemon();
        Pokemon p2p3= new Pokemon();
        Pokemon p2p4= new Pokemon();


        System.out.println(" Welcome to your pokemon battle!");

        while (byebye == false)
        {

            //print the menu
            System.out.println("1. Change Trainer1's name");
            System.out.println("2. Change Trainer2's name");
            System.out.println("3. Set Trainer1's Pokemon");
            System.out.println("4. Set Trainer2's Pokemon");
            System.out.println("5. Display the trainers' names and Pokemon");
            System.out.println("6. Display the trainer who has the highest level Pokemon");
            System.out.println("7. Exit the program");
            System.out.println();
            System.out.println("Please choose an option from the menu above:");

            //get user choice
            choice = sc.nextInt();
            sc.nextLine();


            //test choice (if choice =1, do option one, else if choice = 2, do option two)

            if (choice==1){
                System.out.println("You want to change Trainer1's name. Enter the new name:");
                t1 = sc.nextLine();
            }

            if (choice==2){
                System.out.println("You want to change Trainer2's name. Enter the new name:");
                t2 = sc.nextLine();
            }


            if (choice==3){
                System.out.print(" You want to set Trainer1's pokemon. Set the first pokemon's name now: ");
                p1p1.setName(sc.nextLine() );
                System.out.print(" What is the level of this herr' pokemon?: ");
                p1p1.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your second pokemon's name? ENTER IT NOW: ");
                p1p2.setName(sc.nextLine() );
                System.out.print("What is the level of this pokerman?: ");
                p1p2.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your third pokemon's name? ENTER IT NOW: ");
                p1p3.setName(sc.nextLine() );
                System.out.print("What is the level of this pok3mon?: ");
                p1p3.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your fourth pokemon's name? ENTER IT NOW: ");
                p1p4.setName(sc.nextLine() );
                System.out.print("What is the level of this pokemon?: ");
                p1p4.setLevel(sc.nextInt());
                sc.nextLine();
            }

            if (choice==4){
                System.out.print(" You want to set Trainer2's pokemon. Set the first pokemon's name now: ");
                p2p1.setName(sc.nextLine() );
                System.out.print(" What is the level of this herr' pokemon?: ");
                p2p1.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your second pokemon's name? ENTER IT NOW: ");
                p2p2.setName(sc.nextLine() );
                System.out.print("What is the level of this pokerman?: ");
                p2p2.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your third pokemon's name? ENTER IT NOW: ");
                p2p3.setName(sc.nextLine() );
                System.out.print("What is the level of this pok3mon?: ");
                p2p3.setLevel(sc.nextInt());
                sc.nextLine();
                System.out.println("What is your fourth pokemon's name? ENTER IT NOW: ");
                p2p4.setName(sc.nextLine() );
                System.out.print("What is the level of this pokemon?: ");
                p2p4.setLevel(sc.nextInt());
                sc.nextLine();
            }



            if (choice==5){

                System.out.println(" You want me to print the names and pokemon? okiedokie");
                //System.out.print
                System.out.println(t1);
                System.out.print(p1p1.getName());
                System.out.print(p1p1.getLevel());
                System.out.println();
                System.out.print(p1p2.getName());
                System.out.print(p1p2.getLevel());
                System.out.println();
                System.out.print(p1p3.getName());
                System.out.print(p1p3.getLevel());
                System.out.println();
                System.out.print(p1p4.getName());
                System.out.print(p1p4.getLevel());
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println(t2);
                System.out.print(p2p1.getName());
                System.out.print(p2p1.getLevel());
                System.out.println();
                System.out.print(p2p2.getName());
                System.out.print(p2p2.getLevel());
                System.out.println();
                System.out.print(p2p3.getName());
                System.out.print(p2p3.getLevel());
                System.out.println();
                System.out.print(p2p4.getName());
                System.out.print(p2p4.getLevel());
                System.out.println();







                System.out.println();
                System.out.println();
            }


            if (choice==6){

                int h1 = 0;
                int h2 = 0;


                //TEST FOR HIGHEST LEVEL OF T1s PKMN

                if (p1p1.getLevel() > h1)
                    h1 = p1p1.getLevel();

                if (p1p2.getLevel() > h1)
                    h1 = p1p2.getLevel();

                if (p1p3.getLevel() > h1)
                    h1 = p1p3.getLevel();

                if (p1p4.getLevel() > h1)
                    h1 = p1p4.getLevel();


                if (p2p1.getLevel() > h2)
                    h2 = p2p1.getLevel();

                if (p2p2.getLevel() > h2)
                    h2 = p2p2.getLevel();

                if (p2p3.getLevel() > h2)
                    h2 = p2p3.getLevel();

                if (p2p4.getLevel() > h2)
                    h2 = p2p4.getLevel();




                //TEST FOR HIGHEST LEVEL OF T2s PKMN


                if (h1 > h2)
                {
                    System.out.print(t1);
                    System.out.println(" has the highest level pokemon.");
                }

                else if (h2>h1)
                {
                    System.out.print(t2);
                    System.out.println(" has the highest level pokemon.");
                }

                else if (h1==h2)
                {
                    System.out.println(" it's a tie.");
                }
            }




            //if "quit"
            //  whatever
            if (choice==7)
                byebye=true;







        };

        System.out.println("GOODBYE.");

    }
}



