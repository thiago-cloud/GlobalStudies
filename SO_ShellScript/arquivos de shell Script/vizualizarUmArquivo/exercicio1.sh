#! /bin/bash



echo -e "Informe seu nome: \c"
read nome
echo -e "Infomre sua primeira nota: \c"
read nota1
echo -e "Infomer sua segunada nota: \c"
read nota2
echo -e "Infome sua terceira nota: \c"
read nota3
echo -e "Informe sua quarta nota: \c"
read nota4

media=$(( (nota1 + nota2 + nota3 + nota4)/4 ))

if [ $media == 10 ]
then
    echo "Parabéns $nome você tirou $media a nota maxima"

elif [ $media  == 8 ]
then
    echo "teste $media"

elif [ $media == 1 ]
then
    echo "teste 2"

else
    echo "teste 3"
fi


