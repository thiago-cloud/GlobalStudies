const objs = [
    {
    "nome": "Irineu",
    "idade": 30,
    "esta_trabalhando": true,
    "detalhes_profissão": {
        "profissao": "Programador",
        "empresa": "Google"
    },
    "array": ["Objeto1", "Objeto2", "Objeto3"]   
    },
    {
        nome: 'Jurubeba',
        idade: 50,
        empresa: 'atacado',
        esta_trabalhando: false,
        detalhe_profissao: {
            profissao: null,
            empresa: null,
        },
        hobbies: ['jogar','academia'],
    },
]
//Converter objeto para json
console.log(objs)

const jsonData = JSON.stringify(objs)

console.log(jsonData)
console.log(typeof jsonData)

//Converter json para objeto

const objData = JSON.parsen(jsonData)

console.log(objData)
console.log(typeof objData)

objData.map((pessoa) => {
console.log(pessoa.nome)
})

