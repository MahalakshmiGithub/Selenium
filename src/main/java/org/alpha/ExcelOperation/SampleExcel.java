package org.alpha.ExcelOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {

	public static void main(String[] args) throws IOException {
		File excelLoc=new File("D:\\eclipse\\ExcelOperations\\src\\main\\java\\TestData\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(excelLoc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("maha");

		
		int num=s.getPhysicalNumberOfRows();//5
		System.out.println(num);
		
		Row r=s.getRow(2);
		int cellNum=r.getPhysicalNumberOfCells();//5
		System.out.println(cellNum);
		
		Cell c =r.getCell(1);//44
		System.out.println(c);
	//to print all the values in the particular row
		for(int i=0;i<r.getPhysicalNumberOfCells();i++){
			Cell itera=r.getCell(i);
			System.out.println(itera);
			
	//tyhe excel sheet contains many rows it is nt possibe		
			 /*for(int j=0;i<s.getPhysicalNumberOfRows();i++){
				Row itera1=s.getRow(j);
				System.out.println(itera1);
			
			 }	
			*/
			
		}
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++){
			Row r1=s.getRow(i);
		for(int j=0;j<r1.getPhysicalNumberOfCells();j++){
			Cell c1=r1.getCell(j);//it wil display all the details
			System.out.println(c1);
			int type1=c1.getCellType();
			System.out.println(type1);//all cell types in Row 2
		}
			
			
		}
		
		//to find  particular cell type
		int type=c.getCellType();
		System.out.println(type);//o tends to number
		
	}
}
