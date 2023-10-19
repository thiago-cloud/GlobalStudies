const pessoajson = {"nome": "Irineu",
"sobrenome": "roberval",
"idade": 50,
"esta_trabalhando": true,
"endereco":{
    "Rua":"um",
    "numero":62,
    "cidade":"jaboatao dos guararapes",
    "estado":"pernambuco"
    }
}

const pessoaObj = {nome: "thiago",
idade: 50,
sobrenome: "alves",
esta_trabalhando: false,
endereco: {
    rua: "jose de anchieta",
    numero: 65,
    cidade: "jaboatao dos guararapes",
    estado: "pernambuco"
    }
} 

const pessoa = JSON.stringify(pessoajson)

//console.log(pessoajson)

const pessoa1 = JSON.parse(pessoaObj)

console.log(pessoa1)

pessoa1.map((perco) => {
    console.log(perco.nome)
})

