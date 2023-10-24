#! /bin/bash


os=('Windows','Linux','Mac')

android[3]='android' #adiciona um valor no indice 3
unset os[2] #Remove o valor do indice 2

echo "${os[@]}" # Mostra todos os indices
echo "${os[1]}" # Mostra o valor do indice 1 
echo "${!os[@]}" # Mostra os indices que existe dentro do array
echo "${#os[@]}" #Mostra a quantidade de valores dentro do array


string=asdasdasd

echo "${string[@]}" #Mostra todos o valor da variavel
echo "${string[0]}" #Mostra a variavel
echo "${string[1]}" #Não mostra nada
echo "${#string[@]}" #Mostra a quantidade de valores dentro do array ou seja o tamanho da variavel