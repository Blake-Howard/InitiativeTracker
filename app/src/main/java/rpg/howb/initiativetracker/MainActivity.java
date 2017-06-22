package rpg.howb.initiativetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Basic Array of strings
    String[] players = {"Elzaron", "Dalben", "Tordic", "Avacat", "Magnolia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, players);

        ListView listView = (ListView) findViewById(R.id.player_list);
        listView.setAdapter(adapter);
    }
}
