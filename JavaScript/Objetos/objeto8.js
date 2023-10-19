//Herança 2
//Cadeias de protótipos (prototype chain)

const avo = {atri1: 'a'}// Esse objeto tem como referencia prototipo Object.prototype
const pai = { __proto__: avo, atri2: 'b'}// Esse objeto tem como referencia o prototipo avo
const filho = { __proto__: pai, atri3: 'c'}//Esse objeto tem como referencia o prototipo pai 

console.log(filho.atri1)


//Colocando um atributo no objeto pai de todos os objetos

Object.prototype.atri0 = 'e'
console.log(filho.atri0)

//Criando dois objetos e estabelecendo uma relação de objeto pai e objeto filho

const media = {
    nota1: 10,
    nota2: 5,
    nota3: 10,
    calculo(media1){
       return media1 = (this.nota1+this.nota2+this.nota3)/3

    },
    resultado(){
        return this.calculo()
    }
}

const aluno = {
    nome: 'pedro',
    idade: '15',
    resultadoFinal(){
        return `O aluno ${this.nome} de ${this.idade} anos teve uma media ${super.resultado()}`
    }
}

Object.setPrototypeOf(aluno, media)//Essa função restabelece uma relação entre os objetos ou seja o objeto media e prototipo de aluno ou também chamado de pai
console.log(aluno.resultadoFinal())

