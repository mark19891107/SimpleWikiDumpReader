package org.iii.SimpleWikiDumpReader;

import edu.jhu.nlp.wikipedia.PageCallbackHandler;
import edu.jhu.nlp.wikipedia.WikiPage;
import edu.jhu.nlp.wikipedia.WikiXMLParser;
import edu.jhu.nlp.wikipedia.WikiXMLParserFactory;


public class App 
{
	public static void main(String[] args) {
		
        WikiXMLParser wxsp = WikiXMLParserFactory.getSAXParser("/Volumes/SD Card/zhwiki-latest-pages-articles.xml.bz2");
        
        try {
                  
            wxsp.setPageCallback(new PageCallbackHandler() { 
                           public void process(WikiPage page) {
                                System.out.println(page.getTitle());
                                System.out.println(page.getWikiText());
                           }
            });
                
           wxsp.parse();
        }catch(Exception e) {
                e.printStackTrace();
        }
		
	}
}
