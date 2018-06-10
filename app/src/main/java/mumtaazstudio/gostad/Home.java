package mumtaazstudio.gostad;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import mumtaazstudio.gostad.Fragment.AkunFragment;
import mumtaazstudio.gostad.Fragment.BerandaFragment;
import mumtaazstudio.gostad.Fragment.PesananFragment;


public class Home extends AppCompatActivity {

    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigationView);

        setupBottomNavigation();

        if (savedInstanceState == null) {
            loadBerandaFragment();
        }
    }

    private void setupBottomNavigation() {
        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_beranda:
                        loadBerandaFragment();
                        return true;
                    case R.id.navigation_pesanan:
                        loadPesananFragment();
                        return true;
                    case R.id.navigation_akun:
                        loadAkunFragment();
                        return true;
                }
                return false;
            }
        });
    }

    public void loadBerandaFragment(){
        BerandaFragment fragment = BerandaFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame,fragment);
        ft.commit();
    }

    public void loadPesananFragment(){
        PesananFragment fragment = PesananFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame,fragment);
        ft.commit();
    }

    public void loadAkunFragment(){
        AkunFragment fragment = AkunFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }
}
