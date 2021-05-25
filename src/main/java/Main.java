
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Unzip unzip = new Unzip();
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats the path?");
        String path = scanner.nextLine();
        System.out.println("where to extract it to:");
        String destination = scanner.nextLine();
        unzip.unzip(path, destination);
        Document doc = Jsoup.parse(new File(destination + "/events.html"), "utf-8");
        Elements errors = doc.select("even");
        System.out.println(errors);

    }
}
///Users/ethanbhm/Downloads/xlt-20210218-1700-tint-4000PIs.report.tar
///Users/ethanbhm/Desktop/test