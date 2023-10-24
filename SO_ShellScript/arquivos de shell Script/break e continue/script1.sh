#! /bin/bash



for (( i=1 ; i<=10 ; i++ ))
do
    if [ $i == 5 -o $i == 8 ]
    then
        continue
    fi
    echo $i
    sleep 2
done

echo "--------------------------------------"

for (( j=1; j<=10 ; j++ ))
do
    if (( j > 5 ))
    then
        break
    fi
    echo $j
    sleep 2
done
