/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

/**
 *
 * @author Samuel
 */
public class FuncionarioDAO {
    
    List<Funcionario> funcionarioLista = new ArrayList<Funcionario>();

    public void salvarFuncionario(Funcionario funcionario) {
        funcionarioLista.add(funcionario);
    }

    public List<Funcionario> listarFuncionario() {
        return funcionarioLista;

    }

    public void excluirFuncioanrio(Funcionario aluno) {
        funcionarioLista.remove(aluno);
    }
    
}
