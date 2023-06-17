package com.mycompany.supercadastro;

import com.mycompany.supercadastro.entidades.Aluno;
import com.mycompany.supercadastro.entidades.Professor;
import com.mycompany.supercadastro.entidades.Professor;

public class Principal {

    public static void main(String[] args) {
        
        //TESTANDO A CLASSE ALUNO COM 5 ALUNOS
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Expedito");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Paulo");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Leonardo");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Kevin");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Aristide");
        //Criar uma disciplina
        //Disciplina disciplina1 = new Disciplina();
        //preencher(disciplina1);
        //imprimir(disciplina1);
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());


        Professor professor1 = new Professor();
        professor1.setNome("Expedito");
        Professor professor2 = new Professor();
        professor2.setNome("Paulo");
        Professor professor3 = new Professor();
        professor3.setNome("Leonardo");
        Professor professor4 = new Professor();
        professor4.setNome("Kevin");
        Professor professor5 = new Professor();
        professor5.setNome("Aristide\n");
        //Criar uma disciplina
        //Disciplina disciplina1 = new Disciplina();
        //preencher(disciplina1);
        //imprimir(disciplina1);
        System.out.println(professor1.toString());
        System.out.println(professor2.toString());
        System.out.println(professor3.toString());
        System.out.println(professor4.toString());
        System.out.println(professor5.toString());
    }
    
}