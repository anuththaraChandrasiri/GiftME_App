package com.example.madd_ordermanagement.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.madd_ordermanagement.Model.Products;
import com.example.madd_ordermanagement.R;
import com.example.madd_ordermanagement.ViewHolder.ProductViewHolder;
import com.example.madd_ordermanagement.ViewProductDetails;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class HomeFragment extends Fragment {

    private View homeView ;
    private RecyclerView productsList ;
    private DatabaseReference ProductsRef ;

    public HomeFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        homeView = inflater.inflate(R.layout.fragment_home, container, false);
//
//        productsList = (RecyclerView) homeView.findViewById(R.id.recycler_menu_fr_home) ;
//        productsList.setHasFixedSize(true);
//        productsList.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        ProductsRef = FirebaseDatabase.getInstance().getReference().child("Products");

        return homeView;
    }

 //   @Override
//    public void onStart() {
//
//        super.onStart();
//
//        FirebaseRecyclerOptions<Products> options =
//                new FirebaseRecyclerOptions.Builder<Products>()
//                        .setQuery(ProductsRef, Products.class)
//                        .build();
//
//        FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter =
//                new FirebaseRecyclerAdapter<Products, ProductViewHolder>(options) {
//
//                    @Override
//                    protected void onBindViewHolder(@NonNull ProductViewHolder holder, int position, @NonNull final Products model) {
//
//                        holder.txtProductName.setText(model.getName());
//                        holder.txtProductPrice.setText("Price = " + model.getPrice() + " LKR");
//                        holder.txtProductDescription.setText(model.getDescription());
//                        Picasso.get().load(model.getImage()).into(holder.cardImageView);
////
////                        holder.itemView.setOnClickListener(new View.OnClickListener() {
////                            @Override
////                            public void onClick(View view) {
////
////                                Intent intent = new Intent(HomeFragment.this, ViewProductDetails.class);
////                                intent.putExtra("pid", model.getPid());
////                                startActivity(intent);
////
////                            }
////                        });
//
//                    }
//
//                    @NonNull
//                    @Override
//                    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items_layout, parent, false);
//                        ProductViewHolder holder = new ProductViewHolder(view);
//                        return holder;
//                    }
//                };
//
//        productsList.setAdapter(adapter);
//        adapter.startListening();
//    }
}

