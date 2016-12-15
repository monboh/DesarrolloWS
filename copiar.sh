clear
echo "#------------------------------------------------------"
echo "# Proyecto : Metrocuadrado (m2)"
echo "# Script que prepara los archivos para el despliegue"
echo "# By Edwin Torres - Noviembre 2012"
echo "#------------------------------------------------------"

#Se toma el tiempo inicial
START=$(date +%s)

export JBOSS_HOME=/opt/jboss
export PROJECT=/home/josroj/Desarrollo/Metrocuadrado/workspace/m2-ws

echo $JBOSS_HOME
echo $PROJECT

#Eliminacion de archivos
echo "[ Fase de eliminacion de archivos ]"
rm -rf $JBOSS_HOME/server/metrocuadrado/deploy/axis.war/WEB-INF/lib/m2-ws-1.0.jar
echo  - Eliminación de deploy..................[ok]
rm -rf $JBOSS_HOME/server/metrocuadrado/work/*
echo  - Eliminación de work....................[ok]
rm -rf $JBOSS_HOME/metrocuadrado/log/*
echo  - Eliminación de logs....................[ok]
rm -rf $JBOSS_HOME/metrocuadrado/tmp/*
echo  - Eliminación de temporales..............[ok]
echo " "


#Copia de archivos
echo "[ Fase de copiado de archivos ]"
cp -r $PROJECT/target/m2-ws-1.0.jar $JBOSS_HOME/server/metrocuadrado/deploy/axis.war/WEB-INF/lib/.
cp -r $PROJECT/target/m2-ws-1.0.jar $PROJECT/.
echo  - Copiado de m2-ws-1.0.jar ..............[ok]
echo " "
     

#Creacion de enlaces simbolicos


END=$(date +%s)
DIFF=$(($END - $START))

echo "Tarea terminada en $DIFF ms."
