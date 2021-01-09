package applicaion;



import java.io.IOException;

import java.util.List;

public interface IHtmlToLink {
    List<Link> getLinks(String path) throws IOException;


}
