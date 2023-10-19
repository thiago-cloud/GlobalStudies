//parametros padrão
//O parametro padrao e basciamente o tipo de parametro que serve para a pessoa substituir o parametro caso o parametro declarado na função não seja o determinado ele ira 
//mostrar o paramentro padrao

//algumas estrategias para gerar valor padrão

//estrategia 1 para gerar valor padrão

function padrao(a,b,c){
    a = a || 1
    b = b || 1
    c = c || 1

    return a+b+c
}
console.log(padrao(10))
//Nessa funcao ele mostra claramente que se o a ou o b ou o c não for declarado ele basicamente colocara valor 1 e somara.


//estrategia 2 
function soma1(a = 1, b = 1, c = 1){
    return a+b+c
}

console.log(soma1(10,20))

console.log(10/0)