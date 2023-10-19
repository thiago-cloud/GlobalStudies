//Função callback



const fabricantes = ["mercedez","Audi","BMW"]

function imprimir(nome,indice){
    console.log(`${indice + 1}. ${nome}`) // O um faz com que o indice comece apartir de um
}

fabricantes.forEach(imprimir)


const animais = ["cavalo","Leão","Gato"]

function imprimir2(nome,indice){
    console.log(`${indice + 1}. ${nome}`)
}

animais.forEach(imprimir2)

console.log(" ")

const motos = ["cb300","yamaha","bros"]

function imprimir3(nome,indice){
    console.log(`${indice +1}. ${nome}`)
}

motos.forEach(imprimir3)


const cores = ["black","green","blue","pink"]

function imprimir4(indice,nome){
    console.log(`${indice}. ${nome}`)
}

cores.forEach(imprimir4)

console.log(" ")


const comidas = ["macarrão","cachorro-quente","chocolate"]

function imprimir5(indice,nome){
    console.log(`${indice + 1}. ${nome}`)
}

comidas.forEach(imprimir5)
