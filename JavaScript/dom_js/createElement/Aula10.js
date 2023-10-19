var elemento = document.createElement('li');
var addTexto = document.createTextNode('Item');

elemento.appendChild(addTexto);

var lista = document.getElementByTagName('ul')[0];
lista.appendChild(elemento);


