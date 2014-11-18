package ylj.webdata.jd.categorydata;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args ) throws Exception
    {
    	URL url=new URL("http://search.jd.com/Search?keyword=%E4%BF%9D%E6%9A%96%E5%86%85%E8%A1%A3&enc=utf-8&qr=&qrst=UNEXPAND&p_range=12015%2872%2C160%29%3B1369%2899%2C195%29%3B&as=0&rt=1&stop=1&cid2=1345&click=2-1345");
    	int timeoutMillis=10000;
    	Document doc=Jsoup.parse(url, timeoutMillis);
    	FileUtils.write(new File("category-page"), doc.toString(), "utf-8");
    	
       System.out.println(doc);
    }
}
