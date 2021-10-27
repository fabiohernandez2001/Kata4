
package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {
    MailListReader R;
    MailHistogramBuilder B;
    Histogram <String> histogram;
    List<Mail> mailList;
    private void input() throws IOException{
        R= new MailListReader();
        mailList=R.read("email.txt.txt");
    }
    private void process(){
       B= new MailHistogramBuilder();
       histogram= B.build(mailList);
    }
    private void output(){
        HistogramDisplay histogramDisplay= new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    private void execute() throws IOException{
        input();
        process();
        output();
    }
    public static void main(String[] args) throws IOException {
       Kata4 katasex= new Kata4();
       katasex.execute();
    }
    
}
