#!/bin/bash
clear
cd ../target/classes/
jar cfm ../../pkged-app/dist/TiposPrimitivos-j-06.01-fixed.jar ../../pkged-app/MANIFEST.MF .
chmod +x ../../pkged-app/dist/TiposPrimitivos-j-06.01-fixed.jar
cd -
./dist/TiposPrimitivos-j-06.01-fixed.jar
