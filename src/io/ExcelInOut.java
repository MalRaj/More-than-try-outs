package io;


public class ExcelInOut {
//	public static void main(String[] args) throws IOException{
//		loadExcelData("/Users/malavika_parvathy/Desktop/BICEP_ZPD_Report_23_Apr.xls");
//		writeExcelData("/Users/malavika_parvathy/Desktop/BICEP_ZPD_Report_23_Apr.xls");
//	}
//	
//	public static void loadExcelData(String inputFilePath) throws IOException{
//	    File inputWorkbook = new File(inputFilePath);
//	    Workbook w;
//	    try {
//	      w = Workbook.getWorkbook(inputWorkbook);
//	      // Get the first sheet
//	      Sheet sheet = w.getSheet(1);
//	      int columnIndex = 0;
//	      // Loop over first 10 column and lines
//	      Cell[] headerRows = sheet.getRow(0);
//	      for (int i = 0; i < headerRows.length; i++) {
//			if(headerRows[i].getContents().equalsIgnoreCase("Client Value")){
//				columnIndex = i;
//				break;
//			}
//		}
//	      
//        for (int j = 1; j<sheet.getRows();j++) {
//          Cell cell = sheet.getCell(columnIndex, j);
//            System.out.println("Column Client Values :: "
//                + cell.getContents());
//        }
//	    } catch (BiffException e) {
//	      e.printStackTrace();
//	    }
//	  }
//
//	
//	public static void writeExcelData(String inputFilePath) throws IOException{
//	    File inputWorkbook = new File(inputFilePath);
//	    Workbook w;
//	    try {
//	      w = Workbook.getWorkbook(inputWorkbook);
//	      WritableWorkbook copy = Workbook.createWorkbook(new File("/Users/malavika_parvathy/Desktop/final.xls"),
//	                w);
//	      
//	      // Get the first sheet
//	      WritableSheet sheet = copy.getSheet(1);
//	      
//	      Cell[] headerRows = sheet.getRow(0);
//	      jxl.write.Label headerWritableCell =  new jxl.write.Label(headerRows.length,0,"Category");
//            //position of the new cell in column,row
//        //can be a new Label() or new Number() or new Formula
//
//        sheet.addCell(headerWritableCell);
//        for (int j = 1; j<sheet.getRows();j++) {
//  	        jxl.write.Label anotherWritableCell =  new jxl.write.Label(headerRows.length,j ,"some value");
//  	                //position of the new cell in column,row
//  	            //can be a new Label() or new Number() or new Formula
//
//  	            sheet.addCell(anotherWritableCell);
//        }
//        
//        copy.write();
//        copy.close();
//	    } catch (BiffException e) {
//	      e.printStackTrace();
//	    } catch (RowsExceededException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (WriteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  }

	
}

