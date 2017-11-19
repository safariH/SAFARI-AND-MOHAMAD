package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hilary.happytimesapp.HappeningPlaces;
import com.example.hilary.happytimesapp.MainActivity;
import com.example.hilary.happytimesapp.New_AccontActivity;
import com.example.hilary.happytimesapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LakeView extends Fragment {


    public LakeView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lake_view, container, false);
    }

}

