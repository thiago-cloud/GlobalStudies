//this pode variar


//this é Bind
//O bind serve para basicamente apontar para uma função independente do local que essa função esteja

const pessoa = {
    falando: 'bom dia',
    //Aki o javascript ja entende como uma função falar() dentro do objeto graças ao ecmascript2015
    falar(){
        console.log(this.falando)
    },
    //Notação antiga
    falar2: function(){

    },
    
}

//pessoa.falar()

//podemos também atribuir o atributo de um objeto a uma variavel o unico problema e que não e possivel executar no console a const falar3 para isso que existe o bind.

const falar3 = pessoa.falar 


//A função bind do javascript tem função de chamar o objeto pessoa aki nesse caso agora observe ele so invocara o atributo de dentro do objeto que seja uma função.

const falar4 = pessoa.falar.bind(pessoa)

falar4()



