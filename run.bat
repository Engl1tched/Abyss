@echo off

echo Running project...
cd out
java -Djava.library.path=natives/ -jar abyss.jar
cd ..
echo Done