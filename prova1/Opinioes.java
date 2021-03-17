
package com.mycompany.prova1;

public class Opinioes {
     private Avaliacaoenome[] feed;
     
    Opinioes(Avaliacaoenome[] feed)
    {
        this.feed=feed;
    }
    
      public Avaliacaoenome[] getFeed()
    {
        return this.feed;
    }
    public void setFeedback(Avaliacaoenome[] opiniao)
    {
        this.feed=opiniao;
    }
    
    public double mediaAvaliacao(int cod)
    {
        double media=0;
        int soma=0;
        for (Avaliacaoenome feed1 : getFeed()) {
             if (feed1.getCodigo() == cod) {
                 media = media + feed1.getNota();
                 soma++;
             }
         }
        if (soma==0)
        {
            System.out.printf("Nenhum filme encontrado com esse identificador");
            return 0;
        }
        return media/soma;
    }
    public int melhorAvaliacao(int codigo)
    {
        int melhor=-1;
         for (Avaliacaoenome feed1 : getFeed()) {
             if (codigo == feed1.getCodigo()) {
                 int nota = feed1.getNota();
                 if (nota==5)
                 {
                     return nota;
                 }
                 else if (melhor<nota)
                 {
                     melhor=nota;
                 }
             }
         }
        if (melhor==-1)
        {
            System.out.printf("Nenhum filme encontrado");
            return melhor;
        }
        return melhor;
    }
    public int piorAvaliacao(int codigo)
    {
        int pior=6;
         for (Avaliacaoenome feed1 : getFeed()) {
             if (codigo == feed1.getCodigo()) {
                 int nota = feed1.getNota();
                 if (nota==0)
                 {
                     return nota;
                 }
                 else if (nota<pior)
                 {
                     pior=nota;
                 }
             }
         }
        if (pior==6)
        {
            System.out.printf("Nenhum filme encontrado");
            return pior;
        }
        return pior;
    }
    public void mostrarTudo01()
    {
         for (Avaliacaoenome feed1 : getFeed()) {
             System.out.printf("Codigo do filme: %d%n Usuário: %s%n Nota do filme: %d%n "
                     + "Comentário: %s%n%n", feed1.getCodigo(), feed1.getNome(), feed1.getNota(), feed1.getComentario());
         }
    }
}
