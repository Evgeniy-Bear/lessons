import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TimeoutException {
        throw new TimeoutException();
    }

}

class TimeoutException extends IOException {
public TimeoutException(){

}
public TimeoutException(String message){
    super(message);
}
}