package com.example.tugas15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas15.Mahasiswa;
import com.example.tugas15.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new Adapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Ammar", "E41211319", "08123456781"));
        mahasiswaArrayList.add(new Mahasiswa("Fikri", "E41211320", "08123456782"));
        mahasiswaArrayList.add(new Mahasiswa("Hilmi ", "E41211321", "08123456783"));
        mahasiswaArrayList.add(new Mahasiswa("Alfan", "E41211322", "08123456784"));
        mahasiswaArrayList.add(new Mahasiswa("Abril", "E41211323", "08123456785"));
        mahasiswaArrayList.add(new Mahasiswa("Takah", "E41211324", "08123456786"));
        mahasiswaArrayList.add(new Mahasiswa("Rizal", "E41211325", "08123456787"));
        mahasiswaArrayList.add(new Mahasiswa("Rifqi", "E41211326", "08123456785"));
        mahasiswaArrayList.add(new Mahasiswa("Imam", "E41211327", "08123456786"));
        mahasiswaArrayList.add(new Mahasiswa("Habibie", "E41211328", "08123456787"));
        mahasiswaArrayList.add(new Mahasiswa("Daffa", "E41211329", "08123456788"));
    }
}