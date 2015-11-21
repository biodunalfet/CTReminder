package apps.sojourner.com.ctreminder;

/**
 * Created by Hamza Fetuga on 8/1/2015.
 */
public class TestReminder {

    public String id;

    public String calleeName;

    public String calleeNumber;

    public String TimeAndDate;

    public String DescriptiveText;

    public String Message;

    public TestReminder(String id, String calleeName, String calleeNumber, String timeAndDate, String descriptiveText, String message) {
        this.id = id;
        this.calleeName = calleeName;
        this.calleeNumber = calleeNumber;
        TimeAndDate = timeAndDate;
        DescriptiveText = descriptiveText;
        Message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalleeName() {
        return calleeName;
    }

    public void setCalleeName(String calleeName) {
        this.calleeName = calleeName;
    }

    public String getCalleeNumber() {
        return calleeNumber;
    }

    public void setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
    }

    public String getTimeAndDate() {
        return TimeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        TimeAndDate = timeAndDate;
    }

    public String getDescriptiveText() {
        return DescriptiveText;
    }

    public void setDescriptiveText(String descriptiveText) {
        DescriptiveText = descriptiveText;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
