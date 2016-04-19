package br.com.boaspraticas.ui.activity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

import br.com.boaspraticas.R;
import br.com.boaspraticas.dominio.entidade.Usuario;
import br.com.boaspraticas.servico.UsuarioServico;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

   @Bind(R.id.main_usuairoNomeEdt)     EditText usuarioNome;
   @Bind(R.id.main_usuarioEmailEdt)    EditText usuarioEmail;
   @Bind(R.id.main_usuarioPasswordEdt) EditText usuarioPassword;
   @Bind(R.id.main_layout)             LinearLayout main_layout;

   private UsuarioServico mUsuarioServico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mUsuarioServico = new UsuarioServico();
    }

    @OnClick(R.id.main_logonBtn)
    public  void logar() {
       Usuario usuario =
               mUsuarioServico.authenticacao(usuarioNome.getText().toString(), usuarioPassword.getText().toString());

        if(! (usuario == null) ) {
            Snackbar snackbar = Snackbar.make(main_layout, "logado", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
    }

    @OnClick(R.id.main_createBtn)
    public void criarNovoUsuario() {

        Usuario u = new Usuario();
        u.setUsuarioEmail("email 1");
        u.setUsuarioNome("nome 1");
        u.setUsuarioPassword("p");

        mUsuarioServico.create(u);
        Snackbar snackbar = Snackbar.make(main_layout, "criado", Snackbar.LENGTH_LONG);
        snackbar.show();
    }

}
