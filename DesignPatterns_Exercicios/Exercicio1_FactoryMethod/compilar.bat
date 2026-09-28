@echo off
if exist out rmdir /s /q out
mkdir out
javac -encoding UTF-8 -d out src\model\*.java src\creator\*.java src\client\*.java
if errorlevel 1 exit /b 1
java -cp out client.Main
