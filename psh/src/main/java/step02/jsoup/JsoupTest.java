package step02.jsoup;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.domain.Content;

public class JsoupTest {
	public static void main(String[] args) {
		//	step01
		Document doc = null;
		try {
			doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
//			System.out.println(doc);
			System.out.println(doc.title());
			
			System.out.println(doc.select("#mp-itn > ul > li:nth-child(1) > b > a"));
			System.out.println();
			System.out.println(doc.select("#mp-itn > ul > li:nth-child(1) > b > a").attr("href"));
			System.out.println(doc.select("#mp-itn > ul > li:nth-child(1) > b > a").attr("title"));
			System.out.println();
			System.out.println(doc.select("#mp-itn > ul > li:nth-child(2) > b > a").attr("href"));
			System.out.println(doc.select("#mp-itn > ul > li:nth-child(2) > b > a").attr("title"));

			System.out.println();
			Elements contents = doc.select("#mp-itn > ul > li > b > a");
			
			ArrayList<Content> contentList = new ArrayList<Content>();
			
			for(Element content : contents) {
				System.out.println(content.absUrl("href"));	// https://en.wikipedia.org/wiki/Memorial_(society)  : 절대 경로
//				System.out.println(content.attr("href"));	// /wiki/Memorial_(society)							 : 상대 경로
				System.out.println(content.attr("title"));
				contentList.add(new Content(content.attr("title"),content.absUrl("href")));
			}
			
			System.out.println(contentList);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Document doc2 = null;
		try {
			doc2 = Jsoup.connect("https://www.w3schools.com/js/default.asp").get();
			
			Elements contents = doc2.select("#main > h2");
			
			for(Element content : contents ) {
				System.out.println(content.text());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
