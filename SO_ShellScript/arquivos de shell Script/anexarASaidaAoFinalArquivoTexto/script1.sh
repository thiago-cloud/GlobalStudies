#! /bin/bash


echo -e "Digite o nome de um arquivo: \c"
read nome_arquivo



if [ -f $nome_arquivo ]
then
    if [ -w $nome_arquivo ]
    then
        echo "Digite algo dentro do arquivo: 'press ctrl+d para sair'"
        cat >> $nome_arquivo #Redireciona o conteudo para dentro do arquivo
    else
        echo "Você não permissão para gravar neste arquivo"
    fi
else
    echo "Arquivo não existi"
fi

