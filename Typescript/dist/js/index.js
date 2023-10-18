"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
const x = 10;
console.log(x);
console.log("tipo do x: " + typeof x);
const y = 20;
console.log(y);
console.log("tipo do y: " + typeof y);
const z = "Irineu junior da silva";
console.log(z);
console.log("tipo do z: " + typeof z);
const numeros = [1, 2, 3, 4, 5, 6];
numeros.push(7);
console.log(numeros);
console.log(numeros.length);
let minhaTupla;
minhaTupla = ["a", 20, ["a", "b", "c"]];
const user = {
    nome: "irineu",
    age: 60
};
console.log(user);
console.log(user.nome);
let a = 0;
a = "pode ser uma string";
a = 20;
a = true;
a = [];
console.log(a);
let id;
id = "20";
id = 500;
console.log(id);
let condicao;
condicao = "sim";
condicao = true;
console.log(condicao);
const userId = 1;
const produtoId = "10";
console.log(produtoId);
var size;
(function (size) {
    size["G"] = "Grande";
    size["M"] = "Medio";
    size["P"] = "Pequeno";
})(size || (size = {}));
const camisa = {
    tipo: "Blusa",
    cor: "Preto",
    tamanho: size.G
};
console.log(camisa);
let usuario;
usuario = "autenticado";
usuario = null;
console.log(usuario);
function sum(a, b) {
    return a + b;
}
console.log(sum(20, 6));
function pessoa(nome) {
    return `seu nome é ${nome}`;
}
pessoa("xijimping");
function checar(nome1, nome2) {
    if (nome1) {
        console.log(`Nome1: ${nome1}`);
    }
    else {
        console.log(`Nome2: ${nome2}`);
    }
}
checar("jirino");
checar("", "alberon");
function soma(param) {
    return param.n1 + param.n2;
}
console.log(soma({ n1: 2, n2: 5 }));
function facaAlgo(info) {
    if (typeof info === "number") {
        console.log("Numero inserido com sucesso!");
        return;
    }
    else {
        console.log("Vc precisa inserir um numero");
    }
}
facaAlgo(5);
facaAlgo(true);
function array(arr) {
    arr.forEach((item) => {
        console.log(item);
    });
}
const a1 = [1, 2, 3, 4, 6];
const a2 = ["irineu", "jurubeba", "jirina"];
array(a1);
array(a2);
class usuario1 {
    nome;
    funcao;
    aprovado;
    idade;
    constructor(nome, funcao, aprovado, idade) {
        this.nome = nome;
        this.funcao = funcao;
        this.aprovado = aprovado;
        this.idade = idade;
    }
    mostrarName() {
        console.log(`O nome do usuario é ${this.nome}`);
    }
    mostrarIdade(mostrarInfo) {
        if (mostrarInfo === true) {
            console.log(`O ${this.nome} tem ${this.idade} anos de idade`);
        }
        else {
            console.log("Informação restrita");
        }
    }
}
const pessoa1 = new usuario1("jugnal", "pedreiro", true, 50);
console.log(pessoa1);
console.log(pessoa1.mostrarName());
console.log();
console.log(pessoa1.mostrarIdade(true));
class carro {
    modelo;
    fabricante;
    ano;
    cor;
    constructor(modelo, fabricante, ano, cor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cor = cor;
    }
    mostrarInfo() {
        return `O modelo do carro é ${this.modelo} o fabricante do carro ${this.fabricante} o ano do carro é ${this.ano} é a cor do carro é ${this.cor}`;
    }
}
const carro1 = new carro("hb20", "Hyundai", 2020, "preto");
console.log(carro1.mostrarInfo());
class carroEsportivo extends carro {
    cavalosPotencia;
    constructor(cavalosPotencia, modelo, fabricante, ano, cor) {
        super(modelo, fabricante, ano, cor);
        this.cavalosPotencia = cavalosPotencia;
    }
    mostrarPotencia() {
        return `O veiculo ${this.modelo} tem uma potencia de ${this.cavalosPotencia}`;
    }
}
const carroEsportivo1 = new carroEsportivo("2.0", "Audi", "Volkwagem", 2020, "branco");
console.log(carroEsportivo1);
console.log(carroEsportivo1.mostrarPotencia());
function gerador() {
    return function (constructor) {
        return class extends constructor {
            id = Math.random();
            cratedAt = new Date();
        };
    };
}
let individuo = class individuo {
    nome;
    constructor(nome) {
        this.nome = nome;
    }
};
individuo = __decorate([
    gerador(),
    __metadata("design:paramtypes", [String])
], individuo);
const p1 = new individuo("Jumper");
console.log(p1);
const testando = document.getElementById('teste');
const button = document.getElementById('btn');
button.addEventListener("click", () => {
    testando.classList.add('red');
});
function mostrarName() {
    throw new Error("Function not implemented.");
}
