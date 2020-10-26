/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard;

import blackboard.repositorio.Repositorio;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jake Freitas
 */
public class Blackboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Repositorio r = new Repositorio();
        
        String op ="0";
        do{
            op = JOptionPane.showInputDialog(menu());
            switch(op){
                case "1":
                    if(r.listar().size() != 0){
                        JOptionPane.showMessageDialog(null, r.listar());
                    }else{
                        JOptionPane.showMessageDialog(null,"Nenhum nome cadastrado");
                    }
                    break;
                case "2":
                    String nome = JOptionPane.showInputDialog("Digite o nome que será adicionado: ");
                    r.salvarNovoNome(nome);
                    break;
                case "3":
                    String nomeR = JOptionPane.showInputDialog("Digite o nome para ser removido: ");
                    r.remover(nomeR);
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null,"Até Logo!");
                    System.exit(0);
            }
        }while(op != "0");
    }
    public static String menu(){
        String menu = " 1 - Listar todos\n " +
                      " 2 - Adicionar novo nome\n " +
                      " 3 - Remover nome existente\n "+
                      " 0 - Sair";
        return menu;
    }
    
}
