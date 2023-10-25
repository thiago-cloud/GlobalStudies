#! /bin/bash


n=1 #variavel



while [ $n -le 10 ]
do
    echo "$n" #imprimi a variavel
    n=$(( n+1 )) #incremente +1 a variavel n enquanto menor ou igual a 10
done