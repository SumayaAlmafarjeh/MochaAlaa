package com.example.mochaalaa.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.mochaalaa.Activity.Domain2.CategoryDomain;
/*import com.example.mochaalaa.Activity.Adapter.PopularAdapter;
import com.example.mochaalaa.Activity.Adapter.PopularItem;*/
import com.example.mochaalaa.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private RecyclerView.Adapter adapter,adapter2;
    //private RecyclerView recyclerViewCategoryList,getRecyclerViewPopularList;
   // private RecyclerView recyclerView;
    //private PopularAdapter adapter;
   /* private List<PopularItem> popularItems;
    private RecyclerView popularView;
    private PopularAdapter popularAdapter;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // recyclerViewCategory();
        /*   recyclerView = findViewById(R.id.popularView);
     popularView.setLayoutManager(new LinearLayoutManager(this));

        popularItems = new ArrayList<>();
        popularItems.add(new PopularItem("Iced Coffee", "$5.00", R.drawable.iced_coffee1));
        popularItems.add(new PopularItem("Hot Coffee", "$4.50", R.drawable.iced_coffee1));
        popularItems.add(new PopularItem("Breakfast Sandwich", "$6.00", R.drawable.iced_coffee1));
        popularItems.add(new PopularItem("Coffee Beans", "$10.00", R.drawable.iced_coffee1));

        popularAdapter = new PopularAdapter(popularItems);

        popularView.setAdapter(popularAdapter);*/


    }

  /*  private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.view1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList= new ArrayList<>();
        categoryList.add(new CategoryDomain("Iced Coffee","cat_1"));
        categoryList.add(new CategoryDomain("Hot Coffee","cat_2"));
        categoryList.add(new CategoryDomain("Breakfast","cat_3"));
        categoryList.add(new CategoryDomain("Coffee Beans","cat_4"));
        categoryList.add(new CategoryDomain("Coffee Machines","cat_5"));



    }*/
}