#!/bin/sh
clear
cat stub_config.sh ../target/HelloWorld-0.1.0-runnable.jar > HelloWorld-0.1.0-runnable.jar && java -jar HelloWorld-0.1.0-runnable.jar
