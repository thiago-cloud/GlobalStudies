//Criação de promessas

const myPromises = new Promise((resolve,reject) => {
    const nome = 'Thiago'

    if(nome === 'Thiago'){
    resolve('Usuario Thiago encontrado!')
    }else{
        reject('Usuario Thiago não encontrado')
    }
})

myPromises.then((data) => {
    console.log(data)
})

//Encademanetos de then 

const myPromises2 = new Promise((resolve,reject)=> {
    const nome = 'Jurubeba'

    if(nome === 'Jurubeba'){
        resolve(`Usuario ${nome} encontrado!`)
    }else{
        reject('Usuario não encontrado!')
    }
})

myPromises2.then((coisa)=>{
    return coisa.toLowerCase()//Aki ele pega a string e transoforma para minusculo
}).then((stringMinuscula)=>{
    console.log(stringMinuscula)//Aki ele vaiimprimir a string
})

const myPromises3 = new Promise((resolve,reject)=> {
    const media = 5
    if(media >= 7){
        resolve(`Sua media foi ${media} Aprovado`)
    }else{
        reject(`Sua média foi ${media} Reprovado`)
    }
})


myPromises3.then((nota)=>{
    return nota
}).then((notaAlter)=> {
    console.log(notaAlter)
}).catch((Reprovado)=>{
    console.log(Reprovado)// O catch vai ser concatenado com o reject ou também ele serve para imprimir o reject
})

const login = new Promise((resolve,reject) =>{
    const nome = 'JUMPER'

    if(nome === 'Irineu'){
        resolve(`Usuario ${nome} encontrado!`)
    }else{
        reject(`Usuario ${nome} não encontrado!`)
    }
})


login.then((ok) =>{
    console.log(ok)
}).catch((erro) => {
    console.log(`Aconteceu um erro: ${erro}`)
})

//Resolvendo varias Promises com o metodo all

const p1 = new Promise((resolve,reject)=>{
    resolve('p1 OK!')
})

const p2 = new Promise((resolve,reject)=>{
    resolve('p2 OK!')
})

const p3 = new Promise((resolve,reject)=>{
    resolve('p3 OK!')
})

const resolveAll = Promise.all([p1,p2,p3]).then((allp)=>{
    console.log(allp)//Método all executando todas as promises
})

//O método all prega que todas promesas devem ser executado para ele então ser executado.

//Executando uma promise com a função setTimeout

const temporal = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve('Execução após 2 segundos')
    },2000)
})

temporal.then((data)=>{
    console.log(data)
})

//Resolvendo varias promesas com o método race

//O Método race so vai executar quem ganhar a corrida no caso aki o r2 o r1 perdeu porque so será executado apos 3 segundos ja o r3 so é executado apos o r2 então quem ganhou  foi r2 no caso o  vai ser mostrado no console.

const R1 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve('Execução após 3 segundos')
    },3000)
})
const R2 = new Promise((resolve,reject)=>{
    resolve('R2 OK!')
})
const R3 = new Promise((resolve,reject)=>{
    resolve('R3 OK!')
})

const resolvendoRace = Promise.race([R1,R2,R3]).then((resolvendo)=>{
    console.log(resolvendo)
})

//Fetch Request na api do github

const userName = 'Thiago'

// O fetch ele também é um tipo de promise ele retorna uma promessa. No caso aqui ele ta requisitando uma api do git hub atravês do metodo get com o headers
fetch(`https://api.github.com/users/${userName}`,{
    
    method: 'GET',
    headers: {
        Accept: 'application/vnd.github.v3+json', //Ele diz na documentação do git hub que o header tem que ser esse.
    },
}).then((retorne)=> {
    return retorne.json(),
    console.log(retorne)

}).then((opa)=>{
    console.log(`O nome do usuario é ${opa.name}`)
}).catch((erro)=> {
    console.log(`Erro usuario não encontrado: ${erro.name}`)
})

