package ectel2013.com;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import data.Conference;
import data.DBAdapter;
import data.Paper;
import data.SectionedAdapter;
import data.UserScheduleParse;
import data.UserScheduledToServer;
import ectel2013.com.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class PaperInTrack extends Activity implements Runnable{
	private String trackID, trackName,trackContent;
	private Hashtable pTable;
	private Hashtable idTotrackName;
	private Hashtable<String,Drawable> idTotrackImage;
	private TextView t1,t2,t3;
	private ListView lv;
	private DBAdapter db;
	private UserScheduledToServer us2s;
	private boolean starClicked, scheduleClicked;
	private String paperStatus;
	private ProgressDialog pd;
	private ImageButton ib;
	private String paperID;

	private final int MENU_HOME = Menu.FIRST;
	private final int MENU_TRACK = Menu.FIRST + 1;
	private final int MENU_SESSION = Menu.FIRST + 2;
	private final int MENU_STAR = Menu.FIRST + 3;
	private final int MENU_SCHEDULE = Menu.FIRST + 4;


	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.paperintrack);
		
		us2s = new UserScheduledToServer();
		
		//this.IDToTrackImage();
		
		Bundle b = getIntent().getExtras();
		if (b != null) {
			trackID = b.getString("trackID");
			trackName = b.getString("trackName");
			trackContent = b.getString("trackContent");
			//firstLogin = b.getString("firstLogin");
		}
		/*
		if (firstLogin != null) {
			ArrayList<String> pidList = new ArrayList<String>();
			UserScheduleParse usp = new UserScheduleParse();

			pidList = usp.getData();

			db = new DBAdapter(this);
			db.open();
			db.updatePaperScheduleToDefault();
			db.daleteUserScheduled();

			for (int i = 0; i < pidList.size(); i++) {
				db.insertMyScheduledPaper(pidList.get(i).toString());
				db.updatePaperBySchedule(pidList.get(i).toString(), "yes");
			}

			db.close();
		}
		*/
		this.IDToTrackName();
		
		t1 = (TextView) findViewById(R.id.TextView01);
		t1.setText(trackName);
		t2 = (TextView) findViewById(R.id.content);
		t2.setText(trackContent);
		t3 = (TextView) findViewById(R.id.TextView03);
		t3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if(t2.getVisibility()== View.GONE){
				t2.setVisibility(View.VISIBLE);
				t3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bullet_arrow_down, 0, 0, 0);
				}
				else if(t2.getVisibility() == View.VISIBLE){
					t2.setVisibility(View.GONE);
					t3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bullet_arrow_up,0,0,0);
				}
			}});
		
		pTable = new Hashtable();
		ArrayList<Paper> pList;
		
		db = new DBAdapter(this);
		
		db.open();
		pList = db.getPapersByTrackID(trackID, "Tuesday, Sep 17");
		pTable.put("Tuesday, Sep 17", pList);
		pList = db.getPapersByTrackID(trackID, "Wednesday, Sep 18");
		pTable.put("Wednesday, Sep 18", pList);
		pList = db.getPapersByTrackID(trackID, "Thursday, Sep 19");
		pTable.put("Thursday, Sep 19", pList);
		pList = db.getPapersByTrackID(trackID, "Friday, Sep 20");
		pTable.put("Friday, Sep 20", pList);

		db.close();

		SectionedAdapter adapter = new SectionedAdapter() {
			protected View getHeaderView(String caption, int index,
					View convertView, ViewGroup parent) {
				TextView result = (TextView) convertView;

				if (convertView == null) {
					result = (TextView) getLayoutInflater().inflate(
							R.layout.header, null);
				}

				result.setText(caption);

				return (result);
			}
		};
		if (((ArrayList) pTable.get("Tuesday, Sep 17")).size() != 0)
			adapter.addSection("Tuesday, Sep 17", new ListViewAdapter(
					(ArrayList) pTable.get("Tuesday, Sep 17")));
		if (((ArrayList) pTable.get("Wednesday, Sep 18")).size() != 0)
			adapter.addSection("Wednesday, Sep 18", new ListViewAdapter(
					(ArrayList) pTable.get("Wednesday, Sep 18")));
		if (((ArrayList) pTable.get("Thursday, Sep 19")).size() != 0)
			adapter.addSection("Thursday, Sep 19", new ListViewAdapter(
					(ArrayList) pTable.get("Thursday, Sep 19")));
		if (((ArrayList) pTable.get("Friday, Sep 20")).size() != 0)
			adapter.addSection("Friday, Sep 20", new ListViewAdapter(
					(ArrayList) pTable.get("Friday, Sep 20")));

		lv = (ListView) findViewById(R.id.ListView01);
		lv.setAdapter(adapter);
		starClicked = scheduleClicked = false;
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
	
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_HOME, 0, "Home").setIcon(R.drawable.home);
		menu.add(0, MENU_TRACK, 0, "Tracks").setIcon(R.drawable.tracks);
		menu.add(0, MENU_SESSION, 0, "Sessions").setIcon(R.drawable.session);
		menu.add(0, MENU_STAR, 0, "Starred Papers").setIcon(R.drawable.star);
		menu.add(0, MENU_SCHEDULE, 0, "My Schedule").setIcon(R.drawable.schedule);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Intent itemintent = new Intent();
		switch (item.getItemId()) {
		case MENU_HOME:
			this.finish();
			itemintent.setClass(PaperInTrack.this, MainInterface.class);
			startActivity(itemintent);
			return true;
		case MENU_SESSION:
			this.finish();
			itemintent.setClass(PaperInTrack.this, ProgramByDay.class);
			startActivity(itemintent);
		case MENU_STAR:
			this.finish();
			itemintent.setClass(PaperInTrack.this, MyStaredPapers.class);
			startActivity(itemintent);
			return true;
		case MENU_TRACK:
			this.finish();
			itemintent.setClass(PaperInTrack.this, Tracks.class);
			startActivity(itemintent);
			return true;
		case MENU_SCHEDULE:
			this.finish();
			itemintent.setClass(PaperInTrack.this, MyScheduledPapers.class);
			startActivity(itemintent);
			return true;
		}
		return false;
	}


	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			
			//this.finish(); this.onStop(); this.onDestroy();
			 this.finish();
			Intent in = new Intent(PaperInTrack.this, Tracks.class);
			startActivity(in);
		}

		return super.onKeyDown(keyCode, event);
	}

	private void CallSignin() {
		Intent in = new Intent(PaperInTrack.this, Signin.class);
		in.putExtra("activity", "PaperInTrack");
		in.putExtra("trackID", trackID);
		in.putExtra("trackName", trackName);
		in.putExtra("paperID", paperID);
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

	static class ViewHolder {
		TextView t1, t2,t3,tr,type;
		ImageButton star, schedule;
	}

	private class ListViewAdapter extends BaseAdapter implements
			OnClickListener {

		ArrayList<Paper> pList;

		public ListViewAdapter(ArrayList pList) {
			this.pList = pList;
		}

		public int getCount() {
			return pList.size();
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder vh = null;
			SimpleDateFormat sdfSource = new SimpleDateFormat("HH:mm");
			SimpleDateFormat sdfDestination = new SimpleDateFormat("h:mm a");
			Date beginDate, endDate;
			String begTime, endTime;
			if (convertView == null) {
				LayoutInflater li = getLayoutInflater();
				convertView = li.inflate(R.layout.paperitem, null);
				vh = new ViewHolder();
				vh.t1 = (TextView) convertView.findViewById(R.id.time);
				vh.t2 = (TextView) convertView.findViewById(R.id.title);
				vh.t2.setOnClickListener(this);
				vh.type = (TextView) convertView.findViewById(R.id.type);
				vh.t3 = (TextView) convertView.findViewById(R.id.author);
				vh.tr = (TextView) convertView.findViewById(R.id.trackimage);

				/*vh.schedule = (ImageButton) convertView
						.findViewById(R.id.ImageButton01);
				if (pList.get(position).scheduled.compareTo("yes") == 0)
					vh.schedule.setImageResource(R.drawable.yes_schedule);
				else
					vh.schedule.setImageResource(R.drawable.no_schedule);

				vh.schedule.setOnClickListener(this);
				vh.schedule.setTag(pList.get(position).id);

				vh.star = (ImageButton) convertView
						.findViewById(R.id.ImageButton02);

				if (pList.get(position).starred.compareTo("yes") == 0)
					vh.star.setImageResource(R.drawable.yes_star);
				else
					vh.star.setImageResource(R.drawable.no_star);

				vh.star.setOnClickListener(this);
				vh.star.setTag(pList.get(position).id);*/

				convertView.setTag(vh);
			} else {
				vh = (ViewHolder) convertView.getTag();
			}

			vh.t2.setText(pList.get(position).title);
			vh.t2.setTag(position);
			vh.t3.setText(pList.get(position).authors);
			vh.type.setText(pList.get(position).type);
			vh.tr.setText(idTotrackName.get(trackID).toString());
			vh.tr.setBackgroundDrawable(getResources().getDrawable(R.drawable.track));
			
			/*
			 * vh.t1.setText(pList.get(position).exactbeginTime + " - " +
			 * pList.get(position).exactendTime);
			 */

			try {
				beginDate = sdfSource.parse(pList.get(position).exactbeginTime);
				endDate = sdfSource.parse(pList.get(position).exactendTime);
				begTime = sdfDestination.format(beginDate);
				endTime = sdfDestination.format(endDate);
				vh.t1.setText(begTime + " - " + endTime);
			} catch (Exception e) {
				System.out.println("Date Exception");
			}
			return convertView;
		}

		public void onClick(View v) {
			// TODO Auto-generated method stub
			TextView tv;
			int index;
			switch (v.getId()) {
			case R.id.title:
				tv = (TextView) v;
				index = Integer.parseInt(tv.getTag().toString());
				Intent in = new Intent(PaperInTrack.this, PaperInfo.class);
				in.putExtra("id", pList.get(index).id);
				in.putExtra("title", pList.get(index).title);
				in.putExtra("authors", pList.get(index).authors);
				// in.putExtra("affilication", pList.get(index).affiliation);
				in.putExtra("abstract", pList.get(index).paperAbstract);
				//in.putExtra("color", pList.get(index).trackColor);
				in.putExtra("room", pList.get(index).room);
				in.putExtra("bTime", pList.get(index).exactbeginTime);
				in.putExtra("eTime", pList.get(index).exactendTime);
				startActivity(in);
				break;
			/*case R.id.ImageButton01:
				ib = (ImageButton) v;
				paperID = ib.getTag().toString();
				Conference.userID = getUserID();
				if (Conference.userSignin) {
					paperStatus = "";
					callThread();
					//paperStatus = us2s.addScheduledPaper2Sever(paperID);
					// if (getPaperScheduled(paperID).compareTo("no") == 0) {
					/*
					if (paperStatus.compareTo("yes") == 0) {
						ib.setImageResource(R.drawable.yes_schedule);
						updateUserPaperStatus(paperID, "yes", "schedule");
						insertMyScheduledPaper(paperID);
						scheduleClicked = true;
					}
					if (paperStatus.compareTo("no") == 0) {
						ib.setImageResource(R.drawable.no_schedule);
						updateUserPaperStatus(paperID, "no", "schedule");
						deleteMyScheduledPaper(paperID);
						scheduleClicked = false;
					}
					*/
				/*} else {
					CallSignin();
				}
				
				break;
			case R.id.ImageButton02:
				ib = (ImageButton) v;
				paperID = ib.getTag().toString();

				if (getPaperStarred(paperID).compareTo("no") == 0) {
					ib.setImageResource(R.drawable.yes_star);
					updateUserPaperStatus(paperID, "yes", "star");
					insertMyStarredPaper(paperID);
					starClicked = true;
				} else {
					ib.setImageResource(R.drawable.no_star);
					updateUserPaperStatus(paperID, "no", "star");
					deleteMyStarredPaper(paperID);
					starClicked = false;
				}

				break;*/
			default:
				break;
			}

		}
	}
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
				ib.setImageResource(R.drawable.yes_schedule);
				updateUserPaperStatus(paperID, "yes", "schedule");
				insertMyScheduledPaper(paperID);
				scheduleClicked = true;
			}
			if (paperStatus.compareTo("no") == 0) {
				ib.setImageResource(R.drawable.no_schedule);
				updateUserPaperStatus(paperID, "no", "schedule");
				deleteMyScheduledPaper(paperID);
				scheduleClicked = false;
			}

		}
	};
	public void callThread() {

		pd = ProgressDialog.show(this, "Synchronization", "Please Wait...",
				true, false);
		Thread thread = new Thread(this);
		thread.start();

	}
	public void IDToTrackName(){
		idTotrackName = new Hashtable<String, String>();
		idTotrackName.put("1", "T\nr\na\nc\nk\n1");
		idTotrackName.put("2", "T\nr\na\nc\nk\n2");
		idTotrackName.put("3", "T\nr\na\nc\nk\n3");
		idTotrackName.put("4", "T\nr\na\nc\nk\n4");
		idTotrackName.put("5", "T\nu\nt\no\nr\ni\na\nl\n1");
		idTotrackName.put("6", "P\nM\nH\nR\n11");
		idTotrackName.put("7", "D\nA\nS\nH\nS\n11");
		idTotrackName.put("8", "W\no\nr\nk\ns\nh\no\np");
		idTotrackName.put("9", "T\nu\nt\no\nr\ni\na\nl\n2");
		idTotrackName.put("10", "D\nA\nH\n11");
		idTotrackName.put("11", "K\ne\ny\nn\no\nt\ne\n1");
		idTotrackName.put("12", "K\ne\ny\nn\no\nt\ne\n2");
		idTotrackName.put("13", "K\ne\ny\nn\no\nt\ne\n3");
		idTotrackName.put("14", "P\no\ns\nt\ne\nr\ns");
	}

}
