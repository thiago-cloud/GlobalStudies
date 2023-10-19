//Métodos getter e setter

//Setter são funções especiais que serve para alterar valores dos atributos dos objetos.
//Getter são funções especiais que serve para obter o valor de um atributo

class Pessoa {
    constructor(nome,peso,idade,altura){
        this.nome = nome,
        this.idade = idade,
        this.peso = peso,
        this.altura = altura
    } 
        get falar(){
            return console.log(`Meu nome é ${this.nome} minha idade é ${this.idade} meu peso é ${this.peso} minha altura é ${this.altura}`)
        }

        set alterar(novoNome){
            this.nome = novoNome
            
        }
    }
const obj = new Pessoa("irineu", 25, 80,1.90)


//console.log(obj.falar())

obj.alterar = 'juvenal'

console.log(obj.falar())