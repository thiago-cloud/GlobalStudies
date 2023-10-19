class pessoa{
    constructor(nome,idade,sobrenome){
        this.nome = nome,
        this.idade = idade,
        this.sobrenome = sobrenome
    }
        imprimir(){
           return console.log(`Meu nome é ${this.nome} ${this.sobrenome} tenho ${this.idade}`)
        }
     
}

const obj = new pessoa('Thiago',25,'Alves')

obj.imprimir()



