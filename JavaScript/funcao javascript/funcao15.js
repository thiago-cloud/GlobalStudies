//contexto lexico

//const valor = "veei"

function imprimirValor(){
    const valor = "amigo"
    return console.log(valor)
}

function exec(){
    const valor = "boa"//essa variavel não sera executada isso dar ao fato da exec chamar outra função dentro por conta disso ela vai chamar a função definida e  imprimir o valor que estar incluido na função imprimiValor
    imprimirValor()
}

exec()

