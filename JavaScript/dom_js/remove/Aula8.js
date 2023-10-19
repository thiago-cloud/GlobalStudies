//var container = document.querySelector("#caixa")
//container.remove()




document.getElementById("butao").addEventListener("click", function(){
    document.querySelector("#caixa").remove()
    document.getElementById("caixa2").remove()
    
})


document.getElementById("butao1").addEventListener("click", function(){
    document.getElementById("caixa2").innerHTML = "<strong>ADD</strong>"
    
})

