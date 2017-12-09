package youngjung.recyclerview_sample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HANSUNG on 2017-12-09.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder>{
    private ArrayList<Mydata> mItems;
    Context context;
    public Myadapter(ArrayList items, Context c) {
        context = c;
        mItems = items;
    }

    //ViewHolder는 사용자 정의 클레스다. 상속된 클레스로 하면 안된다. 내가 직접 만들어야 함.
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView title;
        public TextView content;

        public ViewHolder(View v){
            super(v);
            img = (ImageView) v.findViewById(R.id.img);
            title = (TextView) v.findViewById(R.id.title);
            content = (TextView) v.findViewById(R.id.content);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    //보여줄 Layout을 생성함.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;

    }

    //View에 보여줄 데이터를 묶어줌
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.img.setImageResource(mItems.get(position).getImageuri());
        holder.title.setText(mItems.get(position).getTitle());
        holder.content.setText(mItems.get(position).getContent());
    }

    //item 갯수
    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
