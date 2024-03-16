package com.teste.controlefinanceiro.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.controlefinanceiro.model.Credito;
import com.teste.controlefinanceiro.respository.CreditoRepository;

@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    /**
     * Metodo para retornar creditos
     * 
     * @return Lista de creditos
     */
    public List<Credito> obterTodos() {
        return creditoRepository.obterTodos();
    }

    /**
     * Metodo que retorna a credito encontrado pelo seu Id.
     * 
     * @param id do credito que será localizado.
     * @return Retorna uma credito caso tenha sido localizado.
     */
    public Optional<Credito> obterPorid(Integer id) {
        return creditoRepository.obterPorid(id);
    }

    /**
     * Metodo #1 para adicionar credito
     * 
     * @param credito a que será adicionado
     * @return retorna o credito que foi adicionado.
     */
    public Credito adicionar(Credito credito) {
        return creditoRepository.adicionar(credito);
    }

    /**
     * Metodo para deletar o credito por id.
     * 
     * @param id credito a ser deletado
     */
    public void deletar(Integer id) {
        creditoRepository.deletar(id);
    }

    /**
     * Metodo para atualizar o credito na lista
     * 
     * @param credito que será atulizado
     * @return retorna o credito após atualizar a lista
     */
    public Credito atualizar(Integer id, Credito credito) {

        credito.setId(id);
        return creditoRepository.atualizar(credito);

    }
}
