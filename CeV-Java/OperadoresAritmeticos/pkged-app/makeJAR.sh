#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/OperadoresAritmeticos-j-07.01-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/OperadoresAritmeticos-j-07.01-fixed.jar
