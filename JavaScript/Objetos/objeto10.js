//Apartir do momento que se cria dois objetos diferentes instanciados por uma função ele será automaticamente iguais por isso true.

function meuObjeto(){}

console.log(meuObjeto.prototype)

const obj1 = new meuObjeto
const obj2 = new meuObjeto

console.log(obj1.__proto__ === obj2.__proto__)//true iguais.


console.log(meuObjeto.prototype === obj1.__proto__)//Automaticamente ele revela true ou seja obj1 aponta para a função meuObjeto,prototype

meuObjeto.prototype.nome = 'Junior'
meuObjeto.prototype.falar = function(){
    console.log(`Meu nome é ${this.nome}`)
}

meuObjeto.prototype.falar()



const obj3 = {}
obj3.nome = 'jurema'
obj3.__proto__ = meuObjeto.prototype//aki definimos que o prototype não sera o Object.prototype e sim o meuObjeto.prototype
obj3.falar()

