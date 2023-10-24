#! /bin/bash

num1=20
num2=50

num3=1000
num4=2000


echo $(( num1 + num2 )) 
echo $(( num2 - num1 ))
echo $(( num1 * num2 ))
echo $(( num2 / num1 )) 
echo $(( num1 % num2 ))

echo "-------------------------------------//-----------------------------"

echo $(expr $num3 + $num4 )
echo $(expr $num4 - $num3 )
echo $(expr $num3 \* $num4 )
echo $(expr $num3 / $num4 )
echo $(expr $num3 % $num4 )