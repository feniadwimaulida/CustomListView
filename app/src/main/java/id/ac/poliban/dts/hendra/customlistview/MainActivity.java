package id.ac.poliban.dts.hendra.customlistview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Country> data = new ArrayList<>();
    private BaseAdapter adapter;
    private ListView lvCountry;


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountry = findViewById(R.id.listview);

        data.addAll(CountryData.getAllCountry());

        adapter = new CountryListAdapter(data);

        lvCountry.setAdapter(adapter);

        lvCountry.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Makanan yang anda pilih")
                    .setMessage("anda memilih: " +
                            data.get(position).getCountryName())
                    .setPositiveButton("OK", null).show();
        });
    }
}



