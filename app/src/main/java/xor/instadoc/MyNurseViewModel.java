package xor.instadoc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyNurseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyNurseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Thislery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}