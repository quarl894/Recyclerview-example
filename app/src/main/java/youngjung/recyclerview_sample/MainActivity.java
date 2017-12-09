package youngjung.recyclerview_sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    Context mcontext;
    RecyclerView.LayoutManager layoutManager;
    Myadapter myadapter;
    ArrayList<Mydata> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcontext = getApplicationContext();

        mRecyclerview = (RecyclerView) findViewById(R.id.rView);
        mRecyclerview.setHasFixedSize(true);

        result = getDataset();

        layoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(layoutManager);

        myadapter = new Myadapter(result,mcontext);
        mRecyclerview.setAdapter(myadapter);
    }

    //ArrayList data 생성
    public ArrayList<Mydata> getDataset(){
        ArrayList<Mydata> data = new ArrayList<Mydata>();
        //image는 url 넣으면 됨
        int num =0;

        for(int i=0; i<10; i++){
            data.add(new Mydata(num,"테스트","화이팅"));
            num++;
        }
        return data;
    }
}
