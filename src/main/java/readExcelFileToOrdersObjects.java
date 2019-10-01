
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class readExcelFileToOrdersObjects {
    public static void main(String[] args) {

        List orders = readOrders("C:\\Users\\a229900\\git\\excel_to_json\\src\\main\\resources\\Orders.xlsx");
        convertToJson(orders,"C:\\Users\\a229900\\git\\excel_to_json\\src\\main\\resources\\orders.json");
    }
    public static List readOrders(String path){
        try {
            //getting the file
            FileInputStream orderFile = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(orderFile);

            Sheet sheet = workbook.getSheet("Orders");
            Iterator rows  = sheet.iterator();

            List orderLists = new ArrayList();

            int rowNumber = 0;
            while(rows.hasNext()){
                Row currentRow = (Row) rows.next();

                //skip header
                if(rowNumber==0){
                    rowNumber++;
                    continue;
                }
                Iterator cellsInRow = currentRow.iterator();

                Orders orders = new Orders();

                int cellIndex=0;

                while(cellsInRow.hasNext()){
                    Cell currentCell = (Cell) cellsInRow.next();

                    switch (cellIndex){
                        case 0:
                            orders.setOrderId(currentCell.getStringCellValue());
                            break;
                        case 1:
                            orders.setOrderDate(String.valueOf(currentCell.getNumericCellValue()));
                            break;
                        case 2:
                            orders.setShipDate(String.valueOf(currentCell.getNumericCellValue()));
                            break;
                        case 3:
                            orders.setShipMode(currentCell.getStringCellValue());
                            break;
                        case 4:
                            orders.setCustomerID(String.valueOf(currentCell.getStringCellValue()));
                            break;
                        case 5:
                            orders.setCustomerName(currentCell.getStringCellValue());
                            break;
                        case 6:
                            orders.setCountry(currentCell.getStringCellValue());
                            break;
                        case 7:
                            orders.setRegion(currentCell.getStringCellValue());
                            break;
                        case 8:
                            orders.setProductId(currentCell.getStringCellValue());
                            break;
                        case 9:
                            orders.setSalesAmount(String.valueOf(currentCell.getNumericCellValue()));
                            break;
                        case 10:
                            orders.setQuantity(String.valueOf(currentCell.getNumericCellValue()));
                            break;
                        case 11:
                            orders.setDiscountAmount(String.valueOf(currentCell.getNumericCellValue()));
                            break;
                        case 12:
                            orders.setProfitAmount(String.valueOf(currentCell.getNumericCellValue()));
                            break;

                    }
                    cellIndex++;
                }
                orderLists.add(orders);
            }
            //workbook.close();

        return  orderLists;
        }catch (IOException ex){
            throw new RuntimeException("FAIL! -> message = " + ex.getMessage());
        }
    }

    public static void convertToJson(List orders, String pathfile){
        //orders.json
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(pathfile);
        //String jsonString = "";
        try{
            mapper.writeValue(file,orders);
            //jsonString = mapper.writeValueAsString(orders);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
