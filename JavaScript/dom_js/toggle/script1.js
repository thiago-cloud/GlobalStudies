var msgTela = document.getElementById('msg') 
var btnTela = document.getElementById('btn')
var btnTela2 = document.getElementById('btn2')

btnTela.addEventListener("click", function() {
    msgTela.classList.add('teste')
})

btnTela2.addEventListener("click", function() {
    msgTela.classList.remove('teste')
})
