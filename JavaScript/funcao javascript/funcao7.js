//Arrow function

//Arrow function e a forma de escrever uma função de forma mais reduzida.

//Método tradicional de descrever uma função
/*let mult = function(a){
    return 2*a
}

console.log(mult())
*/
//Arrow function
//Aki basicamente colocamos o parametro primeiro depois vem o function no formato =>.


/*mult = (b) => {return 2*b}

console.log(mult(50))

*/

//forma mais reduzida ainda sem o escopo e sem o return

/*mult = (a) => 2 * a

console.log(mult(20))
*/

// Esse formato e bem reduzido a diferença é que o parametro aki não pode ser declarado ele simplesmente existe como _ anderlaine porem não pode receber valor. 

mult = _ => 'ola'

console.log(mult())



