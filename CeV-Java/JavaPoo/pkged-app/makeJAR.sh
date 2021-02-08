#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/JavaPoo-j-08.05-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/JavaPoo-j-08.05-fixed.jar
