package sk.parohy.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import sk.parohy.myapplication.R;

public class HeightDialog extends Fragment {

    private HeightDialogVM heightViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.height_dialog,null, false);

        EditText picker = view.findViewById(R.id.editText);
        Button submit = view.findViewById(R.id.submit);

        heightViewModel = new ViewModelProvider(this).get(HeightDialogVM.class);

        submit.setOnClickListener(v -> {
            heightViewModel.setHeight(Integer.parseInt(picker.getEditableText().toString()));
            getActivity().onBackPressed();
        });

        return view;
    }
}
