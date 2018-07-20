import java.util.Objects;

public class Sentence extends Word implements Text{

    String sentence;
    protected int numberOfPages;
    static String nameOfAuthor;
    String titleOfStory;

    public void printInfo(){
        System.out.println("Without data.");
    }
    public void printInfo(String sentence){
        System.out.println("Information: " + sentence);
    }
    public void printInfo(String sentence, String titleOfStory ){
        System.out.println("Information: " + sentence + ", " + titleOfStory);
    }
    public void printInfo(String sentence, int numberOfPages ){
        System.out.println("Information: " + sentence + ", " + numberOfPages);
    }

    public  Sentence() {}

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(String sentence, String titleOfStory) {
        this.sentence = sentence;
        this.titleOfStory = titleOfStory;
    }

    public Sentence(String sentence, String titleOfStory, String nameOfAuthor) {
        this.sentence=sentence;
        this.titleOfStory=titleOfStory;
        nameOfAuthor = nameOfAuthor;
    }
    public Sentence(String sentence, String titleOfStory, String nameOfAuthor, int numberOfPages) {
        this.sentence=sentence;
        this.titleOfStory=titleOfStory;
        nameOfAuthor = nameOfAuthor;
        this.numberOfPages= numberOfPages;
    }


    @Override
    public void getPrint() {
        System.out.println("Sentence");
    }
    @Override
    public String getPrinText() {
        return sentence;
    }
    @Override
    public String toString(){
        return nameOfAuthor+titleOfStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        if (!super.equals(o)) return false;
        Sentence sentence1 = (Sentence) o;
        return numberOfPages == sentence1.numberOfPages &&
                Objects.equals(sentence, sentence1.sentence) &&
                Objects.equals(nameOfAuthor, sentence1.nameOfAuthor) &&
                Objects.equals(titleOfStory, sentence1.titleOfStory);
    }

    @Override
    public int hashCode() {
        return (int) 11*numberOfPages + ((null==sentence)?0:sentence.hashCode())+ ((null==nameOfAuthor)?0:nameOfAuthor.hashCode()) + ((null==titleOfStory)?0:titleOfStory.hashCode());
    }


    @Override
    public void describeText() {
        System.out.println("About text: " + this.sentence + ", " + nameOfAuthor + ", " + this.titleOfStory);
    }

    public static void printNameOfAuthor(String nameOfAuthor){
        System.out.println("Author: " + nameOfAuthor);
    }
}
