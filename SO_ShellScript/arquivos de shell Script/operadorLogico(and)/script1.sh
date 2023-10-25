#! /bin/bash



echo -e "Digite sua idade: \c"
read idade


if [[ $idade -gt 18 && $idade -lt 25 ]]
then
    echo "Idade adequada"
else
    echo "Idade não adequada"
fi

