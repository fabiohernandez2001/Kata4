
package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {
       public static void main(String[] args) throws IOException {
       MailListReader R= new MailListReader();
       String filename = "/Users/Entrar/Documents/NetBeansProjects/Kata4/email.txt.txt";
       MailHistogramBuilder B= new MailHistogramBuilder();
       List<Mail> maiList=R.read(filename);
       Histogram <String> histogram= B.build(maiList);
       HistogramDisplay histogramDisplay= new HistogramDisplay(histogram);
       histogramDisplay.execute();
    }

}
    
