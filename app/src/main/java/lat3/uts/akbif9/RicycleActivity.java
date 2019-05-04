package lat3.uts.akbif9;

/* Tanggal : 04 Mei 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RicycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricycle);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("Bangun Tidur");
        description.add("Bangung tidur, solat subuh, beres beres kamar, mandi");

        id.add("2");
        title.add("Kuliah");
        description.add("pagi pagi berangkat kuliah kalau ada jadwal pagi");

        id.add("3");
        title.add("pulang kuliah");
        description.add("pulang kuliah istirahat dikosan nonton youtube main game");

        id.add("4");
        title.add("malam hari");
        description.add("ngerjain tugas kalau ada, kalau nggk main game");

        id.add("5");
        title.add("Tengah malam");
        description.add("Tengah malam istirahat tidur");

        id.add("6");
        title.add("Repeat");
        description.add("ulangi kegiatan hari ini di esok hari");

        recyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        mAdapter = new RecyclerAdapter(getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);
    }
}
