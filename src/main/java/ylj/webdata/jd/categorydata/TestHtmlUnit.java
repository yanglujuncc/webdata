package ylj.webdata.jd.categorydata;

import java.net.URL;
import java.util.List;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

public class TestHtmlUnit {
	
	
	public static void main(String[] args) throws Exception{
		
	    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 
		//    java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

		    
	   	WebClient webClient = new WebClient(BrowserVersion.CHROME);
	   	
		//String url="http://search.jd.com/Search?keyword=%E4%BF%9D%E6%9A%96%E5%86%85%E8%A1%A3&enc=utf-8&qr=&qrst=UNEXPAND&p_range=12015%2872%2C160%29%3B1369%2899%2C195%29%3B&as=0&rt=1&stop=1&cid2=1345&click=2-1345";
		//String url="http://www.tmall.com";
		String url="http://channel.jd.com/underwear.html";
		
	    HtmlPage page =	webClient.getPage(url);
	  
	   List<?> moreSpan=page.getByXPath("//*[@id=\"service-2013\"]/dl[3]/dd/div[1]/a");
	   DomElement element  = page.getElementById("new");
	   System.out.println(moreSpan.size());
	   //System.out.println(page.asXml());
	   DomElement element2=(DomElement) moreSpan.get(0);
	   System.out.println(element2.asText());
	   /*
	      HtmlSubmitInput suButton = (HtmlSubmitInput) page.getElementById("su");
	      HtmlTextInput textField = (HtmlTextInput) page.getElementById("kw");

	     // Change the value of the text field
	     textField.setText("中国");

	     // Now submit the form by clicking the button and get back the second page.
	      HtmlPage page2 = suButton.click();

	    System.out.println(page2.asXml());
			*/
	    webClient.closeAllWindows();
}
}
