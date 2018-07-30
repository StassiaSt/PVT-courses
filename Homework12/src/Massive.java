public class Massive /*implements AutoCloseable*/{
    private int i;
    private int j;
    private int n;
    private int k;
    private  int p;
    private int length;
    private int weight;
    private int lengthStr;


    public Massive(){}

   // Item 1
  /*   public void printArr(int i) throws MassiveExceptions {
        int[] arr = new int[i];
        System.out.print(arr[i] + " ");
        if (i<0){
            throw new MassiveExceptions("-10");
        }
        this.i = i;
    }*/

 // Item 2
 /*  public void setCalculations(int j) throws MassiveExceptions {
       int[] arr1 = {-5, 11, 0, 8, -2};
       int p = arr1[2] / n;
       for (j = 0; j < arr1.length; j++) {
           System.out.println(arr1[8]);
           System.out.println(p);
       }
       if (j > arr1.length) {
           throw new MassiveExceptions("8");
       }
       this.j = j;
       if (n == 0) {
           throw new MassiveExceptions("0");
       }
       this.n = n;*/

// Item 3
  /*  public void findIndexOf(int k) throws MassiveExceptions {
        String str = "Hello, world";
        int position = str.indexOf(5);
        System.out.println(position + " ");
        char chr = str.charAt(20);
        System.out.println(chr + " ");
        if (/* переменная k не является char - есть ли способ правильно это прописать*//*) {
            throw new MassiveExceptions("20");
            }
            this.k = k;
         if (k > str.length()) {
             throw new MassiveExceptions("String");
         }
        this.k = k;*/

// Item 3a
 /*  public void findStringData(int k) throws MassiveExceptions {
        String str = "";
        char chr = str.charAt(10);
        System.out.println(chr + " ");
        int length = str.length();
        System.out.println(length + " ");
        if (k > str.length()) {
            throw new MassiveExceptions("String");
        }
        this.k = k;
        if (str.length()<0) {
            throw new MassiveExceptions("20");
            }
            this.length = length;*/


// Item 4
  /*    public void setWeight(int weight) throws MassiveExceptions {
        if (weight<0){
            throw new MassiveExceptions("-15");
        }
        this.weight = weight;
    }*/


//  Additional:  Item a(try-with-resources)

 /*  @Override
    public void close() throws Exception {
        System.out.println("My program is closed!");
    }*/


//  Additional:  Item c(finally that can't be called)

    public int setLengthStr(int lengthStr) throws MassiveExceptions {
        if (lengthStr < 0) {
            throw new MassiveExceptions("-15");

        }

        return lengthStr;
    }
    }



