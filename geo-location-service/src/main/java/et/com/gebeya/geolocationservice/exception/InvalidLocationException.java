package et.com.gebeya.geolocationservice.exception;

public class InvalidLocationException extends RuntimeException{
    public InvalidLocationException(String message){
        super(message);
    }
}
