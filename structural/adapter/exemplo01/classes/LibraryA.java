package structural.adapter.exemplo01.classes;

public class LibraryA {
    public void createPDF(String content, String filePath) {
        System.out.println("LibraryA: Gerando PDF em: " + filePath);
    }
}
