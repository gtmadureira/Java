#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/OperadoresJavaFX-j-07.02-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/OperadoresJavaFX-j-07.02-fixed.jar
