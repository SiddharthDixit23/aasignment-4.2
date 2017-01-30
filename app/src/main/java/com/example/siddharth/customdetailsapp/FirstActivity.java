package com.example.siddharth.customdetailsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<String> mName;
    private ArrayList<String> mNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mListView = (ListView) findViewById(R.id.lv_view);

        mName = new ArrayList<>();
        mNumber = new ArrayList<>();
        mName.add("Siddharth");
        mName.add("Rahul");
        mName.add("Nikhil");
        mName.add("Apurv");
        mName.add("Anil");
        mName.add("Raju");
        mName.add("Lohith");
        mNumber.add("9585436448");
        mNumber.add("9858546831");
        mNumber.add("7585423164");
        mNumber.add("7548214624");
        mNumber.add("7896524821");
        mNumber.add("4521347685");
        mNumber.add("9865893445");
        mListView.setAdapter(new MyAdapter());



    }
    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return mName.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View rowView = getLayoutInflater().inflate(R.layout.activity_second,viewGroup,false);
            TextView mTvone = (TextView)rowView.findViewById(R.id.one);
            mTvone.setText(mName.get(i));
            TextView mTvtwo = (TextView)rowView.findViewById(R.id.two);
            mTvtwo.setText(mNumber.get(i));
            return rowView;
        }
    }
}
