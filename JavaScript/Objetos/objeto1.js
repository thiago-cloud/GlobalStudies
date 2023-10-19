//Estrategias de criação de objetos.

//Notação literal

const obj1 = {}
console.log(obj1)

//Notação apartir de uma função

const obj2 = new Object
console.log(obj2)

//Quando se pensa em encapsulamento pensa em tentar diminuir o maximo possivel a visibilidade de uma determinada variavel.

//classes com Funções Construtoras

class Produto {
    constructor(nome, preco, desc) {
        this.nome = nome
        this.getPrecoComDesc = () => {
            return preco * (1 - desc)
        }
    }
}

const p1 = new Produto('notebook',2000, 0.25)

console.log(p1.getPrecoComDesc())

const p2 = new Produto('Pc',5000,0.20)
console.log(p2.getPrecoComDesc())

//Factory

function CriarFuncionario(nome,salarioBase,faltas){
    return{
        nome,
        salarioBase,
        faltas,
        getSalario(){
            return (salarioBase / 30) * (30-faltas)
        }
    }
}

const sal = CriarFuncionario('thiago',3000,5)
console.log(sal.getSalario())


//Object.create

const filho = Object.create(null)
filho.nome = 'Irineu'

console.log(filho)

//Uma função que retorna um objeto
//ou seja ela pega o json e retorna um objeto

const jsonParaObjeto = JSON.parse('{"nome":"Era um Json"}')

console.log(jsonParaObjeto.nome)

