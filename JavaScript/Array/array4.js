//map
//Uma situação a se observar no map e que o map não modifica o array atual e sim gera um novo array
let carros = ['ferrari','vectra','camaro','mustang','porche']

let percorrer = carros.map(function(p){
    return p
})

//console.log(percorrer)

//exemplo gerando um novo array

let num = [2,5,9,10,3]

let percorrendo = num.map(function(p1){
    return p1* 5
})

//console.log(percorrendo,num)//percorrendo é um novo array gerado pelo map enquanto o num era um array que ja tinha.

//Executando o map de forma encadiada


const nums = [10,5,15,20,2]

let resultado = nums.map(function(e){
    return e*2
})

const soma10 = e => e+10
const mult5 = e => e*5
const valores = e => `valor: ${e}`


//Aki ele vai substituir a função function pelas arrow function
resultado = nums.map(soma10).map(mult5).map(valores)

console.log(resultado)