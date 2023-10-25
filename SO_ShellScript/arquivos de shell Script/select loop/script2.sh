#! /bin/bash
#

select opcao in irineu jurubeba girino
do
    case $opcao in 
    irineu )
        echo "Você selecionou $opcao ";;
    jurubeba )
        echo "Você selecionou $opcao ";;
    girino )
        echo "Você selecionou $opcao";;
    * )
        echo "Erro"
    esac
    echo " "
    echo "Selecione \"ctrl+c\" "
done
