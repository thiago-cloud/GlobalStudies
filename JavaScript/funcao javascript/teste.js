function exibir(num){
    console.log("O valor é igual a: "+num)

}




function soma(a,b,callback){
    var op = a+b
    callback(op)
}


soma(3,5,exibir)

function multiplicacao(c,d,cb){
    var calculo = c * d
    cb(calculo)
}


multiplicacao(9,8,exibir)


function divisao(e,f){
    var calculo1 = e/f
    console.log("O valor da divisão é igual: ",calculo1)
}


divisao(10,2)

function exp(g,h,cb1){
    var calculo2 = g**h
    cb1(calculo2)
}

exp(10,2,exibir)