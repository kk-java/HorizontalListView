package com.liucanwen.horizontallistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.liucanwen.horizontallistview.view.HorizontalListView;

public class MainActivity extends Activity
{
	private HorizontalListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initializeViews();
	}

	private void initializeViews()
	{
		listview = (HorizontalListView) findViewById(R.id.listview);

		listview.setAdapter(new MyAdapter());
	}

	class MyAdapter extends BaseAdapter
	{

		@Override
		public int getCount()
		{
			return 10;
		}

		@Override
		public Object getItem(int position)
		{
			return null;
		}

		@Override
		public long getItemId(int position)
		{
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent)
		{
			View view = LayoutInflater.from(MainActivity.this).inflate(
					R.layout.listview_item, null);
			return view;
		}
	}
}
