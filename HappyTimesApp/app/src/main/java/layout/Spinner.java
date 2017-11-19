package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.hilary.happytimesapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Spinner extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_main,container,false);
        String [] type= {"Administrator","Customer"};
        android.widget.Spinner spinner =(android.widget.Spinner)view.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_dropdown_item,type);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        return view;
    }




}
