package class28;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> data= ExcelReader.readExcelData("String path=\"C:\\\\Users\\\\Nabi\\\\IdeaProjects\\\\java basics\\\\Files\\\\Employees.xlsx\"","Sheet1");
        System.out.println(data.get(0));
    }
}
