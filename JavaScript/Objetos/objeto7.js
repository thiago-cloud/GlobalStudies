//Herança 1 
const ferrari = {
    modelo: 'f400',
    velMax: 250
}

const gol = {
    modelo: 'g5',
    velMax: 150
}

console.log(ferrari.__proto__)// Essa função __proto__ vai buscar o objeto pai
console.log(gol.__proto__ === Object.prototype)//Essa função __proto__ === Object.prototype vai verificar se o objeto gol tem um objeto pai se não tiver vai retornar true ou seja gol e um objeto pai por não ter nenhum objeto antes dele.
console.log(ferrari.__proto__ === Object.prototype)
// A ideia de prototype no javascript e que todo objeto pode ter um prototipo como referencia ou seja uma classe pai
console.log(Object.prototype.__proto__)//Mostra se tem alguma classe que vem antes de todos os obejeto ou seja a superclasse no caso aki não tem ai mostrara null no console.