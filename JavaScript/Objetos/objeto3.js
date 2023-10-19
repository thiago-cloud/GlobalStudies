
//Notação literal dos objetos.

const a = 1
const b = 2
const c = 3

const obj = {a,b,c}//OU

//Notação antiga
const obj1 = {a: a, b: b, c: c}//a recebe a e assim por diante

console.log(obj, obj1)


//Notação literal 2

const nomeAtri = 'nota'
const valorAtri = 7
const obj3 = {}

obj3[nomeAtri] = valorAtri
console.log(obj3)

//Notação literal 3

const nome = 'Nome'
const nomePessoa = 'Irineu'

const obj4 = {[nome]: nomePessoa}

console.log(obj4)

//Notação literal 4
//Incluindo funções  dentro de objetos

const obj5 = {
    //Notação antiga
    funcao1: function(){

    },
    //Notação nova depois do ECM6 2015
    funcao2(){

    }
}

console.log(obj5)

