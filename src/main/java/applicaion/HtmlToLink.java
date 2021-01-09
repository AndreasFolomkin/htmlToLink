package applicaion;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HtmlToLink implements IHtmlToLink {
    private List<Link> links = new ArrayList<>();


    @Override
    public List<Link> getLinks(String path) throws IOException {

        File input = new File(path);         // get the file along the path
        Document doc = Jsoup.parse(input, "UTF-8");  // parse a file into a document
        Elements elements = doc.getElementsByAttributeValueMatching("data-asin", "\\w");        //select all products from the document to the list of elements

        for (int i = 0; i < elements.size(); i++) {
            String link = elements.get(i).getElementsByClass("a-link-normal a-text-normal").attr("href");     //select a link from each element
            String name = elements.get(i).getElementsByClass("a-link-normal a-text-normal").select("span").text();      //find a name from each element

            // we find from each element a rating with an asterisk. (using select ("span"). text (); we get the first span that comes across in the element)
            String starRating = elements.get(i).getElementsByClass("a-section a-spacing-none a-spacing-top-micro").select("span").attr("aria-label");

            //we find the rating from each element (using select ("span: eq (1)"). attr ("aria-label"); we get the second span that comes across in the element)
            String rating = elements.get(i).getElementsByClass("a-section a-spacing-none a-spacing-top-micro").select("span:eq(1)").attr("aria-label");

            if (rating.equalsIgnoreCase("") || rating == null) rating = "Non";  // check for null and empty field
            if (starRating.equalsIgnoreCase("") || rating == null) starRating = "Non";   // check for null and empty field

            String starRating1 = starRating.substring(0, 3);    //trim unnecessary text
            try {
                Double doble = Double.parseDouble(starRating1);    // check starRating1 does not contain literal values
            } catch (NumberFormatException e) {
                starRating1 = "non";   //if the value contains letters, set it to non
            }

            links.add(new Link(name, link, starRating1, rating));   //
        }
        return links;
    }
}
