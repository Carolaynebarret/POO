
package com.mycompany.prova1;

public class avaliacaoenomes {
    public static void main(String[] args) {
        
        Filme teste = new Filme(1,"A era do gelo","aventura","Uma aventura no gelo ");
        Filme teste1 = new Filme(2,"pato pato ganço","comedia para familia","com a ´pena quebrada o ganço perde a temporada migratoria...");
        Filme teste2 = new Filme(3,"a caminho da lua ","aventura"," Fei fei decide viajar para lua...");
        
        Filme[] filmes = {teste,teste1,teste2};

        Avaliacaoenome t = new Avaliacaoenome(1,"Carolayne",2,"razoavel");
        Avaliacaoenome t1 = new Avaliacaoenome(1,"Laura",3,"gostei");
        Avaliacaoenome t2 = new Avaliacaoenome(1,"Vagner",2,"Não gostei!");
        Avaliacaoenome a = new Avaliacaoenome(2,"Lucca",4,"Muito bom");
        Avaliacaoenome a1 = new Avaliacaoenome(2,"Calleb",5,"Otimo");
        Avaliacaoenome a2 = new Avaliacaoenome(2,"Caio",3,"gostei");
        Avaliacaoenome aa = new Avaliacaoenome(3,"cleide",2,"achei massa!");
        Avaliacaoenome aa1 = new Avaliacaoenome(3,"Valentina",1,"gostei");
        Avaliacaoenome aa2 = new Avaliacaoenome(3,"BARRETO",1,"não gostei?");
        
        Avaliacaoenome[] opinioes={t,t1,t2,a,a1,a2,aa,aa1,aa2}; 
       
        Videoteca videoteca = new Videoteca(filmes);
        Opinioes opiniao = new Opinioes(opinioes);
        videoteca.mostrarTudo();
        opiniao.mostrarTudo01();
        
        
        
    }
}
        
	
