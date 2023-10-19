//A diferença de factory e constructor

//Factory

function planeta(floresta,ilhas,agua){
    return {
        floresta,
        ilhas,
        agua,
        dentrodagua (){
            console.log("Animais Marinhos")
        }
    }
}
planeta('araras','caribinhas','salgada')

//Constructor

function planeta1(florestas,neve,aguas,animais){
    this.florestas = florestas,
    this.neve = neve,
    this.aguas = aguas,
    this.animais = animais
    this.dentrodagua1 = function(){
        console.log("Animais Marinhos")
    }
}
const imprimir = new planeta('araras','biri','doce')

imprimir.dentrodagua()

const imprimir2 = new planeta1('orobos','artico','salgada','planetarios')// A palavra new significa que estamos criando um novo objeto e apartir desse objeto estamos colocando propriedades aos parametros da função.

console.log(imprimir2)
