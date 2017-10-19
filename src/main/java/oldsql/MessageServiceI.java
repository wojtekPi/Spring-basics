package oldsql;

public class MessageServiceI implements MessageService {

    private final String valueToPrint;

    public MessageServiceI(String valueToPrint) {

        this.valueToPrint = valueToPrint;
    }

    public String getMessage() {
        return valueToPrint;
    }
}
