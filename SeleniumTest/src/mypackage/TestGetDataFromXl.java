package mypackage;

import java.io.IOException;

import jxl.read.biff.BiffException;

public class TestGetDataFromXl {

	public static void main(String[] args) throws BiffException {
		try {
			GetDataFromXl data = new GetDataFromXl("C:\\Users\\mahak\\Desktop\\jobserve.xls","Droplist");
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//String values = data.getData(SheetName,colno,rowno);
	//String[] selections = values.split(",");
	//for(i = 0; i<selections.length;i++){
		
	}

}
