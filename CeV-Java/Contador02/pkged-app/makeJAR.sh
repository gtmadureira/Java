#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/Contador02-j-11.02-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/Contador02-j-11.02-fixed.jar
