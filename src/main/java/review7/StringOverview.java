package review7;

public class StringOverview {
    public static void main(String[] args) {

        String phone="iphone";

        String color=new String();
        color="yellow";

        String day=new String("thursday");

        String sentence="   Today is september 7    ";

        int size=sentence.length();
        System.out.println(size);

        sentence=sentence.trim();       //Today is september 7
        System.out.println(sentence);

        String [] words=sentence.split(" ");
        System.out.println(words[0]);

        String modifiedNewString= sentence.replace("Today","tommorrow ");
        System.out.println(modifiedNewString);

        String str1="Hi Hi Friends";
        str1=str1.replace("Hi","Hello");
        System.out.println(str1);

        str1=str1.replaceFirst("Hello","Bye");
        System.out.println(str1);

        char letter=str1.charAt(2);
        System.out.println(letter);

        int indexOFCharB=str1.indexOf('B');
        System.out.println(indexOFCharB);






    }
}
