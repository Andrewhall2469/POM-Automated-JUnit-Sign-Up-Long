package excelUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApachePOIExcelWrite {

    private static final String FILE_NAME = System.getProperty("user.dir") + "\\ExcelFile.xlsx";

    public void init() {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("SignUpDetails");
        Object[][] datatypes = {
                {"FirstName", "LastName", "Email", "Password", "BirthDay", 
                	"BirthMonth", "BirthYear", "Company", "Address", 
                	"City", "State", "ZipCode", "Mobile", "Address Alias"},
                {"Andrew", "Hall", "sjakewkjd@hotmail.com", "Password1!", "28", "January", "1995", "QAC",
                		"1 Anchorage Quay", "Montgomery", "A", "35006", "07979797979",
                		"aaaaa"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}