const quaseArray = {0: 'beta',1: 'gato',2:'cavalo'}
const ArrayVdd = ['beta','gato','cavalo']
Object.defineProperty(quaseArray,'propriedade',{
    value: function(){return Object.values(this)},
    enumerable: false
})


console.log(quaseArray.propriedade(),ArrayVdd)