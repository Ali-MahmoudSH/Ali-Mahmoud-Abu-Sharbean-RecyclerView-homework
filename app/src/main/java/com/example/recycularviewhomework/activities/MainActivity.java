package com.example.recycularviewhomework.activities;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycularviewhomework.R;
import com.example.recycularviewhomework.adapters.AppAdapter;
import com.example.recycularviewhomework.models.App;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<App> apps;
    AppAdapter appAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        //int serial_number, int app_icon, int app_rate, String app_name, String app_category, String app_size
        apps = new ArrayList<>();
        apps.add(new App("1", R.drawable.block_blast, "4.5", "Block Blast!", "Puzzle • Block • Casual • Offline",
                "161 MB"));
        apps.add(new App("2", R.drawable.vita_mahjong, "4.6", "Vita Mahjong", "Board • Puzzle • Mahjong solitaire",
                "142 MB"));
        apps.add(new App("3", R.drawable.jigsolitaire, "4.3", "Jigsolitaire", " Puzzle", "71 MB"));
        apps.add(new App("4", R.drawable.tile_explorer, "4.5", "Tile Explorer - Triple Match",
                " Puzzle • Match 3 • Casual • Offline", "150 MB"));
        apps.add(new App("5", R.drawable.water_match, "4.7", "Water Match", "Casual", "174 MB"));
        apps.add(new App("6", R.drawable.roblox, "4.4", "Roblox", "Adventure • Simulation • Sandbox", "174 MB"));
        apps.add(new App("7", R.drawable.happy_color, "4.6", "Happy Color: Colouring Game",
                "Board • Puzzle • Casual", "99 MB"));
        appAdapter = new AppAdapter(apps,MainActivity.this);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rv.setAdapter(appAdapter);
    }
}