package group.lis.uab.trip2gether;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class MainTravelList extends ActionBarActivity {
    public static String prova2 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_travel_list);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "lWa3WC7l4Y7DCZx5qChjsANfUwjclOOlIITaok2Q", "QmI8vQiaF19KvK1S2XrfozsqZ9yjE42ymeojuugx");


        //ParseObject testObject = new ParseObject("TestObject");

        ParseQuery<ParseObject> query = ParseQuery.getQuery("TestObject");
        //testObject.put("prova", "la bona prova");
        //testObject.saveInBackground();
        query.getInBackground("QkMGFooHmS", new GetCallback<ParseObject>() {
            public void done(ParseObject object, ParseException e) {
                if (e == null) {

                    String prova = object.getString("prova");
                    //System.out.println(prova);
                    MainTravelList.prova2 = prova;

                } else {

                }
            }

            });
        //String prova = testObject.getString("prova");
        //System.out.println(prova2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_travel_list, menu);
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
