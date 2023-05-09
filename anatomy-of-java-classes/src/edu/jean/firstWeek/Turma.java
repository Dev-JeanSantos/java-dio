package edu.jean.firstWeek;

import java.util.Random;

public class Turma {
    public static void main(String[] args) {
        
        Random r = new Random();

        int total_alunos = r.nextInt(90, 120);
        int count = 3;
        
        int turmaA = total_alunos / count;
        int turmaB = (total_alunos - turmaA) / 2;
        int turmaC = (total_alunos - turmaA - turmaB);

        System.out.println("Total de Alunos: "+ total_alunos);
        System.out.println("Total de Alunos Turma A: "+turmaA);
        System.out.println("Total de Alunos Turma B: "+turmaB);
        System.out.println("Total de Alunos Turma C: "+turmaC);

        
    }
}
