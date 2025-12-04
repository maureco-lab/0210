package br.com.etecia.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterPlaneta extends RecyclerView.Adapter<AdapterPlaneta.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgCardPlaneta;
        TextView txtCardPlaneta, subtxtCardPlaneta;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardPlaneta = itemView.findViewById(R.id.imgCardPlaneta);
            txtCardPlaneta = itemView.findViewById(R.id.txtCardPlaneta);
            subtxtCardPlaneta = itemView.findViewById(R.id.subtxtCardPlaneta);
        }
    }
}
