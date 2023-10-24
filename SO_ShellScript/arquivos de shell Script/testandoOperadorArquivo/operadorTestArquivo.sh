#! /bin/bash

echo -e "Digite o nome do arquivo: \c" #o barra \c serve para manter o cursor na mesma linha do comando para funcionar utilizamos -e
read nome_arquivo


if [ -s $nome_arquivo ]
then 
    echo "$nome_arquivo Arquivo não Vazio"
else
    echo "$nome_arquivo Arquivo vazio"
fi