package class21;

public abstract class File {


    abstract void open();


    void edit(){

    }
    void close(){

    }

}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("open Java");
    }
    @Override
    void edit(){
        System.out.println("edit Java");
    }
    @Override
    void close(){
        System.out.println("close Java ");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("open Word");
    }
    @Override
    void edit(){
        System.out.println("edit Word");
    }
    @Override
    void close(){
        System.out.println("close Word");
    }
}
class pdfFile extends File{

    @Override
    void open() {
        System.out.println("open pdf");
    }
    @Override
    void edit(){
        System.out.println("edit pdf");
    }
    @Override
    void close(){
        System.out.println("close pdf ");
    }
}
class FileTester{
    public static void main(String[] args) {

        File [] arr={new JavaFile(),new WordFile(),new pdfFile()};

        for (File a:arr){
            a.open();
            a.edit();
            a.close();
        }
    }


}