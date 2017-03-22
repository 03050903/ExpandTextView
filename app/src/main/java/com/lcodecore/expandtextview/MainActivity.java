package com.lcodecore.expandtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lcodecore.extextview.ExpandTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    public int setInflateId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        ListView lv = (ListView) findViewById(R.id.lv);
//        List<String> data = new ArrayList<>();
        String test = getString(R.string.test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
        data.add(test);
//
//        lv.setAdapter(new ArrayAdapter<String>(this, R.layout.item_extext, R.id.tv_expand, data));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter());
    }

    private List<String> data = new ArrayList<>();

    private class RecyclerAdapter extends RecyclerView.Adapter<Holder> {


        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new Holder(View.inflate(MainActivity.this, R.layout.item_extext, null));
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.tv.setText(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }

    class Holder extends RecyclerView.ViewHolder {
        ExpandTextView tv;

        public Holder(View itemView) {
            super(itemView);
            tv = (ExpandTextView) itemView.findViewById(R.id.tv_expand);
        }
    }
}
