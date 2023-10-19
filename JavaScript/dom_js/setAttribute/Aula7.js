
//setAttribute
document.getElementById("butao").addEventListener("click", function(){
    document.getElementById("titulo").setAttribute("class","cor")
})


//removeAttribute
document.getElementById("butao2").addEventListener("click", function(){
    setTimeout(function(){
        document.getElementById("titulo").removeAttribute("class","cor")
    },3000)
})




document.getElementById("butao4").addEventListener("click", function(){
    document.getElementById("div").innerHTML = "<strong>Testando</strong>"
})

//Remove a tag

document.getElementById("butao5").addEventListener("click", function(){
    document.getElementById("div").remove()
})