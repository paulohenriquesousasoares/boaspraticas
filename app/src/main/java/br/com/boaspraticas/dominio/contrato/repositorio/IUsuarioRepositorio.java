package br.com.boaspraticas.dominio.contrato.repositorio;

import br.com.boaspraticas.dominio.entidade.Usuario;


public interface IUsuarioRepositorio extends IRepositorioBase<Usuario>{

    Usuario getByUserName(String usuarioNome);
    void delete(int id);
}
