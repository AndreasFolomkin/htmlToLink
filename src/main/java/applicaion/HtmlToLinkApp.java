package applicaion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtmlToLinkApp {
    public static void main(String[] args) throws IOException {


        IHtmlToLink iHtmlToLink = new HtmlToLink();

       List<Link> links =  iHtmlToLink.getLinks("data/samsung s20 case _ eBay.html");
        for (Link link: links
             ) {
            System.out.println(link.toString());

        }
        System.out.println(links.size());



    }
}
