#! /bin/bash


for comando in ls pwd date #O for permitira a execução desses comandos
do
    echo "-------------------------$comando---------------------------"
    $comando
done