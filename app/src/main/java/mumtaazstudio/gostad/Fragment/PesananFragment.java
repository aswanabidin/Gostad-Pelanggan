package mumtaazstudio.gostad.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import mumtaazstudio.gostad.R;

public class PesananFragment extends Fragment {



    public PesananFragment() {
        // Required empty public constructor
    }

    public static PesananFragment newInstance(){
        return new PesananFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesanan, container, false);
    }

}
