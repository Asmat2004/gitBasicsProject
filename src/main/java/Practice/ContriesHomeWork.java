package Practice;

public class ContriesHomeWork {
    public static void main(String[] args) {

        String[][] countries = {
                {"USA", "Canada", "Green land", "Mexico"},
                {"Brazil", "Chile"," Argentina","Peru"},
                {"Joke", "Laugh", "John Ahmed", "Mohammad"},
                {"Gui", "Backend", "Front", "API"},
        };

      //  for (int i = 0; i < countries.length ; i++) {
      //      for (int j = 0; j <countries.length ; j++) {
      //          System.out.println(countries[i][j]+" ");
      //      }
       //     System.out.println();
int count=0;
        for (String [] break1: countries){
            for (String break2:break1){
                System.out.print(break2+" ");
                count=count+=1;
            }
            System.out.println();

        }
        System.out.println("You see " +count+ "Countries");
        }


    }

