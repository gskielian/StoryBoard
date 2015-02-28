package io.spectruminnovations.www.storyboard;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Page_2_IntentPutExtra extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2_intent_put_extra);

        Button button_blue_black = (Button) findViewById(R.id.its_blue_and_black_button);

        button_blue_black.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent intent = new Intent(Page_2_IntentPutExtra.this, Page_3_IntentGetExtra_Example.class);
                intent.putExtra("Choice", "Blue and Black");
                intent.putExtra("SomeResponse", "Congratulations, you're right!");
                //... you get the idea
                startActivity(intent);
            }
        });

        Button button_white_gold = (Button) findViewById(R.id.its_white_and_gold_button);


        button_white_gold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent intent = new Intent(Page_2_IntentPutExtra.this, Page_3_IntentGetExtra_Example.class);
                intent.putExtra("Choice", "White and Gold");
                intent.putExtra("SomeResponse", "You are wrong!");
                //... you get the idea
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page_2_intent_put_extra, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
