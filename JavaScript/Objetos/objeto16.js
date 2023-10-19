class Avo {
    constructor(nome,sobrenome){
        this.nome = nome
        this.sobrenome = sobrenome
        this.idade = idade

    }
}

class pai extends Avo {
    constructor(nome = 'cabrito',sobrenome){
        this.nome = nome
        super(sobrenome)
    }
}

class filho extends pai {
    constructor(sobrenome,nome = 'Jurubeba'){
        this.nome = nome
        super(sobrenome)
       
    }
}

const obj = new Avo('Girino','Correia')
//console.log(obj)
const obj1 = new pai
console.log(obj1)