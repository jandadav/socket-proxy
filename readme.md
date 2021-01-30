## Run Server

    ./gradlew build
    java -cp build/libs/server.jar server.ClassFileServer 9090 . TLS

files can be pulled from the server, like so:
    
    https://localhost:9090/readme.md