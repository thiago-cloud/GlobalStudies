//classe vs função factory


//Classe 
class Pessoa{
    constructor(nome){
        this.nome = nome //Pessoa.nome recebe nome
    }

    falar(){
        console.log(`Meu nome é ${this.nome}`)
    }
}


const p1 = new Pessoa('jurubeba')

p1.falar()

//Factory

const criarPessoa = function(nome){
    return {
        falar: function(){console.log(`Meu nome é ${nome}`)}
    }
}

const p2 = new criarPessoa('João')
p2.falar()