#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/VotacaoJavaFX-j-10.01-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/VotacaoJavaFX-j-10.01-fixed.jar
