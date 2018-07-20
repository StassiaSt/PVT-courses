import java.util.Scanner;

public class Test {

    private static String arr;
    private static int n;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:  ");
        String arr = scanner.nextLine();

    }

    public static int enterFromKeyboardNumber() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = number.nextInt();
        return n;
    }

    public static void changeNumber() {
        String[] word = arr.split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
        for (int j = 0; j < word.length; j++) {
            String s = Character.toString('%');
            String result;
            if ((n > 0) && (n < word[j].length() - 1)) {
                result = word[j].substring(0, n - 1) + s + word[j].substring(n + 1, word[j].length());
            } else {
                result = word[j];
            }
            System.out.println(result);
        }


        //        Text word1= new Word();  //abstract class
          /*  Text sentence1 = new Sentence("I'm loving it.");
            Text paragraph1 = new Paragraph("Fairy tales are not always about fairies.  Most often fairy tales are about ordinary people.");
            sentence1.describeText();
            paragraph1.describeText();

//            Sentence sentence2=new Paragraph(); // ok
 //          Paragraph sentence3= new Sentence(); // type conversion because of inheriting

            Sentence sentence4 = new Sentence("Have a nice day", "One day from my life", "Cheshkin", 35);
            sentence4.getPrint();
            sentence4.printInfo("Have a nice day", "One day from my life");
            sentence4.getPrinText();
            System.out.println(sentence4.getPrinText());
            sentence4.describeText();
            sentence4.hashCode();
            System.out.println(sentence4.hashCode());
            sentence4.toString();
            System.out.println(sentence4.toString());

            Paragraph paragraph2 = new Paragraph("A very long time ago, before man came along to upset the natural balance. All animals lived together peacefully.", 15, "Kulakov", "The Adventures of Mike Andrews");
            paragraph2.getPrint();
            paragraph2.printInfo("Have a nice day", "One day from my life");
            paragraph2.getPrinText();
            System.out.println(paragraph2.getPrinText());
            paragraph2.describeText();
            paragraph2.hashCode();
            System.out.println(paragraph2.hashCode());
            paragraph2.toString();
            System.out.println(paragraph2.toString());


           Sentence sentence5=new Sentence();
            sentence5.printNameOfAuthor("Chizhikov");
            Paragraph paragraph3= new Paragraph();
            paragraph3.printNameOfAuthor("Ostrovnoj");*/


   /* String content;
    content = new String(Files.readAllBytes(Paths.get("sample.txt")));*/
    }
}


