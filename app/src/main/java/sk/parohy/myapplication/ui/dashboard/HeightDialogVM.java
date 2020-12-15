package sk.parohy.myapplication.ui.dashboard;

import androidx.lifecycle.ViewModel;

import sk.parohy.myapplication.api.UserRepository;

public class HeightDialogVM extends ViewModel {
    private UserRepository repo = UserRepository.getInstance();

    public void setHeight(int height) {
        repo.setUserHeight(height);
    }
}
