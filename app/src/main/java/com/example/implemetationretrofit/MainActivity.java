package com.example.implemetationretrofit;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        processData();
    }
    private void processData()
    {
        Call<List<ObjectModel>> call = NetworkManager.getInstance().getAPI().getData();
        call.enqueue(new Callback<List<ObjectModel>>() {
            @Override
            public void onResponse(Call<List<ObjectModel>> call, Response<List<ObjectModel>> response) {
                List<ObjectModel> data = response.body();
                recyclerAdapter adapter = new recyclerAdapter(data);
                Log.d("Tag", "onResponse:"+response+"");
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<List<ObjectModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
