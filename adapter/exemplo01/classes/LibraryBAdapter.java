package adapter.exemplo01.classes;

import adapter.exemplo01.interfaces.PDFGenerator;

public class LibraryBAdapter implements PDFGenerator {
    private final LibraryB libraryB;

    public LibraryBAdapter(LibraryB libraryB) {
        this.libraryB = libraryB;
    }

    @Override
    public void generatePDF(String content, String filePath) {
        libraryB.buildDocument(content);
        libraryB.save(filePath);
    }
}
