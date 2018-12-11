package dahun.co.kr.moviesearcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3개의 뷰 접근객체 얻기
        final EditText et_movie_name = findViewById(R.id.et_movie_name);
        Button bt_search = findViewById(R.id.bt_search);
        RecyclerView recycler_result = findViewById(R.id.recycler_result);

        // 리사이클러뷰 기본세팅
        recycler_result.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recycler_result.setLayoutManager(mLayoutManager);
        ArrayList<MovieInfo> movieInfoArrayList = new ArrayList<>();
        //foodInfoArrayList.add(new FoodInfo(R.drawable.strawberry, "5,000원"));
        MyAdapter myAdapter = new MyAdapter(movieInfoArrayList);
        recycler_result.setAdapter(myAdapter);

        // api에 접근하기 위한 값들
        final String clientId = "0nAId26ckL9jaOvR4VV2";
        final String clientSecret = "VCWV9qXncB";

        // bt_search를 클릭했을 때
        bt_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}
