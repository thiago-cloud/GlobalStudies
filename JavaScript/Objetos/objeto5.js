//Funções importantes que pode ajudar a identificar informações a respeito de um objeto

const Pessoa = {
    nome: 'joao',
    idade: 50,
    peso: 90
}

console.log(Object.keys(Pessoa))//Mostrara as palavras chaves no console
console.log(Object.values(Pessoa))//Mostrara os valores do Objeto
console.log(Object.entries(Pessoa))//Mostrara uma array com as chaves e os valores

//Essa função percorre um objeto
Object.entries(Pessoa).forEach(([chave,valor])=> {
    console.log(`${chave}: ${valor}`)
}) 


//Essa função permite adicionar propriedades ao objeto
Object.defineProperty(Pessoa , 'dataDeNascimento', {
    enumerable: true,//Essa propriedade pode ser listada true
    writable: false, //Ela aceita ser modificada false
    value: '01/01/2022'
})

Pessoa.dataDeNascimento = '01/01/1990'
console.log(Pessoa.dataDeNascimento)
console.log(Object.keys(Pessoa))

//Essa função Permite Concatenar diversos objetos. Essa função foi adicionada no ECMA SCRIPT 2015
//Object.assign
const dest = { a: 1}
const obj = {b:2}
const obj2 = {c:3, d:4}

Object.assign(dest, obj, obj2) //Todos os objetos após o primeiro paramentro vai ser concatenado com o primeitp parametro
console.log(dest)