package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Compra;

public interface CompraService {

    Iterable<Compra> buscarTodas();

    Compra buscarPorId(Long id);

    void inserir(Compra cliente);

    void atualizar(Long id, Compra cliente);

    void deletar(Long id);
}
