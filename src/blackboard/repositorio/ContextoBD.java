/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard.repositorio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jake Freitas
 */
public class ContextoBD { // Come se fosse um BD
    public List<String> nomes;
    
    public ContextoBD() {
        this.nomes = new ArrayList<>();
    }
    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
   
      
}
