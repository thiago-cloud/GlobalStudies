//funcao this dentro do arrow function
/*
function Pessoa(){
    this.idade = 0
    setInterval(() => {
        this.idade++
        console.log(this.idade)
    },1000)

}

//Pessoa()

function contador(){
    this.contar= 0
    setInterval(() => {
        this.contar++
        console.log(this.contar)
    },2000)
}

//contador()

function number(){
    this.contagem = 0
    setInterval(() => {
        this.contagem++
        console.log(this.contagem)
    },3000)
}
//number()

*/
let contador = 0
while(contador<=10){
    contador++
    console.log(contador)
}


