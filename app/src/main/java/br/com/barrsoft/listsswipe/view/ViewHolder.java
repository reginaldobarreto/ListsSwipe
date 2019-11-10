package br.com.barrsoft.listsswipe.view;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.com.barrsoft.listsswipe.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewHolder extends RecyclerView.ViewHolder {
    
    public static final String TAG = ViewHolder.class.getName();

    @BindView(R.id.textViewTitle)
    public TextView title;
    @BindView(R.id.textViewSubTitle)
    public TextView subtile;
    @BindView(R.id.textViewBody)
    public TextView body;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        Log.i(TAG, "ViewHolder: ");
    }
}
