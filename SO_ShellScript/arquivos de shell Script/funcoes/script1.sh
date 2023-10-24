#! /bin/bash


#O shell script também tem recursos para funções apesar de ser limitada  e ser uma linguagem imperativa


listar(){
    ls
}
function ola(){
    echo "Hello World"
}
function var(){
   echo $1 $2 $3
} #O a variavel so funcionara dentro do escopo da função se for numero







var irineu jurubeba virginio
ola
listar




