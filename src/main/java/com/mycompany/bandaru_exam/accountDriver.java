/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bandaru_exam;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author S525796
 */
public class accountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        // TODO code application logic here
        ReadfromExcel rd = new ReadfromExcel();
        List<Account> accountList = rd.getAccountListFromExcel();
        for (Account a : accountList) {
            System.out.println(a.getFirstName());
        OutputStream file = new FileOutputStream(new File(a.getLastName()+".pdf"));
        Document document = new Document();
        PdfWriter.getInstance(document, file);

        //Inserting Image in PDF
        Image image = Image.getInstance("logo.png");
        image.scaleAbsolute(600f, 100f);//image width,height
						          

        //Now Insert Every Thing Into PDF Document
        document.open();//PDF document opened........			       
        document.add(image);
        document.add(new Paragraph("Welcome! "+a.getFirstName()+" "+a.getLastName()+"!"));
        document.add(new Paragraph(" "));
        document.add(new Paragraph("        "+"Below are your Account Details :"));
        document.add(new Paragraph("        "+"First Name:"+a.getFirstName()));
        document.add(new Paragraph("        "+"Last Name:"+a.getLastName()));
        document.add(new Paragraph("        "+"Account Number:"+a.getAccNumber()));
        document.add(new Paragraph("        "+"Account Balance:$"+a.getBalance()));
        document.close();
        file.close();
        }
    }

}
