package br.com.heiderlopes.demomultitelasandroid;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetalheItemActivity extends AppCompatActivity {

    private DetalheItemFragment detalheItemFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalhe_item);

        Item item = (Item) getIntent().getSerializableExtra("item");

        if (savedInstanceState == null) {
            detalheItemFragment = DetalheItemFragment.newInstance(item);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flDetailContainer, detalheItemFragment);
            ft.commit();
        }
    }
}
