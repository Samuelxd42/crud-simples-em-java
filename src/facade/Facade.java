/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.AlunoDAO;
import dao.FuncionarioDAO;
import java.util.List;
import model.Aluno;
import model.Funcionario;

/**
 *
 * @author Samuel
 */
public class Facade {
    
    AlunoDAO facadeAlu = new AlunoDAO();
    FuncionarioDAO facadeFun = new FuncionarioDAO();

    public void salvarAlu(Aluno alu) {
        facadeAlu.salvarAluno(alu);
    }

    public List<Aluno> listarAlu() {
        return facadeAlu.listarAluno();
    }

    public void excluirAlu(Aluno aluno) {
        facadeAlu.excluirAluno(aluno);
    }

    public void salvarFun(Funcionario fun) {
        facadeFun.salvarFuncionario(fun);
    }

    public List<Funcionario> listarFun() {
        return facadeFun.listarFuncionario();
    }

    public void excluirFun(Funcionario fun) {
        facadeFun.excluirFuncioanrio(fun);
    }
    
}
