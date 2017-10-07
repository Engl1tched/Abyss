@echo off

echo Building project...
rd /s /q out
mkdir out
mkdir out\natives
cd Code\abyss

call mvn clean package
copy target\abyss*.jar ..\..\out\.
copy target\natives\* ..\..\out\natives\.
echo Copied
cd ..\..\
cd out
rename abyss*.jar abyss.jar
cd ..
echo Done