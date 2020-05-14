#! /bin/bash

function compilejavafiles(){
        javac -d ./classes/ -cp ./classes/ $1
}
for file in `find ./ -type f -name "*.java"`
do
        echo $file
        compilejavafiles $file
done

