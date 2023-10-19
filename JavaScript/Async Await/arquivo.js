//sintaxe

//Aki nesse caso utilizamos uma promise para fazer o async esperar dentro do settimeout temos uma espera por algo que aki no caso será uma requisição asycrona
/*
function funcao1(){
    return new Promise((resolve)=> {
        setTimeout(()=>{
            console.log("Esperou 2 segundos")
            resolve()
        },2000)
    })
}

async function funcao2(){
    console.log('iniciou')

   await funcao1() //para a execução desse código na ordem correta ou seja numa forma syncronização e necessario colocar o await na frente nesse caso ele vai executar 1º o iniciou
   //2º funcao1 e 3º terminou

    console.log('terminou')
}


funcao2()

*/

function getUsers(id){
    return fetch(`https://reqres.in/api/users?id=${id}`) //Requsição de uma api asincrona
        .then((data) => data.json())// O then em caso de requisições de api so funciona com o parametro data.
        .catch((erro)=> console.log(erro))
}

async function executar(id){
    try{
        const api = await getUsers(id)
        console.log(`O nome do usuario é: ${api.data.first_name}}`)

    }catch{
        console.log(`Erro: ${erro}`)
    }
    
}

executar(5)