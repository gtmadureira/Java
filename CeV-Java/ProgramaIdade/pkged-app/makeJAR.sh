#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/ProgramaIdade-j-09.02-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/ProgramaIdade-j-09.02-fixed.jar
