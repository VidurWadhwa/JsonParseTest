package vidur.codeclan.jsonparsetest.Activities;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import vidur.codeclan.jsonparsetest.Activities.Models.User;
import vidur.codeclan.jsonparsetest.R;

/**
 * Created by vidur on 8/15/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.mViewHolder> {

    private List<User> mUser = new ArrayList<User>();
    Context c;

    public RecyclerAdapter(List<User> mUser, Context c) {

        this.mUser = mUser;
        this.c = c;

    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_layout, parent, false);
        mViewHolder viewHolder = new mViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {
        holder.tv_username.setText(mUser.get(position).getUsername());
        holder.tv_email.setText(mUser.get(position).getEmail());
        Picasso.with(c).load(mUser.get(position).getImage_link()).into(holder.profilepic);
    }

    @Override
    public int getItemCount() {
        return mUser.size();
    }

    public static class mViewHolder extends RecyclerView.ViewHolder{

        ImageView profilepic;
        TextView tv_username, tv_email;
        public mViewHolder(View itemView) {
            super(itemView);
            profilepic = (ImageView) itemView.findViewById(R.id.imageView);
            tv_username = (TextView) itemView.findViewById(R.id.tv_username);
            tv_email = (TextView) itemView.findViewById(R.id.tv_email);
        }

    }

}
