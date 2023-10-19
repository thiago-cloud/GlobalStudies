


const pessoa = {nome: 'irineu'}// sabemos que o nome da constante e inalteravel pela variavel se tratar de uma constante porem o objeto não, o valor atribuido o objeto que aki no caso é irineu pode ser alterado, ao menos que se coloque Object.freeze ai o valor atriuido jamais vai se alterar.

console.log(pessoa.nome)

pessoa.nome = 'bartolomeu'

console.log(pessoa.nome)

Object.freeze(pessoa) // essa função permite que o objeto seja inalteravel

pessoa.nome = 'amanda'

//Criando  um objeto com o valor atribuido inalteravel

const pessoa1 = Object.freeze({nome: 'jurubeba'})

console.log(pessoa1.nome)

// Mesmo alterando o objeto ele permanece inalteravel por conta da função freeze.
pessoa1.nome = 'isac'

console.log(pessoa1.nome)