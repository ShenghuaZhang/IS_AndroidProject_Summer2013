package ectel2013.com;


import java.util.ArrayList;

import ectel2013.com.R;


import data.CheckDBUpdate;
import data.Conference;
import data.DBAdapter;
import data.LoadPaperFromDB;
import data.LoadSessionFromDB;
import data.Paper;
import data.PaperContent;
import data.PaperContentParse;
import data.RecommendParse;
import data.Session;
import data.UserScheduleParse;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateOption extends Activity{

	private ProgressDialog pd;
	private DBAdapter db;	
	private TextView session, presentation, paper,success, sync;
	private AlertDialog ad;
	private ImageButton up;
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

		setContentView(R.layout.update);
		db= new DBAdapter(this);
		up = (ImageButton) findViewById(R.id.ImageButton01);
		up.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(isConnect(UpdateOption.this)){
							ad = new AlertDialog.Builder(UpdateOption.this)
							.setTitle("Update Options") 
							.setMessage("It takes time to update the whole local DB, do you still want to update?") 
							.setPositiveButton("Yes", 
							new DialogInterface.OnClickListener(){ 
								@Override
							public void onClick(DialogInterface dialoginterface, int i){ 
								dialoginterface.cancel();	
								new AsyncUpdate().execute();
								//update();
							} 
							}) 
							.setNegativeButton("No", new DialogInterface.OnClickListener() { 
							@Override
							public void onClick(DialogInterface dialog, int id) { 
							dialog.cancel(); 
							Intent in = new Intent(UpdateOption.this, MainInterface.class);
							startActivity(in);	
							} 
							}) 
							.show();
						}
					
					else{
						ad = new AlertDialog.Builder(UpdateOption.this) 
				          .setMessage("This porcess requires internet connection, please check your internet connection.") 
				          .setPositiveButton("Back to \"HOME\"", 
				                         new DialogInterface.OnClickListener(){ 
				                                 @Override
												public void onClick(DialogInterface dialoginterface, int i){ 
				                                	 Intent in = new Intent(UpdateOption.this, MainInterface.class);
				                             		 startActivity(in);
				                                  } 
				                          }) 
				          .show(); 
			}
			
		}
		});
	
}
	public void showDialog(String s){
		 pd = ProgressDialog.show(this, "Synchronization", s,true, false);
	 }
	 public void dismissDialog(){
		 pd.dismiss();
	 }
	 public static boolean isConnect(Context context) {   
         
	        ConnectivityManager connectivity = (ConnectivityManager) context   
	                .getSystemService(Context.CONNECTIVITY_SERVICE);   
	        if (connectivity != null) {   
	          
	             NetworkInfo info = connectivity.getActiveNetworkInfo();   
	            if (info != null) {   
             
	                 if (info.getState() == NetworkInfo.State.CONNECTED) {   
	                     return true;   
	                }   
	            }   
	         }   
	        return false;   
	     }  
	 @Override
	public boolean onCreateOptionsMenu(Menu menu) {
			menu.add(0, MENU_HOME, 0, "Home").setIcon(R.drawable.home);
			menu.add(0, MENU_TRACK, 0, "Proceedings").setIcon(R.drawable.proceedings);
			menu.add(0, MENU_SESSION, 0, "Schedule").setIcon(R.drawable.session);
			menu.add(0, MENU_STAR, 0, "My Favorite").setIcon(R.drawable.star);
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
				itemintent.setClass(UpdateOption.this, MainInterface.class);
				startActivity(itemintent);
				return true;
			case MENU_SESSION:
				this.finish();
				itemintent.setClass(UpdateOption.this, ProgramByDay.class);
				startActivity(itemintent);
				return true;
			case MENU_STAR:
				this.finish();
				itemintent.setClass(UpdateOption.this, MyStaredPapers.class);
				startActivity(itemintent);
				return true;
			case MENU_TRACK:
				this.finish();
				itemintent.setClass(UpdateOption.this, Proceedings.class);
				startActivity(itemintent);
				return true;
			case MENU_SCHEDULE:
				this.finish();
				itemintent.setClass(UpdateOption.this, MyScheduledPapers.class);
				startActivity(itemintent);
				return true;
			case MENU_RECOMMEND:
				this.finish();
				itemintent.setClass(UpdateOption.this, MyRecommendedPapers.class);
				startActivity(itemintent);
				return true;
			}
			return false;
		}
		private class AsyncUpdate extends AsyncTask<Void,Integer,Integer>{
			protected void onPreExcute(){
			}
			@Override
			protected Integer doInBackground(Void... arg0) {
				// TODO Auto-generated method stub
				int state=0;
				//check update
				boolean needUpdate = false;
				CheckDBUpdate cdbu = new CheckDBUpdate();
				needUpdate = cdbu.compare();
				
				//execute update
				if (needUpdate){		 
					ArrayList<Session> sList = new ArrayList<Session>();
					ArrayList<Paper> pList = new ArrayList<Paper>();
					ArrayList<PaperContent> pcList = new ArrayList<PaperContent>();
					ArrayList<String> pidList = new ArrayList<String>();
					ArrayList<String> pidRList = new ArrayList<String>();
					ArrayList<String> pidLList = new ArrayList<String>();					
					
					//Update session info
					publishProgress(6);
					LoadSessionFromDB sdbr=new LoadSessionFromDB();
					sList = sdbr.getSessionData();
					if(sList.size()!=0){
					publishProgress(0);
					}
					else{
					publishProgress(1);
					}
					
					//Update presentation info
					publishProgress(7);
					LoadPaperFromDB pdbr=new LoadPaperFromDB();
					pList = pdbr.getPaperData();
					if(pList.size()!=0){
					publishProgress(2);
					}
					else{
					publishProgress(3);
					}
					
					//Update paper content info
					publishProgress(8);
					PaperContentParse pcp = new PaperContentParse();
					pcList = pcp.getData();
					if(pcList.size()!=0){
					publishProgress(4);
					}
					else{
					publishProgress(5);
					}
					
					if(sList.size()!=0 && pList.size()!=0 && pcList.size()!=0){
					try{
					db.open();
					db.daleteSession();
					db.daletePaper();
					db.daletePaperContent();
					
					for (int i = 0; i < sList.size(); i++) {
						long error = db.insertSession(sList.get(i));
						if (error == -1)
							System.out.println("Insertion Failed session");
					}
					for (int i = 0; i < pList.size(); i++) {
						long error = db.insertPaper(pList.get(i));
						if (error == -1)
							System.out.println("Insertion Failed session");
					}
					for (int i = 0; i < pcList.size(); i++) {
						if(pcList.get(i).authors==null||pcList.get(i).authors==""){
							pcList.get(i).authors="No author information available";
						}
						if(pcList.get(i).type==null||pcList.get(i).type==""){
							pcList.get(i).type="No type information available";
						}
						if(pcList.get(i).title==null||pcList.get(i).title==""){
							pcList.get(i).title="No title information available";
						}
						if(pcList.get(i).paperAbstract==null||pcList.get(i).paperAbstract==""){
							pcList.get(i).paperAbstract="No abstract information available";
						}
						long error = db.insertPaperContent(pcList.get(i));
						if (error == -1)
							System.out.println("error occured");
					}
					db.close();
					}
					catch (Exception e) {
						System.out.print(e.getMessage());
					}
					//Update recommendation and schedule
					SharedPreferences getUserID = getSharedPreferences("userinfo", 0);
					String userID = getUserID.getString("userID", "");
					
					if (userID.compareTo("") != 0){
					publishProgress(9);
					UserScheduleParse usp = new UserScheduleParse();
					RecommendParse rp = new RecommendParse();
					pidList = usp.getData();
					pidRList = rp.getRecom();
					if(pidList.size()!=0){
					publishProgress(10);
					try{
					db.open();
					db.updatePaperScheduleToDefault();
					db.updatePaperRecommendToDefault();
					db.daleteUserScheduled();
					db.daleteUserRecommended();
					pidLList = db.getMyStarredPaper();
					
					for(int i=0;i<pidList.size();i++)
					{
						db.insertMyScheduledPaper(pidList.get(i).toString());
						db.updatePaperBySchedule(pidList.get(i).toString(), "yes");
					}
					for(int i =0;i<pidRList.size();i++)
					{
						db.insertMyRecommendedPaper(pidRList.get(i).toString());
						db.updatePaperByRecommend(pidRList.get(i).toString(), "yes");
					}
					for(int i =0;i<pidLList.size();i++)
					{
						db.updatePaperByStar(pidLList.get(i).toString(), "yes");
					}
					db.close();
					}
					catch (Exception e) {
						//log
					}
					}
					else{
						publishProgress(11);
						state = 4;//error: no return
					}
					}
					else{
					publishProgress(11);
					state = 3;//error
					}
					state +=1;//success
				}
					else{
						state = 2;//error
					}					
				}
				else{
					state=0;
				}
			
				return state;
			}
			@Override
			protected void onProgressUpdate(Integer... progress) {
				session = (TextView) findViewById(R.id.sessionupdate);
				presentation = (TextView) findViewById(R.id.presentationupdate);
				paper = (TextView) findViewById(R.id.paperupdate);
				sync = (TextView) findViewById(R.id.papersync);
				int command= progress[0];
				switch(command){
				case 0:
					session.setCompoundDrawablesWithIntrinsicBounds(R.drawable.accept, 0, 0, 0);
					session.setText("Update session information: success!");
					break;
				case 1:
					session.setCompoundDrawablesWithIntrinsicBounds(R.drawable.error, 0, 0, 0);
					session.setText("Fail to update session information");
					break;
				case 2:
					presentation.setCompoundDrawablesWithIntrinsicBounds(R.drawable.accept, 0, 0, 0);
					presentation.setText("Update presentation information: success!");
					break;
				case 3:
					presentation.setCompoundDrawablesWithIntrinsicBounds(R.drawable.error, 0, 0, 0);
					presentation.setText("Fail to update presentation information");
					break;
				case 4:
					paper.setCompoundDrawablesWithIntrinsicBounds(R.drawable.accept, 0, 0, 0);
					paper.setText("Update paper information: success!");
					break;
				case 5:
					paper.setCompoundDrawablesWithIntrinsicBounds(R.drawable.error, 0, 0, 0);
					paper.setText("Fail to update paper information");
					break;
				case 6:
					session.setCompoundDrawablesWithIntrinsicBounds(R.drawable.db_refresh, 0, 0, 0);
					session.setText("Updating session information ...");
					break;
				case 7:
					presentation.setCompoundDrawablesWithIntrinsicBounds(R.drawable.db_refresh, 0, 0, 0);
					presentation.setText("Updating presentation information ...");
					break;
				case 8:
					paper.setCompoundDrawablesWithIntrinsicBounds(R.drawable.db_refresh, 0, 0, 0);
					paper.setText("Updating paper information ...");
					break;
				case 9:
					sync.setCompoundDrawablesWithIntrinsicBounds(R.drawable.db_refresh, 0, 0, 0);
					sync.setText("Updating schedule and recommendation ...");
					break;
				case 10:
					sync.setCompoundDrawablesWithIntrinsicBounds(R.drawable.accept, 0, 0, 0);
					sync.setText("Update schedule and recommendation: success!");
					break;
				case 11:
					sync.setCompoundDrawablesWithIntrinsicBounds(R.drawable.error, 0, 0, 0);
					sync.setText("Fail to update schedule and recommendation");
					break;
				default:
					break;
					
				}
					
				}
		@Override
		protected void onPostExecute(Integer state){
			success = (TextView) findViewById(R.id.success);
					switch(state){
					case 1:
						Toast.makeText(getApplicationContext(),  
				                "Updated!",  
				                Toast.LENGTH_LONG)  
				             .show(); 
						
						success.setText("Update Success!");
						break;
					case 2:
						Toast.makeText(getApplicationContext(),  
				                "Server error, please try again.",  
				                Toast.LENGTH_LONG)  
				             .show();
						
						success.setText("Update Fail!");
						break;
					case 0:
						Toast.makeText(getApplicationContext(),  
				                "Is the latest data, server last update was on "+Conference.timstamp,  
				                Toast.LENGTH_LONG)  
				             .show(); 
						
						success.setText("No need to update.");
						break;
					case 5:
						Toast.makeText(getApplicationContext(),  
				                "Conference information is updated, but no personal schedule information",  
				                Toast.LENGTH_LONG)  
				             .show(); 
						
						success.setText("Update Success!Please go to \"My schedule\" to schedule or sync with DB.");
						break;
					case 4:
						Toast.makeText(getApplicationContext(),  
				                "Conference information is updated, but not personal schedule information due to not sign in.",  
				                Toast.LENGTH_LONG)  
				             .show(); 
						
						success.setText("Update Success!Please go to \"My schedule\" to schedule or sync with DB.");
						break;
					default:
						break;
					}
				}
			
		}
}
