package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Test
public class Xlsx {
    public void dataReadTest() throws IOException {
        File src = new File("C:\\Users\\smsub\\OneDrive\\Desktop\\readData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook xsf = new XSSFWorkbook(fis);
        XSSFSheet sheet = xsf.getSheetAt(0);
        String entry = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(sheet.getWorkbook());
        System.out.println(entry);
        for(Row row: sheet)
        {
            String name="abcd";
            if(row.getCell(0).getStringCellValue().equals(name)){
                System.out.println(row.getCell(1).getStringCellValue());
            }
        }
    }
}
