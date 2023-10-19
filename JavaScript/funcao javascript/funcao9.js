//A função anonima é uma função que não tem nome geralmente pode estar dentro de um parametro ou dentro de um objeto ou variavel utilizando como argumento.

//Soma
const soma = function(a,b){
    return a+b
}

const imprimirResultado = function(x,y,calculo = soma){
    return console.log(calculo(x,y))
}

imprimirResultado(5,7,soma)

//SUBTRACAO
const subtracao = function(d,e){
    return d-e
}


const imprimirResultado2 = function(f,g,operacao = subtracao){
    return console.log(operacao(f,g))
}

imprimirResultado2(9,10,subtracao)

//Multiplicacao

const mult = (h,i) => h*i

const imprimirResultado3 = function(j,l,calculo1 = mult){
    return console.log(calculo1(j,l))

}

imprimirResultado3(20,5)

//Divisao

const divisao = (m,n) => m/n

const imprimirResultado4 = function(o,p,calculo2 = divisao){
    return console.log(calculo2(o,p))
}

imprimirResultado4(20,2)