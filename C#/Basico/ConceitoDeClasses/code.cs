public class InimigoIA : Comportamento{
    float vida;
    int velocidade;
    string InimigoNome;
    armaInimigo arma;

    void Movement(){};

    void morte(){};

    void attack(){
        arma.dano = 30;
        arma.taxaFogo = 0.4f;
        arma.atirar();
}

}

public class armaInimigo{

//Para deixar a variavel acessivel a outra classe acessar colocamos o public
    public float dano;
    public float taxaFogo;
    public void float atirar(){

    };



}