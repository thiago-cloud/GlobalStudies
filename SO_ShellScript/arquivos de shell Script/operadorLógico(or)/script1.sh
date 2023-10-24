#! /bin/bash

echo -e "Informe a sua idade: \c"
read idade


if [[ $idade -eq 18 || $idade -eq 30 ]]
then 
    echo "você tem a idade de $idade anos adequada! "
else
    echo "Você não tem a idade adequada!"
fi

