package util;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;

public class Sout {
    private static Scanner sc= new Scanner(System.in);
    private static GestorCoche gestorCoche = new GestorCoche();
    public static String interactuar(String text){
        System.out.println("Introduzca "+text);
        String exit=sc.nextLine();
        return exit;
    }

    public static int interIntactuar(String text){

        System.out.println("Introduzca "+text);
        int exit=sc.nextInt();
        return exit;
    }

    public static void bbdd(){
        try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();
                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.setLeading(14.5f);

                cont.newLineAtOffset(25, 700);
                List<Coche> listCoche = gestorCoche.listCar();
                for (Coche c : listCoche) {
                    String c1=c.toString();
                    System.out.println(c1);
                    cont.showText(c1);
                    cont.newLine();
                    System.out.println(c);
                }
                cont.endText();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

            doc.save("src/main/resources/BBDD.pdf");
            System.out.println("Fichero pdf creado");
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //public static void bbddExcel(){
    //    String excel= "BBDD.xlsx";
    //    String hoja= "coche";
//
    //    HSSFWorkbook workbook = new HSSFWorkbook();
    //    HSSFSheet sheet = workbook.createSheet("Mi Hoja");
//
    //    String[] primeraFila={"ID","MARCA","MODELO","KM","MATRICULA"};
//
    //    HSSFRow row = sheet.createRow(0);
    //    HSSFCell cell = row.createCell(0);
    //    cell.setCellValue("Hello, World!");
//
    //    try {
    //        OutputStream out = new FileOutputStream("src/main/resources/BBDD.xls");
    //        workbook.write(out);
    //        workbook.close();
    //        out.flush();
    //        out.close();
    //    }
    //    catch (IOException e) {
    //        System.err.println("Error at file writing");
    //        e.printStackTrace();
    //    }
//
    //}

}
