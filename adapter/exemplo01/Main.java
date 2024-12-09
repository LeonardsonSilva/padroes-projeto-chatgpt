package adapter.exemplo01;

import adapter.exemplo01.classes.LibraryA;
import adapter.exemplo01.classes.LibraryAAdapter;
import adapter.exemplo01.classes.LibraryB;
import adapter.exemplo01.classes.LibraryBAdapter;
import adapter.exemplo01.interfaces.PDFGenerator;

public class Main {
    public static void main(String[] args) {
        // usando LibraryA
        LibraryA libraryA = new LibraryA();
        PDFGenerator adapterA = new LibraryAAdapter(libraryA);
        PDFClient clientA = new PDFClient(adapterA);
        clientA.createPDF("Conteúdo para LibraryA", "fileA.pdf");

        // usando LibraryB
        LibraryB libraryB = new LibraryB();
        PDFGenerator adapterB = new LibraryBAdapter(libraryB);
        PDFClient clientB = new PDFClient(adapterB);
        clientB.createPDF("Conteúdo para LibraryB", "fileB.pdf");
    }
}
