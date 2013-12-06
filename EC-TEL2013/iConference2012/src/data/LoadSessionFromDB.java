package data;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class LoadSessionFromDB {

	private ArrayList<Session> sList = new ArrayList<Session>();
	private Hashtable<String,String> Datetrans, Dtrans;
	
        
	public LoadSessionFromDB()
	{
		this.daytoDate();
		this.daytoid();
	}
	
	public String getDate(String date){
		String date_string;
		if(Datetrans.containsKey(date))
			date_string = Datetrans.get(date);
		else
			date_string ="No date information available.";
			
		return date_string;
	}
	public String getDayid(String date){
		String dayid;
		if(Dtrans.containsKey(date))
			dayid = Dtrans.get(date);
		else
			dayid ="0";
			
		return dayid;
	}


//	public void daytoDate(){
//		Datetrans = new Hashtable<String, String>();
//		Datetrans.put("2013-07-06", "Saturday, Jul 6");
//		Datetrans.put("2013-07-07", "Sunday, Jul 7");
//		Datetrans.put("2013-07-08", "Monday, Jul 8");
//		Datetrans.put("2013-07-09", "Tuesday, Jul 9");
//		Datetrans.put("2013-07-10", "Wednesday, Jul 10");
//		Datetrans.put("2013-07-11", "Thursday, Jul 11");
//		Datetrans.put("2013-07-12", "Friday, Jul 12");
//		Datetrans.put("2013-07-13", "Saturday, Jul 13");
//		
//	}
//	public void daytoid(){
//		Dtrans = new Hashtable<String, String>();
//		Dtrans.put("2013-07-06", "1");
//		Dtrans.put("2013-07-07", "2");
//		Dtrans.put("2013-07-08", "3");
//		Dtrans.put("2013-07-09", "4");
//	    Dtrans.put("2013-07-10", "5");
//	    Dtrans.put("2013-07-11", "6");
//	    Dtrans.put("2013-07-12", "7");
//	    Dtrans.put("2013-07-13", "8");
//	
//	}     
	
	public void daytoDate(){
		Datetrans = new Hashtable<String, String>();
		Datetrans.put("2013-09-17", "Tuesday, Sep 17");
		Datetrans.put("2013-09-18", "Wednesday, Sep 18");
		Datetrans.put("2013-09-19", "Thursday, Sep 19");
		Datetrans.put("2013-09-20", "Friday, Sep 20");
		
	}
	public void daytoid(){
		Dtrans = new Hashtable<String, String>();
		Dtrans.put("2013-09-17", "1");
		Dtrans.put("2013-09-18", "2");
		Dtrans.put("2013-09-19", "3");
		Dtrans.put("2013-09-20", "4");
	}
	
	public ArrayList<Session> getSessionData() {
		
		InputStreamReader isr=null;
		InputStream stream=null;
		try {
			//URL url = new URL("http://halley.exp.sis.pitt.edu/cn3mobile/allSessionsAndPresentations.jsp?eventid=86");
			
			//Use Post Method
			String urlString = new String("http://halley.exp.sis.pitt.edu/cn3mobile/allSessionsAndPresentations.jsp?conferenceID="+Conference.id);
			
			URL url = new URL(urlString);
			    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			    conn.setReadTimeout(10000 /* milliseconds */);
			    conn.setConnectTimeout(15000 /* milliseconds */);
			    conn.setRequestMethod("POST");
			    conn.setDoInput(true);
			    // Starts the query
			    conn.connect();
			    stream = conn.getInputStream(); 
			
			
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser saxParser = spf.newSAXParser();
			XMLReader xr = saxParser.getXMLReader();

			SessionParseHandler shandler = new SessionParseHandler();
			xr.setContentHandler(shandler);
			isr = new InputStreamReader(stream, "iso-8859-1");
			//InputStreamReader isr = new InputStreamReader(entity.getContent(),"UTF-8");

			xr.parse(new InputSource(isr));
			stream.close();
			isr.close();
		} catch (Exception ee) {
			System.out.print(ee.toString());
		}
		finally{
			try {
				if(stream != null)
				stream.close();
				if(isr != null)
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sList;
	}

	
	private class SessionParseHandler extends DefaultHandler {
		private int state = 0;
		private Session se;
		private boolean sessionStart = false;
		
		@Override
		public void startDocument() throws SAXException {
		}

		@Override
		public void endDocument() throws SAXException {
		}

		@Override
		public void startElement(String namespaceURI, String localName,
				String qName, Attributes atts) throws SAXException {
			if (localName.equals("SESSIONS")) {
				sessionStart=true;
				return;
			}
			if (localName.equals("SESSION")) {
				se = new Session();
				se.ID= atts.getValue("eventSessionID").toString();
				return;
			}
			if (localName.equals("sessionName")) {
				state = 1;
				return;
			}
			if (localName.equals("sessionDate")) {
				state = 2;
				return;
			}
			if (localName.equals("beginTime")&& sessionStart==true) {
				state = 3;
				return;
			}
			if (localName.equals("endTime")&& sessionStart == true) {
				state = 4;
				return;
			}
			if (localName.equals("location")) {
				state = 5;
				return;
			}
		}

		@Override
		public void endElement(String namespaceURI, String localName,
				String qName) throws SAXException {
			if (localName.equals("SESSION")) {
				sList.add(se);
				return;
			}
			if (localName.equals("SESSIONS")) {
				sessionStart=false;
				return;
			}
		}

		@Override
		public void characters(char ch[], int start, int length) {

			String content = new String(ch, start, length);
			switch (state) {
			case 1:
				se.name = content;				
				state=0;
				break;
			case 2:
				SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy-MM-dd");      
				Date date=new Date();
				try {
					date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(content);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String   str   =   formatter.format(date);
				se.date = Datetrans.get(str);
				se.day_id= Dtrans.get(str);
				state=0;
				break;
			case 3:
				SimpleDateFormat   formatter1   =   new   SimpleDateFormat   ("HH:mm");      
				Date date1=new Date();
				try {
					date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(content);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String   str1   =   formatter1.format(date1);
				se.beginTime = str1;
				state=0;
				break;
			case 4:
				SimpleDateFormat   formatter2   =   new   SimpleDateFormat   ("HH:mm");      
				Date date2=new Date();
				try {
					date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(content);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String   str2   =   formatter2.format(date2);
				se.endTime = str2;
				state=0;
				break;
			case 5:
				se.room = content;
				state=0;
				break;
			default:
				state=0;
				return;
			}
		}
	}
	
}

