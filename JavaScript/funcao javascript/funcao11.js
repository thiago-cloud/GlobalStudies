const notas = [10,8,9,5,3]

//Com a função callback filter
const notasBaixas = notas.filter(function(nota){return nota<7})

console.log(notasBaixas)

//Sem a função callback

const notasBaixas2 = []
for (let i in notas){
    if(notas[i] < 7){
        notasBaixas2.push(notas[i])
    }
}

console.log(notasBaixas2)


const notasAltas = []
for (e in notas){
    if(notas[e] > 7){
        notasAltas.push(notas[e])
    }
}
console.log(notasAltas)


const notasAltas1 = notas.filter(function(nota){return nota>7})

console.log(notasAltas)


const animais = ["golfinho","cachorro","leão","tigre"]

for (let a in animais){
    console.log(animais[a])
}

const notas1 = [10,5,9,8,7,6,3]

const notasBaixas3 = []
for(c in notas1){
    if(notas1[c] < 7){
        notasBaixas3.push(notas1[c])
    }
}

console.log(notasBaixas3)