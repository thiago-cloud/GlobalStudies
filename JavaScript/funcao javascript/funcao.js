
//funçao de forma literal

function fun1(){

}
fun1()


//Função armazenada dentro de uma variavel
const fun2 = function(a,b){
    return a+b }

   // console.log(fun2())

//Função armazenada dentro de uma array 

const array = [function(a,b){return a+b}, fun1, fun2]

console.log(array[0](5,9))

//Armazenar em um atributo de objeto

const obj = {}
obj.falar = function(){return 'veeei'}

console.log(obj.falar())


//Passar função como parametro

function run(fun){
    fun()
}

run(function(){console.log("executar...")})

//Uma função que retorna outra função

function soma(a,b){
    return function(c){
        console.log(a+b+c)
    }
}
soma(5,6)(2)
