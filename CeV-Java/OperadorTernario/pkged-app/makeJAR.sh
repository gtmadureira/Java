#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/OperadorTernario-j-08.01-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/OperadorTernario-j-08.01-fixed.jar
