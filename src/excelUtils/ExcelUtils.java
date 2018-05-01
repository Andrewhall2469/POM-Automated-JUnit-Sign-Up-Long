package excelUtils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {

    static String firstName = "";
    static String lastName = "";
    static String email = "";
    static String password = "";
    static String birthDay = "";
    static String birthMonth = "";
    static String birthYear = "";
    static String company = "";
    static String address = "";
    static String city = "";
    static String state = "";
    static String zipCode = "";
    static String mobile = "";
    static String addressAlias = "";

    private static final String FILE_NAME = System.getProperty("user.dir") + "\\ExcelFile.xlsx";

    public void initialise() {

        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            firstName = datatypeSheet.getRow(1).getCell(0).getStringCellValue();
            lastName = datatypeSheet.getRow(1).getCell(1).getStringCellValue();
            email = datatypeSheet.getRow(1).getCell(2).getStringCellValue();
            password = datatypeSheet.getRow(1).getCell(3).getStringCellValue();
            birthDay = datatypeSheet.getRow(1).getCell(4).getStringCellValue();
            birthMonth = datatypeSheet.getRow(1).getCell(5).getStringCellValue();
            birthYear = datatypeSheet.getRow(1).getCell(6).getStringCellValue();
            company = datatypeSheet.getRow(1).getCell(7).getStringCellValue();
            address = datatypeSheet.getRow(1).getCell(8).getStringCellValue();
            city = datatypeSheet.getRow(1).getCell(9).getStringCellValue();
            state = datatypeSheet.getRow(1).getCell(10).getStringCellValue();
            zipCode = datatypeSheet.getRow(1).getCell(11).getStringCellValue();
            mobile = datatypeSheet.getRow(1).getCell(12).getStringCellValue();
            addressAlias = datatypeSheet.getRow(1).getCell(13).getStringCellValue();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getfirstName() {
        return firstName;
    }
    
    public static String getlastName() {
        return lastName;
    }
    
    public static String getEmail() {
        return email;
    }


    public static String getPassword() {
        return password;
    }
    
    public static String getBirthDay() {
        return birthDay;
    }
    
    public static String getBirthMonth() {
        return birthMonth;
    }
    
    public static String getBirthYear() {
        return birthYear;
    }
    
    public static String getCompany() {
        return company;
    }
    
    public static String getAddress() {
        return address;
    }
    
    public static String getCity() {
        return city;
    }
    
    public static String getState() {
    	return state;
    }
    
    public static String getZipCode() {
        return zipCode;
    }
    
    public static String getMobile() {
        return mobile;
    }
    
    public static String getAddressAlias() {
        return addressAlias;
    }


    public void printLine() {
        System.out.println(getfirstName());
        System.out.println(getlastName());
        System.out.println(getEmail());
        System.out.println(getPassword());
        System.out.println(getBirthDay());
        System.out.println(getBirthMonth());
        System.out.println(getBirthYear());
        System.out.println(getCompany());
        System.out.println(getAddress());
        System.out.println(getCity());
        System.out.println(getZipCode());
        System.out.println(getMobile());
        System.out.println(getAddressAlias());
    }
}