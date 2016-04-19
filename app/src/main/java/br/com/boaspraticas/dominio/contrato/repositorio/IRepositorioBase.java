package br.com.boaspraticas.dominio.contrato.repositorio;

import java.util.List;

public interface IRepositorioBase<T> {

    List<T> get();
    T getById(int id);
    void create(T object);
    void update(T object);

}
