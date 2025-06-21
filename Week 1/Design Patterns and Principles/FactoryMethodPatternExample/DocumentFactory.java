public class DocumentFactory {
    public DocumentType getDocumentType(String str){
        DocumentType doctype;
        if (str.equalsIgnoreCase("word")){
            doctype = new WordDocument();
        } else if (str.equalsIgnoreCase("pdf")){
            doctype = new PdfDocument();
        } else {
            doctype = new ExcelDocument();
        }
        return doctype;
    }
}
