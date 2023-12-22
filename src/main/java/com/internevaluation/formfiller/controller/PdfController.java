package com.internevaluation.formfiller.controller;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;

@RestController
public class PdfController {
    @GetMapping("/generate")
    public String generatePdf() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Priyanshu\\OneDrive\\Desktop\\Training\\internion\\form-backend\\src\\main\\java\\com\\internevaluation\\formfiller\\datafolder"));
        }catch (Exception e){
            e.printStackTrace();
        };
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Hello World", font);
        try {
            document.add(chunk);
        }catch (Exception e){
            e.printStackTrace();
        }
        document.close();
        return "added success";
    }
}
