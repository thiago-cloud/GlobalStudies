//Factory

function criarPessoa(){
    return {
        nome: 'ryan',
        sobrenome: 'irineu'
    }

}

console.log(criarPessoa())


function Produto(){
    return {
        produto: 'Placa de video',
        modelo: 'RX 580',
        preco: '1000'
    }
}

console.log(Produto())

function jogos(nome,preco){
    return {
        nome,
        preco,
        desconto: 0.1

    }
}

console.log(jogos())

