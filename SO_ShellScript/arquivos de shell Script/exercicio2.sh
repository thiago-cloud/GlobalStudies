#! /bin/bash


n=1

while [ $n -le 3 ]
do
    echo "$n"
    n=$(( n+1 ))# incrementa mais 1 a cada loop
    sleep 2 # a cada 2 segundo acontece o processo de execução
    firefox # executara o firefox 3 vezes
done

