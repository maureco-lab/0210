package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPlaneta extends RecyclerView.Adapter<AdapterPlaneta.ViewHolder> {

    private List<Planetas> lstPlanetas;
    private Context context;

    public AdapterPlaneta(List<Planetas> lstPlanetas, Context context) {
        this.lstPlanetas = lstPlanetas;
        this.context = context;
    }

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
        return lstPlanetas.size();
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
