console.log(typeof Array)
console.log(typeof new Array)
console.log(typeof [])

const aprovados = new Array('Irineu', 'girino', 'beta')
console.log(aprovados)


const partidos = ['pl','pt','psdb']

console.log(partidos[2])

let Animais = ['cachorro','gato','passarinho','cavalo']
console.log(Animais)

Animais.push('Leão')//Adiciona mais um elemento no final de uma array
console.log(Animais)

Animais[0]= 'Tigre' //Adiciona mais um elemento no array de acordo como a posição definida

console.log(Animais)

console.log(Animais.length)//Mostrara o tamanho do array animais ou seja a quantidade de indices ou tambem chamado de posições.

console.log(Animais[10] === undefined)// Aki foi criado um elemento na posição 10 mais não foi definido nenhum valor nesse elemento em seguidade feita a comparação com undefinid que mostrara true
//ou seja e verdadeiro que o valor estar indefinido do elemento.

console.log(Animais.sort())//coloca os elementos do array em ordem


delete Animais[0]//deleta um elemento do array

console.log(Animais)

//Função splice exclui e adiciona elementos

Animais.splice(1,3)//Apartir do indice 1 exclua 3 elementos do array
console.log(Animais)

const carro = ['vectra','palio','gol','uno','ferrari','poeche']

carro.splice(2,1,'Elemento1','elemento2')//Apartir do indice 2 exclua um elemento e adicione dois elementos

console.log(carro )