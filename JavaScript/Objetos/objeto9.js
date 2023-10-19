//Object.create

const pai = {nome: 'irineu', corDoCabelo: 'verde'}

const filho1 = Object.create(pai)// A função object create permite também dar o objeto filho1 o prototipo pai ou seja ele estabelece uma relação de objeto pai e filho.
filho1.nome = "joao"
console.log(filho1.corDoCabelo)

const filho2 = Object.create(pai,{
    nome: {value: 'juvenal', writable: false, enumerable:true}//definição da propriedade o valor e juvenal writable false ou seja não aceita ter o valor reescrito enumerable true aceita ser listado se no caso for listar com object keys.

})

console.log(filho2.nome)

filho2.nome = "bernardo"

console.log(filho2.nome)// ele não irar alterar o valor do nome juvenal para bernardo porconta que definirmos a propriedade nome como writable

console.log(`Meu nome é ${filho2.nome} a cor do meu cabelo é ${filho2.corDoCabelo}`)


console.log(Object.keys(filho1))
console.log(Object.keys(filho2))


//A função hasOwnProperty(key) de um determinado objeto permite saber se as propriedades de um determinado objeto é por herança ou não
for(let key in filho1){
    filho1.hasOwnProperty(key)?
    console.log(key) : console.log(`Por Herança: ${key}`)
}


