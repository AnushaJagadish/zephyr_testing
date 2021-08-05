package Reusable_Functions;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Test {
    public static void parse_report() throws IOException {
        String url="http://localhost:63342/zephyr_testing-Main/AutomationFramework/Reports/Regression_Suite 3-Aug-21 18-24-06/Reports.html";
        Document doc=Jsoup.connect(url).get();

    }
}
