@echo off
if exist out rmdir /s /q out
mkdir out
javac -encoding UTF-8 -d out src\product\*.java src\brasil\*.java src\eua\*.java src\alemanha\*.java src\client\*.java
if errorlevel 1 exit /b 1
java -cp out client.Main
