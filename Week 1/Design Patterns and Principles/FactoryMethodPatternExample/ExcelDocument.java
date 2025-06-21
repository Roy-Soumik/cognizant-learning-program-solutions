public class ExcelDocument implements DocumentType{
    public ExcelDocument(){
        logger.getInstance().logDetails("Excel Document Created.");
    }
    
    public void open(){
        logger.getInstance().logDetails("Excel Document opened.");
    }   
    public void save(){
        logger.getInstance().logDetails("Excel Document saved.");
    }  
    public void getType(){
        logger.getInstance().logDetails("Document Type: Excel.");
    }
}
