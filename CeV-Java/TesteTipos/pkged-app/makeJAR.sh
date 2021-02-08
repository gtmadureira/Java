#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/TesteTipos-j-06.02-fixed.jar ../../pkged-app/MANIFEST.MF .
chmod +x ../../pkged-app/dist/TesteTipos-j-06.02-fixed.jar
cd -
./dist/TesteTipos-j-06.02-fixed.jar
