#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/OperadoresLogicos-j-08.03-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/OperadoresLogicos-j-08.03-fixed.jar
