package sk.parohy.myapplication.api;

import androidx.lifecycle.MutableLiveData;

/*
* REST & Databaza
* https://developer.android.com/codelabs/android-room-with-a-view#0
* Zacni robit v Kotline :)
* */
public class UserRepository {
    static UserRepository INSTANCE = null;

    public static UserRepository getInstance() {
        if (INSTANCE == null) INSTANCE = new UserRepository();
        return INSTANCE;
    }


    public MutableLiveData<User> user = new MutableLiveData();

    public void setUserHeight(int height) {
        User user = this.user.getValue();
        user.height = height;
        this.user.setValue(user);
    }


}

