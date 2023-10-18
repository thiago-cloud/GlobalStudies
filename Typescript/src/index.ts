//Tipagem de variaveis
/*As variaveis do js funciona no arquivo ts porem o ts permite adicionar tipagem nas variaveis deixando o programa padronizado e melhor contra bugs no futuro*/

//javascript
const x = 10

console.log(x)
console.log("tipo do x: "+typeof x)

//typescript
const y:number = 20


console.log(y)
console.log("tipo do y: "+typeof y)

const z:string = "Irineu junior da silva"
console.log(z)
console.log("tipo do z: "+typeof z)


//Definição do tipo de array no ts


const numeros: number[] = [1,2,3,4,5,6]
numeros.push(7)

console.log(numeros)
console.log(numeros.length)

//Tuplas
//As tuplas também existe no python e um tipo de array que não se pode modificar seus dados,
//No ts as tuplas são um pouco diferente ao criar uma tupla no ts a função dela e determinar exatamente quais os tipos de dados que ela pode conter como string number e etc...

let minhaTupla: [string,number,string[]]

minhaTupla = ["a",20,["a","b","c"]]

//Objeto Literal -> {prop:value}

const user: {nome: string; age:number } = {
    nome: "irineu",
    age: 60
}

//user.job = "programador"

console.log(user)
console.log(user.nome)



//variavel do tipo any
//any e uma tipagem que diz que a variavel pode ser qualquer coisa por conta disso e uma má prática ja que o typescripy com any perde sua utilidade de tipagem

let a: any = 0

a = "pode ser uma string"
a = 20
a = true
a = []

console.log(a)


//union type 
//Union type significa que a variavel declarada pode assumir dois tipos diferentes

let id: string | number

id = "20"
id = 500

console.log(id)

let condicao: string | boolean

condicao = "sim"
condicao = true

console.log(condicao)


//type alias
//type alias e uma forma de criar tipo e declarar um nome ao tipo criado ai no lugar de atribuir diretamente o tipo a variavel atribuimos o nome que aponta para o tipo declarado

type meuIdType = number | string

const userId:meuIdType = 1;
const produtoId:meuIdType = "10";

console.log(produtoId)

//enum
//O enum e como se fosse uma interface e uma classe de algo com determinados tipos que podem ser atribuido a um objeto ex:

enum size {
    G = "Grande",
    M = "Medio",
    P = "Pequeno"
}

const camisa = {
    tipo: "Blusa",
    cor: "Preto",
    tamanho: size.G
}

console.log(camisa)

//Literal types
let usuario: "autenticado" | null;

usuario = "autenticado"
usuario = null

console.log(usuario)

//----------------------------------------------------------------------------//---------------------------------------------------------------------------------------------------------//

//Funções

function sum(a:number,b:number){
    return a+b
}

console.log(sum(20,6))

function pessoa(nome:string):string{
    return `seu nome é ${nome}`
}


pessoa("xijimping")


//Quando colocamos interrogação no typescript estamos dizendo que o paramentro é opcional
function checar(nome1:string, nome2?:string){
    if(nome1){
        console.log(`Nome1: ${nome1}`)
    }else{
        console.log(`Nome2: ${nome2}`)
    }
}

checar("jirino")
checar("","alberon")//nome1 com String vazia ele imprimira o nome2


//Interfaces


interface calculo {
    n1:number,
    n2:number

}

function soma(param:calculo){
    return param.n1 + param.n2
}

console.log(soma({n1:2,n2:5}))

//narrowing
//checagem de tipos

function facaAlgo(info: number | boolean){
    if(typeof info === "number"){
        console.log("Numero inserido com sucesso!")
        return
    }else{
        console.log("Vc precisa inserir um numero")
    }
}

facaAlgo(5)
facaAlgo(true)

//Generics
//<T> -> Signfica que função recebe qualquer tipo de array

function array<T>(arr:T[]){
    arr.forEach((item)=>{
        console.log(item)
    })
}

const a1 = [1,2,3,4,6]
const a2 = ["irineu","jurubeba","jirina"]

array(a1)
array(a2)



//classes

class usuario1 {
    nome;
    funcao;
    aprovado;
    idade;

    constructor(nome:string,funcao:string,aprovado:boolean,idade:number){
        this.nome = nome;
        this.funcao = funcao;
        this.aprovado = aprovado;
        this.idade = idade;

    }

mostrarName(){
    console.log(`O nome do usuario é ${this.nome}`)
}

mostrarIdade(mostrarInfo:boolean){
    if(mostrarInfo === true){
        console.log(`O ${this.nome} tem ${this.idade} anos de idade`)
    }else{
        console.log("Informação restrita")
    }
}

}

const pessoa1 = new usuario1("jugnal","pedreiro",true,50)
console.log(pessoa1)
console.log(pessoa1.mostrarName())
console.log()

console.log(pessoa1.mostrarIdade(true))

//interfaces em classes

interface veiculo{
    modelo:string;
    fabricante:string;
}

class carro implements veiculo{
    modelo;
    fabricante;
    ano;
    cor;
    constructor(modelo:string,fabricante:string,ano:number,cor:string){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cor = cor;
    }
    mostrarInfo(){
        return `O modelo do carro é ${this.modelo} o fabricante do carro ${this.fabricante} o ano do carro é ${this.ano} é a cor do carro é ${this.cor}`    
    }

}

const carro1 = new carro("hb20","Hyundai",2020,"preto")

console.log(carro1.mostrarInfo())

//Herança

class carroEsportivo extends carro{
    cavalosPotencia:string;

    constructor(cavalosPotencia:string,modelo:string,fabricante:string,ano:number,cor:string){
        super(modelo,fabricante,ano,cor)
        this.cavalosPotencia = cavalosPotencia
    }

    mostrarPotencia(){
        return `O veiculo ${this.modelo} tem uma potencia de ${this.cavalosPotencia}`
    }
}

const carroEsportivo1 = new carroEsportivo("2.0","Audi","Volkwagem",2020,"branco")
console.log(carroEsportivo1)
console.log(carroEsportivo1.mostrarPotencia())


//Decorator 
/*Antes de se utilizar decorator e necessario habilitalo no arquivo tsconfig:
   "experimentalDecorators": true, 
   "emitDecoratorMetadata": true, */ 
     
//O decorator serve para gerar propriedades automaticamente, geralmente é muito utilizado para gerar o id e a data de publicação
function gerador(){
    return function <T extends {new (...args:any[]): {} }>(constructor: T ){
        return class extends constructor{
            id = Math.random();
            cratedAt = new Date();
        }//a sintaxe do decorator e estranha e complexa
    }
}

@gerador()//Chamando a função decorator
class individuo {
    nome;

    constructor(nome:string){
        this.nome = nome;
    }

}
const p1 = new individuo("Jumper")

console.log(p1)





//Pequeno teste usando dom e tipagem do typeScript
const testando:any = document.getElementById('teste')
const button:any = document.getElementById('btn')

button.addEventListener("click",()=>{
    testando.classList.add('red')
})
function mostrarName() {
    throw new Error("Function not implemented.")
}






