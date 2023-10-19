function Aula(nome,videoId){
    this.nome = nome,
    this.videoId = videoId
}

const obj1 = new Aula('codebr',111)
const obj2 = new Aula('minecraft',555)

console.log(obj1,obj2)


//Simulando a função new de objetos

function novo(f, ...params){
    const obj = {}
    obj.__proto__ = f.prototype
    f.apply(obj,params)
    return obj
}


const aula3 = novo(Aula, 'Bem vindo',123)
const aula4 = novo(Aula, 'Até Breve', 456)
console.log(aula3,aula4)