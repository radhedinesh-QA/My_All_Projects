package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public static Object[][] readExcel(String filePath, String sheetName) throws Exception {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet(sheetName);

        List<Object[]> data = new ArrayList<>();

        // Skip the header row
        Iterator<Row> rows = sheet.iterator();
        if (rows.hasNext()) rows.next(); 

        while (rows.hasNext()) {
            Row row = rows.next();
            int columnCount = row.getPhysicalNumberOfCells();
            Object[] rowData = new Object[columnCount];

            for (int i = 0; i < columnCount; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                switch (cell.getCellType()) {
                    case STRING:
                        rowData[i] = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            rowData[i] = cell.getDateCellValue();
                        } else {
                            rowData[i] = (int) cell.getNumericCellValue(); // use double if decimals expected
                        }
                        break;
                    case BOOLEAN:
                        rowData[i] = cell.getBooleanCellValue();
                        break;
                    case BLANK:
                        rowData[i] = "";
                        break;
                    default:
                        rowData[i] = cell.toString(); // Fallback
                }
            }

            data.add(rowData);
        }

        workbook.close();
        file.close();

        return data.toArray(new Object[0][]);
    }

	public static Object[][] readExcel(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}