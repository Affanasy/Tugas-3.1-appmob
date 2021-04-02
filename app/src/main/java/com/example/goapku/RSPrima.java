package com.example.goapku;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSPrima extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listAct = new String[] {"Call Center","SMS Center", "Driving Direction","Website","Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }

    protected void onListItemClick (ListView j, View v, int position, long id){
        super.onListItemClick(j, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")){
                String nomortel = "tel:(0761) 8419007";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }
            else if (pilihan.equals("SMS Center"))
            {
                String sms= "Assalammualaikum";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082387873362"));
                a.putExtra("sms_body", sms);


            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs ="google.navigation:q=0.4968595686523937, 101.4003843693138";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            } else if (pilihan.equals("Website"))
            {
                String website = "https://rsprimapekanbaru.com/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Prima");
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
