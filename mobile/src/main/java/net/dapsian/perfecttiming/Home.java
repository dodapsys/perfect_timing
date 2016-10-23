package net.dapsian.perfecttiming;

import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Calendar cal = Calendar.getInstance();
        String day = new String(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
        String year = new String(String.valueOf(cal.get(Calendar.YEAR)));
        TextView date = (TextView)findViewById(R.id.date);
        date.setText(Html.fromHtml(day + "<sup><small>" + prefix(cal.get(Calendar.DAY_OF_MONTH)) + "</sup></small>" + "   " + month(cal.get(Calendar.MONTH))));
        String weekn = new String(String.valueOf(cal.get(Calendar.WEEK_OF_YEAR)));
        String dayn = new String(String.valueOf(cal.get(Calendar.DAY_OF_YEAR)));
        TextView weekday = (TextView)findViewById(R.id.weekandday);
        weekday.setText("Week " + weekn + ", Day " + dayn + ", Year " + year);

    }
    String month(int mon){
        String name = new String();
        if(mon == 1) {name = "January";}
        if(mon == 2) {name = "February";}
        if(mon == 3) {name = "March";}
        if(mon == 4) {name = "April";}
        if(mon == 5) {name = "May";}
        if(mon == 6) {name = "June";}
        if(mon == 7) {name = "July";}
        if(mon == 8) {name = "August";}
        if(mon == 9) {name = "September";}
        if(mon == 10) {name = "October";}
        if(mon == 11) {name = "November";}
        if(mon == 12) {name = "December";}
        return name;
    }
    String prefix(int day){
        String pref = new String();
        if (day%10 == 1) pref = "st";
        else if (day%10 == 2) pref = "nd";
        else if (day%10 == 3) pref = "rd";
        else pref = "th";
        return pref;
    }
}
