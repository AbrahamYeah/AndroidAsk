package com.example.abraham.androidask;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Abraham on 24/04/2017.
 */

public class SimpleAsyncTaks extends AsyncTask <Void,Void,String> {
   private TextView mTextView;


    @Override
    protected String doInBackground(Void... params) {
        //	Generate	a	random	number	between	0	and	10
        Random r	=	new	Random();
        int	n	=	r.nextInt(11);
        //	Make	the	task	take	long	enough	that	we	have
        // 	time	to	rotate	the	phone	while	it	is	running
        int	s	=	n	*	200;
        //	Sleep	for	the	random	amount	of	time
        try	{
            Thread.sleep(s);
        }	catch	(InterruptedException	e)	{
            e.printStackTrace();
        }
        //	Return	a	String	result
        return	"Awake	at	last	after	sleeping	for	"	+	s	+	"	milliseconds!";

    }

    protected	void	onPostExecute(String	result)	{
        mTextView.setText(result);
    }

    public SimpleAsyncTaks(TextView tv)	{
        mTextView = tv;
    }
}
