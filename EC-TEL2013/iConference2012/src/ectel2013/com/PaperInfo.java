package ectel2013.com;

import ectel2013.com.R;
import data.Conference;
import data.DBAdapter;
import data.UserScheduledToServer;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

public class PaperInfo extends Activity implements Runnable,OnClickListener{
	private String key,activity,id,title,authors,pAbstract,pContent, pRoom,bTime,eTime,paperID,paperStatus,date,presentationID;
	private TextView t1,t2,t3,t4,bv;
	private WebView wv;
	private ImageButton b1,b2,b,b3;
	private DBAdapter db;
	private UserScheduledToServer us2s;
	private ProgressDialog pd;
	
	private final int MENU_HOME = Menu.FIRST;
	private final int MENU_TRACK = Menu.FIRST + 1;
	private final int MENU_SESSION = Menu.FIRST + 2;
	private final int MENU_STAR = Menu.FIRST + 3;
	private final int MENU_SCHEDULE = Menu.FIRST + 4;
	private final int MENU_RECOMMEND = Menu.FIRST+5;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.paperdetail);

		Bundle b = getIntent().getExtras();
		if (b != null) {
			id = b.getString("id");
			title = b.getString("title");
			authors = b.getString("authors");
			pAbstract = b.getString("abstract");
			pContent=b.getString("contentlink");
			//tbColor = b.getInt("color");
			pRoom = b.getString("room");
			bTime = b.getString("bTime");
			eTime = b.getString("eTime");
			date = b.getString("date");
			presentationID = b.getString("presentationID");
			activity =b.getString("activity");
			key =b.getString("key");
		}
		
		us2s = new UserScheduledToServer();
		t1 = (TextView) findViewById(R.id.TextView01);
		//t1.setBackgroundResource(tbColor);
		t1.setText(title);
		

		
		b1 = (ImageButton) findViewById(R.id.ImageButton01);
		if (getPaperScheduled(id).compareTo("yes") == 0)
			b1.setImageResource(R.drawable.yes_schedule);
		else
			b1.setImageResource(R.drawable.no_schedule);
		b1.setTag(id);
		b1.setOnClickListener(this);
		
		b2 = (ImageButton) findViewById(R.id.ImageButton02);
		if (getPaperStarred(presentationID).compareTo("yes") == 0)
			b2.setImageResource(R.drawable.yes_star);
		else
			b2.setImageResource(R.drawable.no_star);
		b2.setTag(presentationID);
		b2.setOnClickListener(this);
		
		b3 = (ImageButton) findViewById(R.id.ImageButton03);
		b3.setOnClickListener(this);
		
		t2 = (TextView) findViewById(R.id.TextView06);
		//t2.setBackgroundResource(tbColor);
		t2.setText(authors);
		t3 = (TextView) findViewById(R.id.TextView02);
		t3.setText(date+" "+bTime+"-"+eTime);
		t4 = (TextView) findViewById(R.id.TextView04);
		if(pRoom.compareTo("unknown") != 0 && pRoom.compareTo("null") != 0)
		t4.setText(pRoom);
		else{
			findViewById(R.id.TextView03).setVisibility(View.GONE);
			t4.setVisibility(View.GONE);
		}
		
		
		bv= (TextView) findViewById(R.id.PaperButton);
		//bv.setOnClickListener(this);/////
//		bv.setText(pContent);
		
		if(!pContent.equals("null")){
				//pContent!="null"){
			bv.setText(pContent);
		bv.setOnClickListener(new TextView.OnClickListener() {  
	        @Override
			public void onClick(View v)
	            {
	        	/* original */
	        	/*Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse(pContent));
				//it.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
				it.setClassName("aied.com.android.browser", "aied.com.android.browser.BrowserActivity");
				startActivity(it);*/
	        	
	        	Intent intent = new Intent(Intent.ACTION_VIEW);
	        	Uri data = Uri.parse(pContent);
	        	intent.setData(data);
	        	startActivity(intent); /* OK */
	        	
//	        	it.setAction("android.intent.action.VIEW"); 
//	        	it.addCategory("android.intent.category.BROWSABLE");
//	        	it.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
//	        	it.setComponent(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
				
				////
				/*Uri uri = Uri.parse(pContent);
				Intent browserIntent = new Intent(Intent.ACTION_VIEW);
				//browserIntent.setComponent(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
				browserIntent.setDataAndType(uri, "text/html");
				browserIntent.addCategory(Intent.CATEGORY_BROWSABLE);
				startActivity(browserIntent);*/
	        	
	        	
	        	/*Intent i = new Intent();

	        	i.setComponent(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
	        	i.setAction("android.intent.action.VIEW");
	        	i.addCategory("android.intent.category.BROWSABLE");
	        	Uri data = Uri.parse("http://www.google.com");
	        	i.setData(data);

	        	startActivity(i); */
	        	
				
	            }
	         });
		}else{
			bv.setText("N/A");
			
		}
		

		
		
		wv = (WebView) findViewById(R.id.WebView01);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadData(pAbstract, "text/html", "utf-8");
		

			
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView tv;
		int index;
		paperID ="";
		
		switch (v.getId()) {
		case R.id.ImageButton01:
			b = (ImageButton) v;
			paperID = b.getTag().toString();

			Conference.userID = getUserID();
			if (Conference.userSignin) {
				paperStatus = "";
				callThread();
			} else {
				CallSignin();
			}
			break;
		/*case R.id.PaperButton:
			if(pContent!="null"){			
			        	Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse(pContent));
						it.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
						startActivity(it);			         
				}else{
					bv.setText("N/A");
				}
			break;*/
		case R.id.ImageButton02:
			b = (ImageButton) v;
			
			paperID = b.getTag().toString();
			
			
			if (getPaperStarred(paperID).compareTo("no") == 0) {
				b.setImageResource(R.drawable.yes_star);
				updateUserPaperStatus(paperID, "yes", "star");
				insertMyStarredPaper(paperID);
			  						                        
			} else {
				b.setImageResource(R.drawable.no_star);
				updateUserPaperStatus(paperID, "no", "star");
				deleteMyStarredPaper(paperID);
				
		
			}
			
			break;
		case R.id.ImageButton03:
			Intent connectSocN = new Intent(Intent.ACTION_SEND);     
			connectSocN.setType("text/plain");    
			connectSocN.putExtra(android.content.Intent.EXTRA_SUBJECT,"16th ACM Conference on Computer Supported Cooperative Work - CSCW 2013");     
			connectSocN.putExtra(Intent.EXTRA_TEXT,"The 16th ACM Conference on Computer Supported Cooperative Work and Social Computing (CSCW 2013) will be held February 23-27 in San Antonio, Texas, USA. San Antonio is growing rapidly and offers pleasant winter weather. The conference will be held in the Hyatt Regency on the river walk, which offers many restaurant and entertainment possibilities within short walking distance.\n"+
					"This paper will be presented on CSCW:\n"+title+"\n"+"http://halley.exp.sis.pitt.edu/cn3/presentation2.php?conferenceID=97&presentationID=" + presentationID);   
			startActivity(Intent.createChooser(connectSocN, "Share")); 
			break;
		default:
			break;
		}
		}
	private void CallSignin() {
		Intent in = new Intent(PaperInfo.this, Signin.class);
		in.putExtra("activity", "PaperInfo");
		in.putExtra("paperID", id);
		in.putExtra("title",title);
		in.putExtra("bTime", bTime);
		in.putExtra("eTime", eTime);
		in.putExtra("authors", authors);
		in.putExtra("Abstract", pAbstract);
		in.putExtra("contentlink", pContent);
		in.putExtra("room", pRoom);
		in.putExtra("date", date);
		in.putExtra("presentationID", presentationID);
		startActivity(in);
	}

	public void updateUserPaperStatus(String paperID, String status,
			String which) {
		db = new DBAdapter(this);
		db.open();
		if (which.compareTo("schedule") == 0)
			db.updatePaperBySchedule(paperID, status);
		else
			db.updatePaperByStar(paperID, status);
		db.close();
	}

	public String getPaperScheduled(String paperID) {
		String status;
		db = new DBAdapter(this);
		db.open();

		status = db.getPaperScheduledStatus(paperID);

		db.close();

		return status;
	}

	public String getPaperStarred(String paperID) {
		String status;
		db = new DBAdapter(this);
		db.open();

		status = db.getPaperStarredStatus(paperID);

		db.close();

		return status;
	}

	public void insertMyScheduledPaper(String paperID) {
		db = new DBAdapter(this);
		db.open();
		db.insertMyScheduledPaper(paperID);
		db.close();
	}

	public void deleteMyScheduledPaper(String paperID) {
		db = new DBAdapter(this);
		db.open();
		db.deleteMyScheduledPaper(paperID);
		db.close();
	}

	public void insertMyStarredPaper(String paperID) {
		db = new DBAdapter(this);
		db.open();
		db.insertMyStarredPaper(paperID);
		db.close();
	}

	public void deleteMyStarredPaper(String paperID) {
		db = new DBAdapter(this);
		db.open();
		db.deleteMyStarredPaper(paperID);
		db.close();
	}
	
	public String getUserID()
	{
		String id = "";
		
		/*
		db = new DBAdapter(this);
		db.open();
		id = db.getUserID();
		db.close();
		*/
		
		try
		{
			SharedPreferences getUserID = getSharedPreferences("userinfo", 0);
			id = getUserID.getString("userID", "");
		}
		catch(Exception e){}
		
		if(id.compareTo("")!=0)
			Conference.userSignin = true;
		return id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (getPaperScheduled(paperID).compareTo("yes")==0)
			paperStatus = us2s.DeleteScheduledPaper2Sever(paperID);
		else if (getPaperScheduled(paperID).compareTo("no")==0)
			paperStatus = us2s.addScheduledPaper2Sever(paperID);
		handler.sendEmptyMessage(0);
	}

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			pd.dismiss();
			// update interface here

			if (paperStatus.compareTo("yes") == 0) {
				b1.setImageResource(R.drawable.yes_schedule);
				updateUserPaperStatus(paperID, "yes", "schedule");
				insertMyScheduledPaper(paperID);
				//scheduleClicked = true;
			}
			if (paperStatus.compareTo("no") == 0) {
				b1.setImageResource(R.drawable.no_schedule);
				updateUserPaperStatus(paperID, "no", "schedule");
				deleteMyScheduledPaper(paperID);
				//scheduleClicked = false;
			}

		}
	};
	public void callThread() {

		pd = ProgressDialog.show(this, "Synchronization", "Please Wait...",
				true, false);
		Thread thread = new Thread(this);
		thread.start();

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_HOME, 0, "Home").setIcon(R.drawable.home);
		menu.add(0, MENU_TRACK, 0, "Proceedings").setIcon(R.drawable.proceedings);
		menu.add(0, MENU_SESSION, 0, "Schedule").setIcon(R.drawable.session);
		menu.add(0, MENU_STAR, 0, "My favourite").setIcon(R.drawable.star);
		menu.add(0, MENU_SCHEDULE, 0, "My Schedule").setIcon(R.drawable.schedule);
		menu.add(0, MENU_RECOMMEND, 0, "Recommendation").setIcon(R.drawable.recommends);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent itemintent = new Intent();
		switch (item.getItemId()) {
		case MENU_HOME:
			this.finish();
			itemintent.setClass(PaperInfo.this, MainInterface.class);
			startActivity(itemintent);
			return true;
		case MENU_SESSION:
			this.finish();
			itemintent.setClass(PaperInfo.this, ProgramByDay.class);
			startActivity(itemintent);
			return true;
		case MENU_STAR:
			this.finish();
			itemintent.setClass(PaperInfo.this, MyStaredPapers.class);
			startActivity(itemintent);
			return true;
		case MENU_TRACK:
			this.finish();
			itemintent.setClass(PaperInfo.this, Proceedings.class);
			startActivity(itemintent);
			return true;
		case MENU_SCHEDULE:
			this.finish();
			itemintent.setClass(PaperInfo.this, MyScheduledPapers.class);
			startActivity(itemintent);
			return true;
		case MENU_RECOMMEND:
			this.finish();
			itemintent.setClass(PaperInfo.this, MyRecommendedPapers.class);
			startActivity(itemintent);
			return true;
		}
		return false;
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {  

		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {  

		      // Do something.  
			if(activity.compareToIgnoreCase("PaperInSession")==0){
				this.finish();
				String[] s = key.split("%");
				Intent in = new Intent(this, PaperInSession.class);
				in.putExtra("papersessionID", s[0]);
				in.putExtra("sessionName", s[1]);
				in.putExtra("bTime", s[2]);
				in.putExtra("eTime", s[3]);
				in.putExtra("date", s[4]);
				in.putExtra("room", s[5]);
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("MyRecommendedPapers")==0){
				this.finish();
				Intent in = new Intent(this, MyRecommendedPapers.class);
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("MyScheduledPapers")==0){
				this.finish();				
				Intent in = new Intent(this, MyScheduledPapers.class);
				in.putExtra("day",key);
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("MyStaredPapers")==0){
				this.finish();
				Intent in = new Intent(this, MyStaredPapers.class);
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("ProceedingsByAuthor")==0){
				this.finish();
				Intent in = new Intent(this, Proceedings.class);
				in.putExtra("no", "1");
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("ProceedingsByName")==0){
				this.finish();
				Intent in = new Intent(this, Proceedings.class);
				in.putExtra("no", "2");
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("ProceedingsByType")==0){
				this.finish();
				Intent in = new Intent(this, Proceedings.class);
				in.putExtra("no", "3");
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("WorkshopDetail")==0){
				this.finish();
				String[] s = key.split("%");
				Intent in = new Intent(this, WorkshopDetail.class);
				in.putExtra("id", s[0]);
				in.putExtra("title", s[1]);
				in.putExtra("bTime", s[2]);
				in.putExtra("eTime", s[3]);
				in.putExtra("room", s[4]);
				in.putExtra("date", s[5]);
				in.putExtra("content", s[6]);
				in.putExtra("childsessionID", s[7]);
				startActivity(in);
			}
			else if(activity.compareToIgnoreCase("PosterDetail")==0){
				this.finish();
				String[] s = key.split(";");
				Intent in = new Intent(this, PosterDetail.class);
				in.putExtra("title", s[0]);
				in.putExtra("id", s[1]);
				in.putExtra("date", s[2]);
				in.putExtra("btime", s[3]);
				in.putExtra("etime", s[4]);
				in.putExtra("room", s[5]);
				startActivity(in);
			}
			else{
				return false;
			}
		        return true;  

		   }  

		   return super.onKeyDown(keyCode, event);  

	 } 

}
