package com.chen.apache.poi.read;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * @author liang.chen
 * @date 2017-02-07
 */
public class ReadExcel {

    public static void main(String[] args) throws IOException {

//        // 这种是读取xlsx格式的excel
//        InputStream fileInputStream = new FileInputStream("E:\\test\\sxssf.xlsx");
//        Workbook wb = new XSSFWorkbook(fileInputStream);
//        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
//            Sheet sheet = wb.getSheetAt(i);
//            System.out.println(wb.getSheetName(i));
//            for (Row row : sheet) {
//                System.out.print("rownum: " + row.getRowNum() + " - ");
//                for (Cell cell : row) {
//                    System.out.print(cell.toString() + " ");
//                }
//                System.out.println();
//            }
//        }

        // 这种是读取xls格式的excel
//        InputStream fileInputStream = new FileInputStream("E:\\test\\test.xls");
//        Workbook wb = new HSSFWorkbook(fileInputStream);
//        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
//            Sheet sheet = wb.getSheetAt(i);
//            System.out.println(wb.getSheetName(i));
//            for (Row row : sheet) {
//                System.out.print("rownum: " + row.getRowNum() + " - ");
//                for (Cell cell : row) {
//                    System.out.print(cell.toString() + " ");
//                }
//                System.out.println();
//            }
//        }

        System.out.println(StringUtils.split("", ",").length);

    }

}
