/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author Samuel
 */
public class AlunoDAO {
    
    List<Aluno> alunoLista = new ArrayList<Aluno>();

    public void salvarAluno(Aluno aluno) {
        alunoLista.add(aluno);
    }

    public List<Aluno> listarAluno() {
        return alunoLista;

    }

    public void excluirAluno(Aluno aluno) {
        alunoLista.remove(aluno);
    }
    
}
