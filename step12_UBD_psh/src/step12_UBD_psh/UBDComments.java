package step12_UBD_psh;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UBDComments {
	
	
	public static void main(String[] args) {
		Document doc = null;
		
		String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.naver?code=159070&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=";
		try {
			for(int i = 1; i <= 10; i++) {
				doc = Jsoup.connect(url+i).get();
				
				Elements contents = doc.select("body > div > div > div.score_result > ul > li > div.score_reple > p > span");
				
				int count = 1;
				for(Element content : contents) {
					if(content.hasAttr("id")) {
						System.out.println(i+"-"+(count++)+"\t : "+content.text());
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

