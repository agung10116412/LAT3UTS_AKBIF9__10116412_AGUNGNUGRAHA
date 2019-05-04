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
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {


    List<gallery> lstgallery ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ricycleview_gallery, container, false);

        lstgallery = new ArrayList<>();
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri1));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri2));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri3));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri4));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri5));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri6));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri7));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri8));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri9));
        lstgallery.add(new gallery("My Life on Camera",R.drawable.galeri10));


        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recycler_view);
        RicycleGalleryAdapter myAdapter = new RicycleGalleryAdapter(this.getContext(),lstgallery);
        myrv.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        myrv.setAdapter(myAdapter);

        return view;
    }
}