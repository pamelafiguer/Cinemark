package es.maick.apkcinemark;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import es.maick.apkcinemark.databinding.ActivityMainBinding;
import es.maick.apkcinemark.model.Usuarios;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
public static String URL_API = "";
public static String URL_IMAGE = "";
public static es.maick.apkcinemark.model.Usuarios Usuarios = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);

        navController.addOnDestinationChangedListener( (navController1, navDestination, bundle) -> {
            int id = navDestination.getId();
            if ( id == R.id.navigation_splash)
                navView.setVisibility( View.INVISIBLE );
            else navView.setVisibility( View.VISIBLE );
        });
    }

}