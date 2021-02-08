#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/ProgramaMedia-j-09.01-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/ProgramaMedia-j-09.01-fixed.jar
