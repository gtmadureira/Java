#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/ProgramaPernas-j-10.02-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/ProgramaPernas-j-10.02-fixed.jar
