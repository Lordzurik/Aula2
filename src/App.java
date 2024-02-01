class Bola {
    private String cor;

    //gera uma copia publica de "cor"
    public Bola(String cor){
        this.cor = cor; //O this serve para falar qual o tipo de cor se é int float e etc..
    }
    //Permite a troca de cor no Main
    public String getCor() {//serve para pegar a copia publica de cor
        return cor;
    }

    public void setCor(String cor) {//serve para mostrar ao usuario a copia publica de cor no main
        this.cor = cor;
    }
    
    public static void main(String[] args){
        //teste da classe bola
        Bola minhaBola = new Bola("vermelho");
        System.out.println("Cor da bola: " + minhaBola.getCor());

        minhaBola.setCor("azul");
        System.out.println("nova cor da bola: " + minhaBola.getCor());
    }
}