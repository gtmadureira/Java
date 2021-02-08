#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/ComparacaoString-j-08.02-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/ComparacaoString-j-08.02-fixed.jar
