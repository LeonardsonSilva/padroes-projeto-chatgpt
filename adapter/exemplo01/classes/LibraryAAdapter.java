package adapter.exemplo01.classes;

import adapter.exemplo01.interfaces.PDFGenerator;

public class LibraryAAdapter implements PDFGenerator {
    private final LibraryA libraryA;

    public LibraryAAdapter(LibraryA libraryA) {
        this.libraryA = libraryA;
    }

    @Override
    public void generatePDF(String content, String filePath) {
        libraryA.createPDF(content, filePath);
    }

}
