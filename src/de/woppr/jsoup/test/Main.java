package de.woppr.jsoup.test;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) {
		Document doc = null;
		try {
			doc = Jsoup.connect("http://woppr.de/html").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Select title
		System.out.println(doc.title());
		//Select div id 1
		Element contentdiv1 = doc.getElementById("1");
		System.out.println(contentdiv1.text());
		//Select all divs
		Elements divs = doc.select("div");
		for (Element div : divs) {
			System.out.println(div.text());
		}
	}
}
