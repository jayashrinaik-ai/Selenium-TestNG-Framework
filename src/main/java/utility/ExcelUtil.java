package utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	/**
	 * Reads an Excel sheet and returns Object[][] where each row = one data set.
	 * Skips totally empty rows.
	 */

	public static Object[][] readExcelData(String filePath, String sheetName) {

		List<Object[]> rows = new ArrayList<>();

		DataFormatter formatter = new DataFormatter();


		try (FileInputStream fis = new FileInputStream(filePath);

				Workbook workbook = WorkbookFactory.create(fis)) {


			Sheet sheet = workbook.getSheet(sheetName);

			if (sheet == null )
			{
				throw new RuntimeException("sheet '" + sheetName + "' not found in " + filePath);
			}


			Row header = sheet.getRow(0);

			if(header == null ) throw new RuntimeException("Header row missing in sheet : " + sheetName );

			int colCount = header.getLastCellNum()	;

			int lastRow = sheet.getLastRowNum();

			for(int r = 1; r <= lastRow ; r++  ) {

				Row row = sheet.getRow(r);

				if(row == null) continue;

				Object[] rowData = new Object[colCount];

				boolean allBlank = true;

				for(int c = 0; c < colCount ; c++ ) {

					Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

					String value = formatter.formatCellValue(cell).trim();

					if(!value.isEmpty()) allBlank = false;
					
					rowData[c] = value;
				}

				if(!allBlank) rows.add(rowData);
			}
				
			} catch (Exception e ) {

				throw new RuntimeException("Error reading Excel file: " + e.getMessage(), e);

			}

			return rows.toArray(new Object[0][]);
		}
	}

		/**
		 * Optional: returns each row as a Map<String,String> (header->value).
		 * Useful when you don't want to rely on column order.
		 */

		//		public static Object[][] readExcelAsMaps(String filePath, String sheetName) {
		//			
		//			List<Object[]> rows = new ArrayList<>();
		//			
		//			
		//		}
		//	}
	
