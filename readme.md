## First
    ./gradlew build

## TLS
### socket server

    java -cp build/libs/server.jar server.ClassFileServer 9090 . TLS

files can be pulled from the server, like so:
    
    https://localhost:9090/data.txt

## socket client
    java -Djavax.net.ssl.trustStore=keys/testkeys -cp build/libs/server.jar server.SSLSocketClient

## plain

### socket server

    java -cp build/libs/server.jar server.ClassFileServer 9090 .
    
## socket client
    
    java -cp build/libs/server.jar server.SocketClient