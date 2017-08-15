package vidur.codeclan.jsonparsetest.Activities.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vidur on 8/14/2017.
 */

public class DemoData {
    @SerializedName("result")
    List<User> result;

    public List<User> getResult() {
        return result;
    }
}
