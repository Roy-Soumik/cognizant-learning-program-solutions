public class Main {
    public static void main(String[] args) {
        DocumentFactory df = new DocumentFactory();

        logger.getInstance().logDetails("\nFor Word Document");
        DocumentType word = df.getDocumentType("word");
        word.open();
        word.save();
        word.getType();

        logger.getInstance().logDetails("\nFor PDF Document");
        DocumentType pdf = df.getDocumentType("pdf");
        pdf.open();
        pdf.save();
        pdf.getType();

        logger.getInstance().logDetails("\nFor Excel Document");
        DocumentType excel = df.getDocumentType("excel");
        excel.open();
        excel.save();
        excel.getType();
    }
}
