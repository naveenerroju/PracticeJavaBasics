//Cannot get the output as expected. broken code.

package basicpractice;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//this is an LMS practice test code
public class EmailCrawler {
    public static void main(String[] args) {
        String emailText = "Kindly check the attendence of this month";
        String sender = "Naveen";
        String recipient = "Keerthi";
        String heading = "Update the attendence";
        Email em = new Email(emailText,sender,recipient,heading);
        System.out.println(em.toString());
    }
}
class Document{
    private String emailText;
    public String toString(){
        return this.emailText;
    }
}
class Email{
    private String sender;
    private String recipient;
    private String title;
    private String emailText;

    //constructor
    public Email(String emailText, String sender, String recipient, String title) {
        this.emailText = emailText;
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
    }
    //Getters and Setters
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){

        StringBuffer sb = new StringBuffer(this.emailText);
        sb.append("From:"+this.sender);
        sb.append("to:"+this.recipient);
        sb.append(this.title);

        return sb.toString();
    }
}
class Source{
    static boolean containsKeyword(Document docObject, String keyword){
        List<String> strs = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(docObject.toString());
        while (st.hasMoreTokens()){
            strs.add(st.nextToken());
        }
        return strs.contains(keyword)?true:false;
    }
}
