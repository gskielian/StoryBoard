package io.spectruminnovations.www.storyboard;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Page_3_IntentGetExtra_Example extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3_intent_get_extra_example);
        Bundle intent_extras = getIntent().getExtras();

        //get their choice
        String their_choice = intent_extras.getString("Choice");

        //display their choice
        TextView view_choice = (TextView) findViewById(R.id.selection_text);
        view_choice.setText("You Selected " + their_choice + "!");

        //judge their choice
        String success_fail_message = intent_extras.getString("SomeResponse");
        TextView your_judgement = (TextView) findViewById(R.id.answer_text);

        if (their_choice.equals("Blue and Black")) {


            your_judgement.setText(success_fail_message);
        }
        else if (their_choice.equals("White and Gold")) {

            your_judgement.setText(success_fail_message);
        }



        //BUTTONS SECTION BELOW

        Button try_again_button = (Button) findViewById(R.id.try_again);

        try_again_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent intent = new Intent(Page_3_IntentGetExtra_Example.this, Page_2_IntentPutExtra.class);
                startActivity(intent);
            }
        });

        Button next_page_button = (Button) findViewById(R.id.page_4_button);


        next_page_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below
               Intent intent = new Intent(Page_3_IntentGetExtra_Example.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page_3_intent_get_extra_example, menu);
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
