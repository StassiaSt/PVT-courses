import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    private int lengthStr;

    public static void main(String[] args)  {
        Massive mas = new Massive();

   //Item 1
/*
        try
        {
           mas.printArr(-10);
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Check array size: " + e.getMessage());
        }*/


//Item 2


     /*   try {
           mas.setCalculations(8);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check array bounds");
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero" +e);
        }*/

//Item 3

      /*  try
        { mas.findIndexOf(5);
        }
        catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error" + e.getMessage());
        }*/


//Item 3a

    /*    try
        { mas.findStringData(20);
        }
        catch (StringIndexOutOfBoundsException | NullPointerException e) {  // но создавать исключение NullPointerException не стоит
            System.out.println("Error" + e.getMessage());
        }*/
// Item 4

    /*    try {
            mas.setWeight(-15);
        }
        catch (MassiveExceptions e){
            System.out.println("Error: " +e.getMessage());
        }
        finally {
            System.out.println("Your program is going on.");*/


  //  Additional:  Item a(try-with-resources)

   /*     try{
            mas.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

/*        //  Additional:  Item a(try inside try)
        int[] arr2 = {-5, 11, 0};
        int k;
        int q = 0;
        int s;
        try {
            k = arr2.length;
            if (k == 0) {
                try {
                    if (q == 1) {
                        int a = 1 / (q - 1);
                    }
                } catch (ArithmeticException e) {
                 System.out.println("Error: " + e.getMessage());
                }
                s = 1 / k;
            }
           } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());

            }*/




//  Additional:  Item c(finally that can't be called)


            try {
                try {
                    mas.setLengthStr(-15);
                } catch (MassiveExceptions massiveExceptions) {
                    massiveExceptions.printStackTrace();

                }
             }
         finally {
            System.out.println("Your program is going on.");
            return;
        }
    }}
