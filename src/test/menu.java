package test;

import java.util.*;
public class menu
{
    public void display_menu()
    {
        System.out.println("1) Option 1\n2) Option 2\n3) Option 3");
        System.out.print("Selection: ");
    }

    public void question()
    {
        System.out.println("Would you like to proceed or quit?");
        System.out.println("To proceed enter 9.");
        System.out.println("If you wish to quit enter 0.");
        Scanner q = new Scanner(System.in);

        switch (q.nextInt())
        {
            case 0:
                System.out.println ("Thank you and godbye.");
                break;

            case 9:
                System.out.println ("Please proceed.");
                new menu();
                break;
            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }

    public menu()
    {
        Scanner in = new Scanner(System.in);
        display_menu();

        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "You picked option 1" );
                question();
                break;

            case 2:
                System.out.println ( "You picked option 2" );
                question();
                break;

            case 3:
                System.out.println ( "You picked option 3" );
                question();
                break;
            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }

    public static void main (String[]args)
    {
        new menu();
    }
}


