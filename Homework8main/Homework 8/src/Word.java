import java.util.Objects;

public abstract class Word implements Text{


    public String word;
    static String nameOfAuthor;


    public Word(){}

    public void getPrint() {
        System.out.println("Word");
    }


    public String getPrinText() {
        return word;}

    public abstract String toString();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }


    public int hashCode() {

        return Objects.hash(word);
    }

    public void describeText(){
        System.out.println("About text: " + this.word);
    }

    public static void printNameOfAuthor(String nameOfAuthor){}
   }
