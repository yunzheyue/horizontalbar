package com.example.app5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HorizontalBarView horizontalbar = (HorizontalBarView)findViewById(R.id.horizontalbar);
        ArrayList<HorizontalBarView.HoBarEntity> hoBarEntities = new ArrayList<>();
        HorizontalBarView.HoBarEntity hoBarEntity = new HorizontalBarView.HoBarEntity();
        hoBarEntity.content = "嗯啦";
        hoBarEntity.count = 12;
        hoBarEntities.add(hoBarEntity);
        HorizontalBarView.HoBarEntity hoBarEntity1 = new HorizontalBarView.HoBarEntity();
        hoBarEntity1.content = "啦额";
        hoBarEntity1.count = 72;
        hoBarEntities.add(hoBarEntity1);
        HorizontalBarView.HoBarEntity hoBarEntity2 = new HorizontalBarView.HoBarEntity();
        hoBarEntity2.content = "啦啦嗯嗯啦";
        hoBarEntity2.count = 25;
        hoBarEntities.add(hoBarEntity2);
        HorizontalBarView.HoBarEntity hoBarEntity3 = new HorizontalBarView.HoBarEntity();
        hoBarEntity3.content = "啦e啦ee啦";
        hoBarEntity3.count = 120;
        hoBarEntities.add(hoBarEntity3);
        horizontalbar.setHoBarData(hoBarEntities);
    }
}
