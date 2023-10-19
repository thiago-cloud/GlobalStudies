
//Objetos 



const carro = {
    modelo: 'ferrari',
    preco: 1000000,
    cor: 'vermelho',
    ano: 2022,
    condutores: [{
        nome: 'Thiago',
        idade: 25
    }, {
        nome: 'Irineu',
        idade: 30
    },  {
        nome: 'bartolomeu',
        idade: 50
    }],
    calcularSoma: function(a,b){
        return a+b
    }

}


const acessivel = carro.modelo//Podemos acessar os objetos apartir da notação ponto
console.log(acessivel)

const acessivel1 = carro['condutores'] //Podemos também acessar o objeto apartir desse metodo de array

console.log(acessivel1)

// O unico problemas desses dois metordos e que ele não consegue acessar dentro de uma array.
