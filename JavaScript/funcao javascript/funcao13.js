//Função Construtora
/*
function Pessoa(nome,idade){
    this.nome = nome,
    this.idade = idade || 1,
    this.falar = function(palavra){
        console.log(this.nome+" diz: "+palavra+" Tenho "+this.idade+" Anos")
    }
    this.envelhecer = function(anos){
        this.idade += anos || 1
        console.log(this)
    }
}

const obj1 = new Pessoa("Irineu",28)
const obj2 = new Pessoa("luan", 20)

obj1.falar("Bom DIA")
obj1.envelhecer(10)
*/

function Pessoa(nome,idade){
    this.nome = nome
    this.sobrenome = this.sobrenome
    this.idade = idade
    this.falar = function(algo){
        console.log("Meu nome é "+this.nome+" tenho "+idade+" anos de idade "+algo)
    }
    this.envelhecer = function(veio){
        this.idade += veio || 1
        console.log(this)
    }
    
}

const obj1 = new Pessoa("Irineu","Silva",25)

obj1.falar("Muito obrigado é ate a proxima")
obj1.envelhecer(5)
console.log(obj1)