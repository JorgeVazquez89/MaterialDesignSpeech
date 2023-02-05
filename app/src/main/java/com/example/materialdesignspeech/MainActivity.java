package com.example.materialdesignspeech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.materialdesignspeech.fragments.CardViewFragment;
import com.example.materialdesignspeech.fragments.OrderFragment;
import com.example.materialdesignspeech.fragments.WebFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private final CardViewFragment cardViewFragment = new CardViewFragment(MainActivity.this);
    private final OrderFragment orderFragment = new OrderFragment();
    private final WebFragment webFragment = new WebFragment();
    private final String CARD_VIEW_FRAGMENT_TAG = "cardViewFragment";
    private final String ORDER_FRAGMENT_TAG = "orderFragment";
    private final String WEB_FRAGMENT_TAG = "orderFragment";

    private FloatingActionButton floatingActionButton;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        setCardViewFragment();

        floatingActionButton = (FloatingActionButton) findViewById(R.id.mainBottomAppBarButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCardViewFragment();
            }
        });

        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch(item.getItemId()) {
                case R.id.menuOrderButton:
                    setOrderFragment();
                    return true;

                case R.id.menuSettingsButton:
                    setWebFragment();
                    return true;
            }
            return false;
        });
    }

    public void setFragment(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.addToBackStack(null);
    }

    public void setCardViewFragment(){
        setFragment();
        fragmentTransaction.replace(R.id.fragmentContainer, cardViewFragment, CARD_VIEW_FRAGMENT_TAG);
        fragmentTransaction.commit();
    }

    public void setOrderFragment(){
        setFragment();
        fragmentTransaction.replace(R.id.fragmentContainer, orderFragment, ORDER_FRAGMENT_TAG);
        fragmentTransaction.commit();
    }

    public void setWebFragment(){
        setFragment();
        fragmentTransaction.replace(R.id.fragmentContainer, webFragment, WEB_FRAGMENT_TAG);
        fragmentTransaction.commit();
    }
}