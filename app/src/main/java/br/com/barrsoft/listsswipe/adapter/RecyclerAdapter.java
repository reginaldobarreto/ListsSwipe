package br.com.barrsoft.listsswipe.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import br.com.barrsoft.listsswipe.R;
import br.com.barrsoft.listsswipe.model.Materia;
import br.com.barrsoft.listsswipe.view.ViewHolder;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    public static final String TAG = RecyclerAdapter.class.getName();
    private List<Materia> listModel;

    public RecyclerAdapter(List<Materia> listModel) {
        this.listModel = listModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Materia materia = listModel.get(position);
        holder.title.setText(materia.getTitle());
        holder.subtile.setText(materia.getSubTitle());
        holder.body.setText(materia.getBody());
        Log.i(TAG, "onBindViewHolder: " + position);
    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

}
