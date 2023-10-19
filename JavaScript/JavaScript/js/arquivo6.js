var Lista = document.getElementsByTagName("ul")
console.log(Lista)

var novoItem = document.createElement("li")
novoItem.textContent = "Abacaxi"
console.log(novoItem)

var ItensDaLista = Lista.children
Lista.insertBefore(novoItem, ItensDaLista[0])
console.log(ItensDaLista)




