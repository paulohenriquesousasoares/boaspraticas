package br.com.boaspraticas.dominio.contrato.servico;

import br.com.boaspraticas.dominio.entidade.Usuario;

public interface IUsuarioServico {

    Usuario authenticacao(String usuarioNome, String usuarioPassword);

    void create(Usuario usuario);
}
