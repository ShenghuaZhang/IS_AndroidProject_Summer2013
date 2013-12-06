package ectel2013.com;

import java.util.ArrayList;
import java.util.Hashtable;

import data.Conference;
import data.DBAdapter;
import data.Track;
import ectel2013.com.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Tracks extends Activity {
	
	private ArrayList<Track> trList;
	private Hashtable idTotrackName;
	private final int MENU_HOME = Menu.FIRST;
	private final int MENU_SESSION = Menu.FIRST + 1;
	private final int MENU_STAR = Menu.FIRST + 2;
	private final int MENU_SCHEDULE = Menu.FIRST + 3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.track);
		
		this.IDToTrackName();
		
		trList = new ArrayList<Track>();
		trList = loadData();
		TextView tv = (TextView) findViewById(R.id.TextView01);
		tv.setText("Tracks");
		ListView lv = (ListView) findViewById(R.id.ListView01);
		
		lv.setAdapter(new ListViewAdapter(trList));
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView av, View v, int pos, long arg) {
				Intent in = new Intent(Tracks.this, PaperInTrack.class);
				in.putExtra("trackID", trList.get(pos).id);
				in.putExtra("trackName", trList.get(pos).name);
				in.putExtra("trackContent", trList.get(pos).content);
				in.putExtra("trackChair", trList.get(pos).chair);
				startActivity(in);
			}
		});
		
	}
	
	private ArrayList<Track> loadData()
	{
		ArrayList<Track> trackList;
		DBAdapter db = new DBAdapter(this);
		db.open();
		trackList = db.getTracks();
		db.close();
		
		return trackList;
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_HOME, 0, "Home").setIcon(R.drawable.home);
		menu.add(0, MENU_SESSION, 0, "Sessions").setIcon(R.drawable.session);
		menu.add(0, MENU_STAR, 0, "Starred Papers").setIcon(R.drawable.star);
		menu.add(0, MENU_SCHEDULE, 0, "My Schedule").setIcon(R.drawable.schedule);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Intent itemintent = new Intent();
		switch (item.getItemId()) {
		case MENU_HOME:
			itemintent.setClass(Tracks.this, MainInterface.class);
			startActivity(itemintent);
			return true;
		case MENU_STAR:
			itemintent.setClass(Tracks.this, MyStaredPapers.class);
			startActivity(itemintent);
			return true;
		case MENU_SESSION:
			itemintent.setClass(Tracks.this, ProgramByDay.class);
			startActivity(itemintent);
			return true;
		case MENU_SCHEDULE:
			itemintent.setClass(Tracks.this, MyScheduledPapers.class);
			startActivity(itemintent);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			
			//this.finish(); this.onStop(); this.onDestroy();
			 
			Intent in = new Intent(Tracks.this, MainInterface.class);
			startActivity(in);
		}

		return super.onKeyDown(keyCode, event);
	}
	
	
	static class ViewHolder
	{
		TextView tv1,tv2,tv3;
	}
	
	private class ListViewAdapter extends BaseAdapter {
		//private Context mContext;
		//private Integer[] mThumbIds = { R.drawable.track1,R.drawable.track2, R.drawable.track3, R.drawable.track4};
		ArrayList<Track> tList;
		public ListViewAdapter(ArrayList t) {
			tList = t;
		}

		public int getCount() {
			return tList.size();
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}
		
		
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder vh;
			if (convertView == null) {
				LayoutInflater li = getLayoutInflater();
				convertView = li.inflate(R.layout.trackitem, null);
				vh = new ViewHolder();
				vh.tv1=(TextView) convertView.findViewById(R.id.title);
				vh.tv2=(TextView) convertView.findViewById(R.id.trackimage);
				vh.tv3=(TextView) convertView.findViewById(R.id.author);
				convertView.setTag(vh);
			}
			else
			{
				vh = (ViewHolder) convertView.getTag();
			}
			
			vh.tv1.setText((tList.get(position).name).toString());
			vh.tv2.setBackgroundDrawable(getResources().getDrawable(R.drawable.track));
			vh.tv2.setText(idTotrackName.get(tList.get(position).id).toString());
			
			vh.tv3.setText((tList.get(position).chair).toString());
			return convertView;
		}
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
