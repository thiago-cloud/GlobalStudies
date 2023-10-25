#! /bin/bash


for item in * #Selecionara todos os diretorios dentro do diretorio for
do
    if [ -d $item ] # O -d permite selecionar os diretorios dentro do diretorio for e jogar na variavel item
    then
    echo $item
    fi
done