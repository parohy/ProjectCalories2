package sk.parohy.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import sk.parohy.myapplication.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        EditText text = root.findViewById(R.id.textHeight);
        text.setOnClickListener(v -> {
            NavHostFragment navHostFragment = (NavHostFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
            NavController navController = navHostFragment.getNavController();
            navController.navigate(R.id.actionGetHeight);
        });

        dashboardViewModel.height.observe(getViewLifecycleOwner(), integer -> {
            text.setText("" + integer);
        });

        return root;
    }
}