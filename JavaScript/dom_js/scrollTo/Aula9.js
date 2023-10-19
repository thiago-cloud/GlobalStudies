document.getElementById("butao").addEventListener("click", function(){
    topo()

})
//ScrollTo é uma função muito utilizada para rolar o scroll na tela
function topo(){
    window.scrollTo({
        top:0,
        left:0,
        behavior:"smooth"// O behavior significa comportamento smooth significa suave que quer dizer comporatamento de rolagem da tela de forma suave
    })
}
