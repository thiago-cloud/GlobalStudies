//Call Apply

//Existe diferentes formas de chamar uma função voce pode chamar uma função no escopo global, ou apartir de um objeto é também tem mais duas formas de se chamar uma função que
//função chamada a call e outra forma de chamar função e apartir da função apply.

//Uma função em javascript e dada como um tipo e com isso o tipo pode conter diversas funções dentro dele.

//A diferença do call e o aplly e forma de como será passado os parametros.


// Call
const imprimir = function(){
    console.log(`Meu nome é ${this.nome} tenho ${this.idade}`)
}

const Pessoa = {
    nome: "Girino",
    idade: "28"
}

console.log(imprimir.call(Pessoa))



//Apply 

const imprimir2 = function(cidade, pais){
    console.log(`Meu nome é ${this.nome} tenho ${this.idade} anos moro na cidade de ${cidade} no país de ${pais}`)
}

const informar = {
    nome: "pirueta",
    idade: "30"
}

console.log(imprimir2.apply(informar,['recife','Brasil'])) // a diferença do apply e do call e so na hora de declarar o parametro os parametros declarado ficaram dentro de uma array enquanto o do call não.


