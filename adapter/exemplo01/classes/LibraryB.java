package adapter.exemplo01.classes;

public class LibraryB {
    public void buildDocument(String text) {
        System.out.println("LibraryB: Preparando documento com texto" + text);
    }

    public void save(String filePath) {
        System.out.println("Library B: Salvando PDF em " + filePath);
    }
}
