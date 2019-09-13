package xor.instadoc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MedSearchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MedSearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Thislery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}