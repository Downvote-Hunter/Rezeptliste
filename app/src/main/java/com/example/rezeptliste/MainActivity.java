package com.example.rezeptliste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentContainerView fRecipe = findViewById(R.id.fragmentRecipeView);
        FragmentContainerView fIngredient = findViewById(R.id.fragmentIngredientView);
        TabLayout tabView = findViewById(R.id.tabLayout);


        fRecipe.setVisibility(View.GONE);

        tabView.addOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tabView.getSelectedTabPosition()) {
                    case 0:
                        fRecipe.setVisibility(View.GONE);
                        fIngredient.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        fRecipe.setVisibility(View.VISIBLE);
                        fIngredient.setVisibility(View.GONE);
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


}