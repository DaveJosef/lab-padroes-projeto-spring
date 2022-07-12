package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Compra;
import one.digitalinnovation.gof.model.CompraRepository;
import one.digitalinnovation.gof.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Iterable<Compra> buscarTodas() {
        return compraRepository.findAll();
    }

    @Override
    public Compra buscarPorId(Long id) {
        Optional<Compra> compra = compraRepository.findById(id);
        return compra.get();
    }

    @Override
    public void inserir(Compra compra) {
        compraRepository.save(compra);
    }

    @Override
    public void atualizar(Long id, Compra compra) {
        Optional<Compra> compraBd = compraRepository.findById(id);
        if (compraBd.isPresent()) {
            compraRepository.save(compra);
        }
    }

    @Override
    public void deletar(Long id) {
        compraRepository.deleteById(id);
    }
}
