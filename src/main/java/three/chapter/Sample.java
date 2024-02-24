package three.chapter;

import java.io.FileInputStream;
import java.io.IOException;

public class Sample {

      /*try(
      FileInputStream file = new
            FileInputStream(new File("Sample.xlsx"))) {
        // ...
      }
   } catch (IOException e){
        // Handle exceptions
   }

   An instance of a XSSWorkbook class is created
   using the spreadsheet. Since a workbook may
   consists of multiple spreadsheets, we select the
   first one using the getSheetAt method.

   XSSFWorkbook workbook = new
   XSSFWorkbook(file);
   XSSFSheet sheet =
   workbook.getSheetAt(0);

   The next step is to iterate through the rows, and
   then each column, of the spreadsheet:

   for(Row row : sheet) {
        for (Cell cell : row) {
            ...
        }
   out.println();

   Each cell of the spreadsheet may use a different
   format. We use the getCellType method to
   determine its type and then use the appropriate
   method to extract the data in the cell. In this
   example we are only working with numeric and
   text data.

   switch (cell.getCellType()) {
        case Cell.CELL_TYPE_NUMERIC:

        out.print(cell.getNumericCellValue()
        + "\t");
            break;
        case Cell.CELL_TYPE_STRING:

        put.print(cell.getStringCellValue()
        + "\t");
            break;
        }

        When executed we get the following output:

        ID Minimum Maximum Average
        12345.0 45.0 89.0 65.55
        23456.0 78.0 96.0 86.75
        34567.0 56.0 89.0 67.44
        45678.0 86.0 99.0 95.67

        POI supports other more sophisticated classes and
        methods to extract data.
   */
}