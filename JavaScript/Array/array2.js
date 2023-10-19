//Simulando uma array com um objeto

//O metodo toString serve para simular a impressão de um objeto no console como se fosse uma array

const quaseArray = {0:'Thiago', 1:'Jose', 2: 'Irineu'}
console.log(quaseArray)

Object.defineProperty(quaseArray,'toString',{
    value:function(){ return Object.values(this)},
    enumerable: false
})//O toString e basicamente uma propriedade que foi adicionada no objeto quaseArray essa propriedade tem como valor não um atributo mais uma função que retorna os valores do objeto quaseArray


console.log(quaseArray[0])

const MeuArray = ['gerino','jurubeba','piaba']

console.log(MeuArray,quaseArray.toString())