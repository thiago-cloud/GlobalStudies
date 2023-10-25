#! /bin/bash



echo "Digite uma Opção de aluguel: "
echo " 1 - Carro"
echo " 2 - Van"
echo " 3 - Caminhão"
echo " 4 - Onibus"
echo " 5 - Moto"
echo " 6 - Bicicleta"
echo "  "

read valor



case $valor in 
    [1] )
        echo "Você selecionou a opção carro custa R$ 30,00/h";;
    [2] )
        echo "Você selecionou a opção Van custa R$ 40,00/h";;
    [3] )
        echo "Você selecionou a opção caminhão custa R$ 50,00/h";;
    [4] )
        echo "Você selecionou a opção onibus custa R$ 60,00/h";;
    [5] )
        echo "Você selecionou a opção moto custa R$ 55,00/h";;
    [6] )
        echo "Você selecionou a opção bicicleta R$ 3,00/h";;
    * )
        echo "Ops opção não identificada!";;
esac