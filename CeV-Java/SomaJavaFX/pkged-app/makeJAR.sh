#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/SomaJavaFX-j-06.03-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/SomaJavaFX-j-06.03-fixed.jar
