## Run TLS Server with socket

    ./gradlew build
    java -cp build/libs/server.jar server.ClassFileServer 9090 . TLS

files can be pulled from the server, like so:
    
    https://localhost:9090/data.txt

## Run HTTPS proxy


## Https socket client
    java -Djavax.net.ssl.trustStore=keys/testkeys -cp build/libs/server.jar server.SSLSocketClient 