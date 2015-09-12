package br.com.heiderlopes.demomultitelasandroid;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

public class ListaItensActivity extends FragmentActivity implements ListaItensFragment.OnItemSelectedListener {

    //Variavel para controle se a tela de detalhe e a lista estao na mesma tela
    private boolean telaUnica = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_itens);
        determinePaneLayout();
    }

    private void determinePaneLayout() {
        FrameLayout fragmentItemDetail = (FrameLayout) findViewById(R.id.flDetailContainer);
        if (fragmentItemDetail != null) {
            telaUnica = true;
            ListaItensFragment listaItensFragment =
                    (ListaItensFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentItemsList);
        }
    }

    @Override
    public void onItemSelected(Item item) {
        if (telaUnica) {
            // Atualiza o framelayout com o fragment
            DetalheItemFragment detalheItemFragment = DetalheItemFragment.newInstance(item);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flDetailContainer, detalheItemFragment);
            ft.commit();
        } else {
            //Inicia a Activity de detalhe caso não seja um tablet
            Intent i = new Intent(this, DetalheItemActivity.class);
            i.putExtra("item", item);
            startActivity(i);
        }
    }
}
