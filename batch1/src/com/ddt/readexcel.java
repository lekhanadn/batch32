package com.ddt;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File src=new File("C:\\Users\\Venu\\Desktop\\excel\\testdata.xlsx");
        FileInputStream fis=new FileInputStream(src);
         	XSSFWorkbook Workbook = new XSSFWorkbook(fis);
         XSSFSheet sheet1=Workbook.getSheetAt(0);
      String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
      System.out.println(data0);
	}

}
