#! /bin/bash



n=1 

#while [ $n -le 10 ]
#do
#   echo "$n"
#     (( n++ ))
#    sleep 1

#done


while [ $n -le 3 ]
do
    echo "$n"
    n=$(( n+1 ))
    sleep 1 # o Sleep tem a função de dar um intervalo de 1 segundo
    gnome-terminal & #Abrira o terminal a cada loop ele abrira o terminal uma vez
done