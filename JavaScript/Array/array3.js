//ForEach

/*Existe diversas formas de percorrer uma array temos o forEach,
map, reduce, for, for in e o filter.*/


const alunos = ['josealdo','irineu','bartolomeu','jurubeba']

alunos.forEach(function(nome,indice){
    console.log(`${indice+1} ${nome}`)
})//O forEach vai percorrer o array alunos com ajuda da função que mostrara o nome e o indice.

//Outro formato de percorrer Array com uma arrow function

alunos.forEach(nome => console.log(nome))// O problema dessa forma de percorrer arrays e que ele so pode mostrar um parametro

//Percorrendo declarando uma variavel

const exibirAlunos = alunos => console.log(alunos)
alunos.forEach(exibirAlunos)

console.log(' ')

const Animais = ['cavalo','cachorro','gato','passarinho','vaca']

//Simulando um ForEach

Array.prototype.foreach2 = function(callback){
    for(let i = 0; i< this.length; i++){
        callback(this[i],i,this)
    }
}

const Carros = ['Porche','Ferrari','Gol','Vectra','Palio']

Carros.foreach2(function(nome,indice){
    console.log(`${indice+1} ${nome}`)
})