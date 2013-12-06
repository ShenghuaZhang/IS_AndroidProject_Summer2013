package data;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class RecommendParse {
	private ArrayList<String> pidList = new ArrayList<String>();
	private String paperID;
	private DBAdapter db;

	public ArrayList<String> getRecom(){
		try {
			URL url = new URL(ConferenceURL.Recommend + "userID="+Conference.userID+"&conferenceID="+Conference.id+"");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			XMLReader xmlreader = parser.getXMLReader();

			UserScheduleParseHandler handle = new UserScheduleParseHandler();
			xmlreader.setContentHandler(handle);

			InputSource is = new InputSource(url.openStream());
			xmlreader.parse(is);
			
			
		} catch (Exception ee) {
			System.out.print(ee.toString());
		}
		
		return pidList;
	}
	

	private class UserScheduleParseHandler extends DefaultHandler {
		private int state = 0;

		public void startDocument() throws SAXException {
		}

		public void endDocument() throws SAXException {
		}

		public void startElement(String namespaceURI, String localName,
				String qName, Attributes atts) throws SAXException {
			if (localName.equals("contentID")) {
				state = 1;
				return;
			}
		}

		public void endElement(String namespaceURI, String localName,
				String qName) throws SAXException {
			if (localName.equals("contentID")) {
				pidList.add(paperID);
				return;
			}
		}

		public void characters(char ch[], int start, int length) {

			String content = new String(ch, start, length);
			switch (state) {
			case 1:
				paperID = content;
				state=0;
				break;
			default:
				state=0;
				return;
			}
		}
	}
}
