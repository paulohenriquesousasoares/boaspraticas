package br.com.boaspraticas.servico;

import br.com.boaspraticas.dominio.contrato.repositorio.IUsuarioRepositorio;
import br.com.boaspraticas.dominio.contrato.servico.IUsuarioServico;
import br.com.boaspraticas.dominio.entidade.Usuario;
import br.com.boaspraticas.repositorio.UsuarioRepositorio;


public class UsuarioServico implements IUsuarioServico {

    private UsuarioRepositorio mUsuarioRepositorio;


    public UsuarioServico () {
        mUsuarioRepositorio = new UsuarioRepositorio();
    }

    @Override
    public Usuario authenticacao(String usuarioNome, String usuarioPassword) {

        Usuario usuario =  mUsuarioRepositorio.getByUserName(usuarioNome);

        if(usuario == null)
            return  null;

        if(usuario.getUsuarioPassword().equals(usuarioPassword))
            return  usuario;

        return  null;
    }


    @Override
    public void create(Usuario usuario) {
        mUsuarioRepositorio.create(usuario);
    }
}
