@echo off
set file=%1
if "%file%"=="" (
    echo No file passed
) else (
    javac %file%.java
    java %file%
)