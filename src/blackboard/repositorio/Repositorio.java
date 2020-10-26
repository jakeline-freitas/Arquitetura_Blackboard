/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard.repositorio;

import java.util.List;

/**
 *
 * @author Jake Freitas
 */
public class Repositorio {
    private ContextoBD _contex;
    public Repositorio() {
        this._contex = new ContextoBD();
    }
    public void salvarNovoNome(String nome){
        _contex.nomes.add(nome);
    }
    public void remover(String nome){
        _contex.nomes.remove(nome);
    }
    public List<String> listar(){
        return _contex.getNomes();
    }
}
