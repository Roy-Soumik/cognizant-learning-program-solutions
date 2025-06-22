public class WordDocument implements DocumentType {

    public WordDocument(){
        logger.getInstance().logDetails("Word Document Created.");
    }

    public void open(){
        logger.getInstance().logDetails("Word Document opened");
    }   
    public void save(){
        logger.getInstance().logDetails("Word Document saved");
    }  
    public void getType(){
        logger.getInstance().logDetails("Document Type: Word Document");
    }
}
