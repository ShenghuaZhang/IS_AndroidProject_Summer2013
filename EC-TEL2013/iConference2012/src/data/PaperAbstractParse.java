package data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;


public class PaperAbstractParse {

	public String getPaperAbstract(String ID){
		String ab="";
		try {
			URL url = new URL("http://halley.exp.sis.pitt.edu/cn3mobile/contentAbstract.jsp?contentID="+ID);
			
			InputStream in = url.openStream();
			String data = convertToString(in);
			StringFilter sf = new StringFilter();
			ab = sf.FilterForXML(data);
			
			in.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
	    return ab;
	}
	public String convertToString(InputStream is){
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				
				while ((line = reader.readLine()) != null) {
					sb.append(line).append(" ");
				}
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
			}
			finally {
				try{
				is.close();
				}
				catch(Exception e)
				{
					
				}
			}
			return sb.toString();
		} else {
			return "";
		}
	}
}
