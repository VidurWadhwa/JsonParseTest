package vidur.codeclan.jsonparsetest.Activities.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import vidur.codeclan.jsonparsetest.Activities.Models.DemoData;

/**
 * Created by vidur on 8/14/2017.
 */

public interface ApiClient {

    @FormUrlEncoded
    @POST("admin.php")
    Call<DemoData> getData(@Field("operationid") int operationid);

}
