#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/VerificadorIdadeJavaFX-j-08.04-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/VerificadorIdadeJavaFX-j-08.04-fixed.jar
