package com.github.ndagnas.progressdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.ndagnas.progressviews.ColoredProgressView;

public class MainActivity extends AppCompatActivity
	{

	@Override
	protected void onCreate ( Bundle savedInstanceState )
		{
		super.onCreate ( savedInstanceState );
		setContentView ( R.layout.activity_main );

		ColoredProgressView progressView = this.findViewById ( R.id.activity_main_indicator_view );

		progressView.spin ();
		}
	}
