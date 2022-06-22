package nl.wessel.platform.B.BusinessLogic.Exception;

public class RecordNotFound extends RuntimeException {

    public RecordNotFound(Object object) {
        super("Error: could not find that " + object.getClass().getSimpleName());
    }
}
