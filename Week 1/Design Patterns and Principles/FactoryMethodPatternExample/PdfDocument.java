public class PdfDocument implements DocumentType {
    public PdfDocument(){
        logger.getInstance().logDetails("Pdf Document Created.");
    }

    public void open(){
        logger.getInstance().logDetails("Pdf Document opened");
    }   
    public void save(){
        logger.getInstance().logDetails("Pdf Document saved");
    }  
    public void getType(){
        logger.getInstance().logDetails("Document Type: PDF");
    }
}
