package com.eldarian.translator.presentation.story;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.eldarian.translator.R;
import com.eldarian.translator.presentation.renderer.TranslationsRender;
import com.eldarian.translator.presentation.translator.TranslatorActivity;

public class StoryActivityPresenter extends AppCompatActivity {

    private RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        recycler = findViewById(R.id.recycler);
        recycler.setAdapter(new TranslationsRender());
        recycler.setLayoutManager(recycler.getLayoutManager());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.to_main:{
                Intent intent = new Intent(StoryActivityPresenter.this, TranslatorActivity.class);
                startActivity(intent);
                break;
            }
        }
        return true;
    }

}