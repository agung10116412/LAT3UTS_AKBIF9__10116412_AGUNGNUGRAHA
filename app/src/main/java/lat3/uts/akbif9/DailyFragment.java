package lat3.uts.akbif9;

/* Tanggal : 04 Mei 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DailyFragment extends Fragment  {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle, container, false);

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

        recyclerView = view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(getActivity().getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
