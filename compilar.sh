#!/bin/bash
clear

echo "#------------------------------------------------------"
echo "# Proyecto : Metrocuadrado (m2-ws)"
echo "# Script que realiza la compilacion del proyecto"
echo "#------------------------------------------------------"

#Se toma el tiempo inicial
START=$(date +%s)

# Variables de entorno necesarias
export JBOSS_HOME=/opt/jboss

#mvn clean install process-resources package
mvn clean install

END=$(date +%s)
DIFF=$(($END - $START))

echo "Tarea terminada en $DIFF ms."

