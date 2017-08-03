package rpg.howb.initiativetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Player> players = new ArrayList<Player>();
    //Basic Array of strings

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        players.add(new Player("Elzaron"));
        players.add(new Player("Dalben"));
        players.add(new Player("Tordic"));
        players.add(new Player("Avacat"));
        players.add(new Player("Magnolia"));

        String[] displayList = new String[players.size()];
        for (int i = 0; i < players.size(); i++){
            displayList[i] = players.get(i).getName();
        }
        System.out.println("made it");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, displayList);

        ListView listView = (ListView) findViewById(R.id.player_list);
        listView.setAdapter(adapter);
    }
}
