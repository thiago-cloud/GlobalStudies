//Apesar dos querySelector serem mais versateis o elements são mais mais rapidos comparado ao queryselector

//O querySelectorAll permite que vc não funciona se colocar # ou . na frente para identificar alem de ser necerario incluir vetores[] ele so funciona colocando a tag ex: querySelectorAll('titulo')[0]

//querySelectorAll
document.querySelectorAll('div')[0].innerHTML = "<strong>Alterando div 1!</strong>"
document.querySelector('.classqualquer2').innerHTML = "<strong>Alterando!</strong>"

setTimeout( function (){
    document.querySelector('#idqualquer1').innerHTML = "<strong>Testando</strong>"
    document.querySelectorAll('p')[1].innerHTML = "<strong>Jumper</strong>"
}, 3000)


