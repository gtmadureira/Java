#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/Contador01-j-11.01-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/Contador01-j-11.01-fixed.jar
