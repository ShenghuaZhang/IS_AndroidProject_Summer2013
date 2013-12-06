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



public class UserPaperSimilar {
	private ArrayList<String> pidList = new ArrayList<String>();
	private String paperID;
	private DBAdapter db;

	public ArrayList<String> getSimi(String contentID){
		try {
			URL url = new URL(ConferenceURL.SimilarPaper + "contentID="+contentID+"&conferenceID="+Conference.id+"&maxno=10");
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

		@Override
		public void startDocument() throws SAXException {
		}

		@Override
		public void endDocument() throws SAXException {
		}

		@Override
		public void startElement(String namespaceURI, String localName,
				String qName, Attributes atts) throws SAXException {
			if (qName.equals("contentID")) {
				state = 1;
				return;
			}
		}

		@Override
		public void endElement(String namespaceURI, String localName,
				String qName) throws SAXException {
			if (qName.equals("contentID")) {
				pidList.add(paperID);
				return;
			}
		}

		@Override
		public void characters(char ch[], int start, int length) {

			String content = new String(ch, start, length);
			switch (state) {
			case 1:
				paperID = new String();
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