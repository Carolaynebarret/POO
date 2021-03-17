
package com.mycompany.prova1;

import java.util.Scanner;

public class Videoteca {
     private Filme[] filmes;
     
    Videoteca(Filme[] filmes)
    {
        this.filmes= filmes;
    }
    
     public Filme[] getFilmes()
    {
        return this.filmes;
    }
    public void setFilme(Filme[] filmes)
    {
        this.filmes=filmes;
    }
   
    public int pesquisarFilme(String palavra)
    {
        int nom;
        int ption;
        palavra=palavra.toLowerCase();
         for (Filme filme : filmes) {
             nom = filme.getNome().indexOf(palavra);
             ption = filme.getSinopse().indexOf(palavra);
             if (nom!=-1) {
                 System.out.printf("Encontrou o filme [%s] , procura por nome retornou: %d\n", filme.getNome(), nom);
                 return nom;
             }
             if (ption!=-1) {
                 System.out.printf("Encontrou o filme [%s] , procura por sinopse retornou: %d\n", filme.getNome(), ption);
                 return ption;
             }
         }
        return -1;
    }
    public void mostrarFilme(String s)
    {
        
        System.out.printf("Caso deseje mostrar todos os filmes digite todos%n Caso deseje procurar por genero digite o tipo:%n");
        Scanner input = new Scanner(System.in);
        String op=input.nextLine();
        if ("todos".equals(op))
        {
            for(int i=0;i<getFilmes().length;i++)
            {
                System.out.printf("%s\n",this.filmes[i].getNome());
            }
        }
        else
        {
            System.out.printf("Todos os filmes encontrados:%n");
            for (Filme filme : getFilmes()) {
                if (op.toLowerCase() == null ? filme.getGeneroe() == null : op.toLowerCase().equals(filme.getGeneroe())) {
                    System.out.printf("[%s]%n", filme.getNome());
                }
            }
        }
    }
    public void mostrarTudo()
    {
         for (Filme filme : getFilmes()) {
             System.out.printf(" Codigo do filme: %d%n Nome do filme: %s%n Genero: %s%n Sinopse: %s%n%n", filme.getCodigo(), filme.getNome(), filme.getGenero(), filme.getSinopse());
         }
       
    }
}

