//Json vs Objeto

/*Json e um tipo de formato textual simples e leve que é usado para comunicação ele pode ser interpretado por diversos linguagens alem disso o json e apenas um formato 
de dados ou seja ela não executa funções.*/

const obj1 = {
    a: 1,
    b: 2,
    c: 5,
    soma(){
        return a*b*c
    }
}

console.log(JSON.stringify(obj1))//A função stringify transforma um objeto no json alem disso, Observa se o seguinte aki o json so vai executar os dados do objeto obj1 no caso da função soma ele não vai executar por não se tratar de um dado.

console.log(JSON.parse('{"a":1,"b":2,"c":5}'))//transforma o json num objeto

//regras do formato json todas as strings no json tem que ser delimitado com aspas duplas

console.log(JSON.parse('{"a":1,"b":"veei","c": {},"D":[]}'))

//para validar um um formato em json e so procura no google por json validate