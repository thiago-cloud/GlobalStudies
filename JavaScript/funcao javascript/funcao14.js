//Tipos de declarações
// Revisando os tipos de funções


//function declaretion
// no caso da function declaretion ela tem uma deferença na hora de ser executada a diferença
//é que console.log da function declaretion pode estar em qualquer lugar da ide que sera executada function.

function soma(x,y){
    return x+y
}
console.log(soma(5,6))

//function expression

const sub = function sub(a,b){
    return a-b
}
console.log(sub(50,20))

//named function expression
//esse tipo de função raramente e utilizado geralmente pode ser benefico na hora de debugar código por conta que pode mostrar o nome da function.


const mult = function mult(c,d){
    return c*d
}
console.log(mult(20,5))