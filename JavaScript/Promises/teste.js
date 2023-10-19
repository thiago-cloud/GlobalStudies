const userName = 'Thiago'

fetch(`https://api.github.com/users/${userName}`,{
    method: 'GET',
    headers: {
        Accept: 'application/vnd.github.v3+json',
    },
}).then((retornar)=>{
    return retornar.json(),
    console.log(retornar)
}).then((data)=>{
    console.log(`Seu usuario é: ${data.name}`)
}).catch((err)=>{
    console.log(`Ops Houve um erro ${err}`)
})