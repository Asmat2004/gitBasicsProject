package Project2;

public class countWords {
    public static void main(String[] args) {

        var word="hello world!";
        String [] wordList=word.split(" ");

        var count=0;
        for (int i = 0; i < wordList.length ; i++) {

            count++;
        }
        System.out.println(count);

    }
}
