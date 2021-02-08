#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/JavaFXHelloWorld-0.1.0-fixed.jar ../../pkged-app/MANIFEST.MF .
cd -
java -jar dist/JavaFXHelloWorld-0.1.0-fixed.jar
