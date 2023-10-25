#! /bin/bash

#Essa e outra forma de abrir o arquivo


while IFS= read -r abrir
do
    echo "$abrir"
done < /home/thiago/aula2.txt #path caminho do arquivo