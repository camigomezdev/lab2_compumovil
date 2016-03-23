package co.edu.udea.compumovil.gr12.lab2apprun;

import android.app.Notification;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import co.edu.udea.compumovil.gr12.lab2apprun.model.Carrera;

/**
 * Created by SA on 23/03/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Carrera[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(Carrera[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_carrera, parent, false);
        return new ViewHolder(v);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.tvNombre.setText(mDataset[position].getNombre());
        holder.tvDistancia.setText(String.valueOf(mDataset[position].getDistancia()));
        holder.tvFecha.setText(mDataset[position].getFecha());
        holder.tvLugar.setText(mDataset[position].getLugar());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvDistancia,tvLugar, tvFecha;
        ImageView ivImagen;

        public ViewHolder(View itemView) {
            super(itemView);

            tvNombre = (TextView) itemView.findViewById(R.id.tv_run_nombre);
            ivImagen = (ImageView) itemView.findViewById(R.id.iv_foto);
            tvDistancia = (TextView) itemView.findViewById(R.id.tv_run_distancia);
            tvLugar= (TextView) itemView.findViewById(R.id.tv_run_lugar);
            tvFecha = (TextView) itemView.findViewById(R.id.tv_run_fecha);
        }
    }
}