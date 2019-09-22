/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.simples.java;

import facade.Facade;
import java.util.List;
import java.util.Scanner;
import model.Aluno;
import model.Funcionario;

/**
 *
 * @author Samuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String op = "";

        Aluno a = null;
        Funcionario f = null;
        Facade facade = new Facade();

        while (!op.equals("0")) {
            System.out.println("----MENU TEXTO----");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - EXCLUIR ALUNO");
            System.out.println("3 - LISTAR ALUNO");
            System.out.println("4 - EDITAR ALUNO");
            System.out.println("5 - CADASTRAR FUNCIONARIO");
            System.out.println("6 - LISTAR FUNCIONARIO");
            System.out.println("7 - EXCLUIR FUNCIONARIO");
            System.out.println("8 - EDITAR FUNCIONARIO");
            System.out.println("0 - SAIR");
            op = input.nextLine();

            switch (op) {
                case "1":
                    a = new Aluno();
                    System.out.println("----CADASTRAR ALUNO----");
                    System.out.println("Nome: ");
                    a.setNome(input.nextLine());
                    System.out.println("Matricula: ");
                    a.setMatricula(input.nextLine());

                    facade.salvarAlu(a);

                    System.out.println("ALUNO CADASTRADO COM SUCESSO!");
                    break;
                case "2":
                    System.out.println("----EXCLUIR ALUNO----");
                    System.out.println("Informe a matricula do Aluno: ");
                    String matriculaA = input.nextLine();
                    List<Aluno> alunoListas = facade.listarAlu();

                    for (int i = 0; i < alunoListas.size(); i++) {
                        alunoListas.set(i, a);

                        if (a.getMatricula().equals(matriculaA)) {
                            facade.excluirAlu(a);
                            System.out.println("ALUNO EXCLUIDO!");
                        } else {
                            System.out.println("MATRICULA DO ALUNO INCORRETA!");
                        }

                    }
                    break;
                case "3":
                    System.out.println("----LISTAGEM DE ALUNOS----");
                    List<Aluno> alunoLista = facade.listarAlu();
                    if (alunoLista != null) {
                        alunoLista.forEach((aluno) -> {
                            System.out.println(aluno);
                        });
                    } else {
                        System.out.println("LISTA VAZIA...");
                        break;
                    }
                    break;
                case "4":
                    System.out.println("----EDITAR ALUNO----");
                    System.out.println("Informe a matricula do Aluno: ");
                    String matriculaAluEditar = input.nextLine();

                    List<Aluno> alunoListasEdit = facade.listarAlu();

                    for (int i = 0; i < alunoListasEdit.size(); i++) {

                        if (a.getMatricula().equals(matriculaAluEditar)) {
                            String nome, matricula;

                            System.out.println("Informe o novo nome do aluno");
                            nome = input.nextLine();
                            a.setNome(nome);
                            System.out.println("Informe o nova matriculado aluno");
                            matricula = input.nextLine();
                            a.setMatricula(matricula);

                            System.out.println("ALUNO EDITADO COM SUCESSSO");
                            break;
                        } else {
                            System.out.println("MATRICULA INCORRETA!");
                            break;
                        }
                    }
                    break;
                case "5":
                    f = new Funcionario();
                    System.out.println("----CADASTRAR FUNCIONARIO----");
                    System.out.println("Nome do Funcaionario: ");
                    f.setNome(input.nextLine());
                    System.out.println("Matricula do Funcionario: ");
                    f.setMatricula(input.nextLine());

                    facade.salvarFun(f);

                    System.out.println("FUNCIONARIO CADASTRADO COM SUCESSO!");
                    break;
                case "6":
                    System.out.println("----LISTAGEM DE FUNCIONARIO----");
                    List<Funcionario> funcionarioLista = facade.listarFun();
                    funcionarioLista.forEach((funcionario) -> {
                        System.out.println(funcionario);
                    });
                    break;
                case "7":
                    System.out.println("----EXCLUIR FUNCIONARIO----");
                    System.out.println("Informe a matricula do Aluno: ");
                    String matriculaF = input.nextLine();
                    List<Funcionario> funcionarioListas = facade.listarFun();

                    for (int i = 0; i < funcionarioListas.size(); i++) {
                        funcionarioListas.set(i, f);

                        if (f.getMatricula().equals(matriculaF)) {
                            facade.excluirFun(f);
                            System.out.println("FUNCIONARIO EXCLUIDO");
                        } else {
                            System.out.println("MATRICULA INCORRETA");
                        }
                    }
                    break;
                case "8":
                    System.out.println("----EDITAR FUNCIONARIO----");
                    System.out.println("Informe a matricula do Funcioanrio: ");
                    String matriculaFunEditar = input.nextLine();

                    List<Funcionario> funcionarioListasEdit = facade.listarFun();

                    for (int i = 0; i < funcionarioListasEdit.size(); i++) {

                        if (f.getMatricula().equals(matriculaFunEditar)) {
                            String nome, matricula;

                            System.out.println("Informe o novo nome do funcionario");
                            nome = input.nextLine();
                            f.setNome(nome);
                            System.out.println("Informe o nova matriculado funcioanario");
                            matricula = input.nextLine();
                            f.setMatricula(matricula);

                            System.out.println("FUNCIONARIO EDITADO COM SUCESSSO");
                            break;
                        } else {
                            System.out.println("MATRICULA DO FUNCIONARIO É INCORRETA");
                            break;
                        }
                    }
                    break;
                case "0":
                    System.out.println("SAINDO...");
                    break;

            }

        }

    }

}
