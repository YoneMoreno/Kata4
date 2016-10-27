package Control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import Model.Histogram;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4\\emails.txt";
        ArrayList<String> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
