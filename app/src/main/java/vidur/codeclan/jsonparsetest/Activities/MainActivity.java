package vidur.codeclan.jsonparsetest.Activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vidur.codeclan.jsonparsetest.Activities.Client.ApiClient;
import vidur.codeclan.jsonparsetest.Activities.Models.DemoData;
import vidur.codeclan.jsonparsetest.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Button response;
    Context c = MainActivity.this;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutmanager;
    private static String BASE_URL = "http://arraystack.com/as9mobile/";
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: In on create");
        recyclerView = (RecyclerView) findViewById(R.id.recy_view);
        response = (Button) findViewById(R.id.bt_response);
        final Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create());

        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: In onClick");
                Retrofit retrofit = builder.build();
                response.setVisibility(View.GONE);

                ApiClient client = retrofit.create(ApiClient.class);

                Call<DemoData> call = client.getData(6);

                call.enqueue(new Callback<DemoData>() {
                    @Override
                    public void onResponse(Call<DemoData> call, Response<DemoData> response) {
                        Log.d(TAG, "onResponse: Getting data");
                        DemoData demo = response.body();
                        mAdapter = new RecyclerAdapter(demo.getResult(), c);
                        recyclerView.setHasFixedSize(true);
                        layoutmanager = new LinearLayoutManager(c);
                        recyclerView.setLayoutManager(layoutmanager);
                        recyclerView.setAdapter(mAdapter);
                        for (int i = 0 ; i < demo.getResult().size() ; i++) {
                            Log.d(TAG, "onResponse: Data at pos " + i + " is " + demo.getResult().get(i).toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<DemoData> call, Throwable t) {
                        Log.d(TAG, "onFailure: Failed" + t.toString());
                    }
                });


            }
        });
    }
}
