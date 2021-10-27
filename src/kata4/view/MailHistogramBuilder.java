
package kata4.view;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;


public class MailHistogramBuilder {
    
    public Histogram <String> build(List <Mail> mail){
        Histogram<String> hist= new Histogram<>();
        String[] list;
        for(Mail i: mail){
            list=i.getDomain().split("@");
            hist.increment(list[1]);
        }
        return hist;
    }
}
