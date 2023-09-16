package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadExcel
{
    public static String excel(int row, int column)
    {
        String testData= null;
        try {
            //  String filepath = /Users//Library////src/main/resources/Book1.xlsx
            String filePath = System.getProperty("user.dir") + "/src/main/resources/Book1.xlsx";
            //  System.out.println(filePath);
            FileInputStream file = new FileInputStream(filePath);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet ws = wb.getSheetAt(0);
            testData = String.valueOf(ws.getRow(row).getCell(column));
            wb.close();
            file.close();

        } catch (Exception e)
        {
            System.out.println("Excel Read" + e);
        }
        return testData;
    }


}
