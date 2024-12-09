package structural.adapter.exemplo01;

import structural.adapter.exemplo01.interfaces.PDFGenerator;

public class PDFClient {
    private final PDFGenerator pdfGenerator;

    public PDFClient(PDFGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    public void createPDF(String content, String filePath) {
        pdfGenerator.generatePDF(content, filePath);
    }
}
