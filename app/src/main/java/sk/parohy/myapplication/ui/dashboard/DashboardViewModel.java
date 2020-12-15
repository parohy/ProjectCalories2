package sk.parohy.myapplication.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import sk.parohy.myapplication.api.UserRepository;

public class DashboardViewModel extends ViewModel {
    private UserRepository repo = UserRepository.getInstance();

    public LiveData<Integer> height = Transformations.map(repo.user, input -> input.height);
    public LiveData<Integer> weight = Transformations.map(repo.user, input -> input.weight);
 }