
//Utilizando o bind no setInterval

//A função setInterval do javascript tem a função de executar determinadas instruções como funções por exemplo de acordo com intervalo de tempo definido em milisegundos como aki
//no caso o tempo é 2000milisegundos a cada 2000milisegundos ele vai executar uma instrução determinada aki no caso vai contar idade iniciando de 0 ate infinitamente.

function pessoa(){
    this.idade = 0

    const self = this
    setInterval(function(){
        self.idade++
        console.log(self.idade)
    },2000)
}

  //  new pessoa


  //Nesse exemplo utilizamos o bind para chamar o this como o this estar fora do escopo do setInterval ele não executaria ou seja ele não conseguiria acessar e chamar o number para isso utilizamos o bind para acessar e chamar
  //o this fora do escopo do setInterval.
  function number(){
    this.contador = 0
    setInterval(function(){
        this.contador++
        console.log(this.contador)
    }.bind(this),1000)
  }




  //number()

  function contar(){
    this.contando = 0
    setInterval(function(){
      this.contando++
      console.log(this.contando)
    }.bind(this),500)
}

//contar()

function numeracao(){
  this.pulo = 0
  setInterval(function(){
   this.pulo++
   console.log(this.pulo)
  }.bind(this),1000)
}

//numeracao()

function contagem(){
  this.ponto = 0
  setInterval(function(){
    this.ponto++
    console.log(this.ponto)
  }.bind(this),20)
}

//contagem()

function giga(){
  this.mega = 0
  setInterval(function(){
    this.mega++
    console.log(this.mega)
  }.bind(this),500)
}

//giga()