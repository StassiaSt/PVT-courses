import java.util.Objects;

public class Paragraph extends Sentence implements Text {

    public String paragraph;
    private int length;
    String nameOfAuthor;
    String fromWhatText;


    public void setParagraph(String paragraph) {

        this.paragraph = paragraph;
    }

    public String getParagraph() {

        return paragraph;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setFromWhatText(String fromWhatText) {

        this.fromWhatText = fromWhatText;
    }

    public String getFromWhatText() {

        return fromWhatText;
    }

    public void setNameOfAuthor(String nameOfAuthor) {

        this.nameOfAuthor = nameOfAuthor;
    }

    public  String getNameOfAuthor() {

        return nameOfAuthor;
    }



    Paragraph() {    }

    Paragraph(String paragraph) {
        this();
        this.paragraph = paragraph;
    }

    Paragraph(String paragraph, int length) {
        this(paragraph);
        this.length = length;
    }

    Paragraph(String paragraph, int length, String nameOfAuthor) {
        this(paragraph, length);
        nameOfAuthor = nameOfAuthor;
    }




    protected String printInfoAboutString(String paragraph, int length) {
        return this.paragraph + this.length;
    }

    public String printAllInfoAboutParagraph(String paragraph, int length, String nameOfAuthor, String fromWhatText) {
        return this.paragraph + this.length + nameOfAuthor + this.fromWhatText;
    }

    public int printNumberWords(String paragraph) {
        int numberWords = paragraph.length();
        return numberWords;
    }



    @Override
    public void getPrint() {
        System.out.println("Paragraph");
    }
    @Override
    public String getPrinText() {
        return paragraph;
    }

    @Override
    public String toString() {
       return paragraph + fromWhatText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paragraph)) return false;
        if (!super.equals(o)) return false;
        Paragraph paragraph1 = (Paragraph) o;
        return length == paragraph1.length &&
                Objects.equals(paragraph, paragraph1.paragraph) &&
                Objects.equals(nameOfAuthor, paragraph1.nameOfAuthor) &&
                Objects.equals(fromWhatText, paragraph1.fromWhatText);
    }


    public int hashCode() {
        return Objects.hash(super.hashCode(), paragraph, length, nameOfAuthor, fromWhatText);
    }

    @Override
    public void describeText() {
        System.out.println("About text: " + this.paragraph + ", " + this.fromWhatText + ", " + nameOfAuthor + ", " + this.length);
    }

    public static void printNameOfAuthor(String nameOfAuthor){
        System.out.println("Author: " + nameOfAuthor);
    }
}
