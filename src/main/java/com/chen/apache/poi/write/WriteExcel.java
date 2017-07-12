package com.chen.apache.poi.write;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileOutputStream;

/**
 * @author liang.chen
 * @date 2017-02-07
 */
public class WriteExcel {

    public static void main(String[] args) throws Throwable {
        Workbook wb = new SXSSFWorkbook(100); // keep 100 rows in memory, exceeding rows will be flushed to disk
//        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sh = wb.createSheet();
        for(int rownum = 0; rownum < 10; rownum++){
            Row row = sh.createRow(rownum);
            for(int cellnum = 0; cellnum < 10; cellnum++){
                Cell cell = row.createCell(cellnum);
//                String address = new CellReference(cell).formatAsString();
                String address = rownum + "" + cellnum;
                cell.setCellValue(address);
            }
        }

        FileOutputStream out = new FileOutputStream("E:\\test\\sxssf.xlsx");
        wb.write(out);
        out.close();
//        wb.dispose();
    }


}
