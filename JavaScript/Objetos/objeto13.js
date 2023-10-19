//Object.preventExtesions

//esse tipo de função do objeto vai permitir que o objeto não adicione mais atributos voce pode ate excluir atributos mais não pode adcionar novos atributos

const produto = Object.preventExtensions({
    nome: 'Qulaque', preco: 1.99, tag: 'promoção'
})


console.log('Extensivel: ',Object.isExtensible(produto))//Object.isExtensible(objeto) permite mostra se o objeto é extensivel ou não true para sim e false para não.

produto.nome = 'borracha'
produto.descricao = 'Esse produto é um dos melhores do mercado'
delete produto.tag
console.log(produto)

//Object.seal
//O object.seal faz com que o objeto seja selado ou seja apartir dessa função não se pode adicionar atributos e nem excluir atributos do objeto so modificar o atributo.

const pessoa = {
    nome:'irineu', idade: 80
}

Object.seal(pessoa)

pessoa.sobrenome = 'silva'
pessoa.nome = 'lucas'
delete pessoa.nome

console.log(pessoa)

console.log('selador: ',Object.isSealed(pessoa))//Object.isSealed mostrara se o objeto pessoa estar selado ou não. true para sim e false para não

