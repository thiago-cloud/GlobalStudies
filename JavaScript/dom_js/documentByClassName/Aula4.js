

// Pegando a div pela classe e sobreeescrevendo o html, [2] significa o indice da div
setTimeout( function (){
    document.getElementsByClassName('divclass')[2].innerHTML = "<strong>sobreescrevendo as div pela classe</strong>"
    document.getElementsByClassName('divclass')[0].innerText = "Alterando o indice 0"
},4000)