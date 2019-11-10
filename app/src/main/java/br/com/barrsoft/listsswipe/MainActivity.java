package br.com.barrsoft.listsswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import br.com.barrsoft.listsswipe.adapter.RecyclerAdapter;
import br.com.barrsoft.listsswipe.model.Materia;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName();
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    List<Materia> listModel = new ArrayList<>();
    private Materia nota;
    private Materia nota1;
    private Materia nota2;
    private Materia nota3;
    private Materia nota4;
    private Materia nota5;
    private Materia nota6;
    private Materia nota7;
    private Materia nota8;
    private Materia nota9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        nota = new Materia("Soltaram o ladrão","ratazana na rua","Mortadela de grátis para a esquerda");
        nota1 = new Materia("Tricolor Perde","Nova derrota","Morumbi chora");
        nota2 = new Materia("Cabocla","Novela","Body");
        nota3 = new Materia("Jovem Pan","Radio online","Body");
        nota4 = new Materia("Trapalhões","Seriado","Body");
        nota5 = new Materia("Marvel","Capitão América","Body");
        nota6 = new Materia("DC","Mulher Maravilha","Body");
        nota7 = new Materia("Sony","Playstation","Body");
        nota8 = new Materia("Xbox","One X","Body");
        nota9 = new Materia("Chabuia","Filme","Body");


        listModel.add(nota);
        listModel.add(nota1);
        listModel.add(nota2);
        listModel.add(nota3);
        listModel.add(nota4);
        listModel.add(nota5);
        listModel.add(nota6);
        listModel.add(nota7);
        listModel.add(nota8);
        listModel.add(nota9);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(listModel);
        recyclerView.setAdapter(adapter);
        Log.i(TAG, "onCreate: ");
    }
}
