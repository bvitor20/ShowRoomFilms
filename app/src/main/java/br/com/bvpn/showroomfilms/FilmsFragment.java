package br.com.bvpn.showroomfilms;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class FilmsFragment extends Fragment {

    public FilmsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_principal, container, false);

        String[] data = {
                "Filme 01",
                "Filme 02"
        };
        List<String> listFilms = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter<String> filmsAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_films,
                R.id.list_item_films_textview,
                listFilms);
        ListView listView = (ListView)
                rootView.findViewById(R.id.listView_films);
        listView.setAdapter(filmsAdapter);
        return rootView;
    }


}