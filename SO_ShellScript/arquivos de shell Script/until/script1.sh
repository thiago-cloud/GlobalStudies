#! /bin/bash

n=1
#repita o loop ate n ser maior que 10
until (( $n > 10 ))# until traduzindo é "ate" ele tem a mesma função do while
do
    echo $n
    n=$(( n+1 ))
done


