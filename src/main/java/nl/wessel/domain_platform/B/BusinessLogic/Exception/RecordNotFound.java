package nl.wessel.domain_platform.B.BusinessLogic.Exception;

public class RecordNotFound extends RuntimeException{

    public RecordNotFound(String message){
        super("error: " + message);
    }
}
