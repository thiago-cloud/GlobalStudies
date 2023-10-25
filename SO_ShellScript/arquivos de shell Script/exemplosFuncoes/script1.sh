#! /bin/bash

uso(){
    echo "Você precisa fornecer um argumento"
    echo "uso: $0 file_name"
}

o_arquivo_existe(){
    local file=$1
    if [ -f $file ] 
    then 
        return 1
    else
        return 0
    fi
}


if [ $# -eq 0 ]
then 
    uso
fi


if [ o_arquivo_exite == $1 ]
then
    echo "Arquivo encontrado"
else
    echo "Arquivo não encontrado"
fi

