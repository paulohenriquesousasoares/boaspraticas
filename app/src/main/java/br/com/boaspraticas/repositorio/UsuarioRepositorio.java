package br.com.boaspraticas.repositorio;

import java.util.List;

import br.com.boaspraticas.dominio.contrato.repositorio.IUsuarioRepositorio;
import br.com.boaspraticas.dominio.entidade.Usuario;


public class UsuarioRepositorio  implements IUsuarioRepositorio {


    @Override
    public Usuario getByUserName(String usuarioNome) {
        return new Usuario("paulo","email","pwd");
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public List<Usuario> get() {
        return null;
    }


    @Override
    public Usuario getById(int id) {
        return null;
    }


    @Override
    public void create(Usuario object) {

    }


    @Override
    public void update(Usuario object) {

    }
}
