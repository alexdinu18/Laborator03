package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class PhoneDialerActivity extends Activity {
//	static int buttonIds[] = {R.id};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        
//        final EditText introduceNumber = (EditText)findViewById(id) //new EditText(this);
        final Button b1 = new Button(this);//(Button)findViewById();
        b1.setOnClickListener(new View.OnClickListener() {
        	 
            @Override
            public void onClick(View view) {
              String identity = introduceYourselfEditText.getText().toString();
              b1.getText();
            }
       
          });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
