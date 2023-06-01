

package jogo;


/*
*  Professor Gerson Risso
*/
import pattern.*;
public class Jogo { 
    public static void main(String[] args) {
      NaveJogador naveJ=new NaveJogador();
      NaveInimiga naveInimiga1=new NaveInimiga("Inimigo1", naveJ);
      naveJ.adAcoes(Acoes.RECUAR);
      NaveInimiga naveInimiga2=new NaveInimiga("Inimigo2", naveJ);
      naveJ.adAcoes(Acoes.AVANCAR);
      naveJ.adAcoes(Acoes.VIRAR_ESQ);
    }

}
