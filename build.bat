@echo off

echo Building project...
rm -r out
mkdir out
mkdir out\natives
cd Code\abyss

call mvn clean package
copy target\abyss*.jar ..\..\out\.
copy target\natives\* ..\..\out\natives\.
echo Copied
cd ..\..\