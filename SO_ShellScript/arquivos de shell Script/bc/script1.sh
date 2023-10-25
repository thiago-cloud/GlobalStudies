#! /bin/bash


#BC serve para calcular com precisão valores flutuantes

num1=9
num2=10

echo "10.5+10" | bc
echo "$num1 + $num2" | bc
echo "scale=2; 20.22 * 20" | bc
echo "scale=5; 500 - 100" | bc
echo "scale=1; sqrt($num1)" | bc
echo "scale=0; $num2^2" | bc