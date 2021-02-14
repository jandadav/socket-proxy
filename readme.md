## Exploration of membrane acting as tls tunnel for plain socket communcation

**Beware:** contains hardcoded ports, local paths, very bad names. Deal with it. 

## First
    ./gradlew build

## TLS
### socket server

    java -Djavax.net.ssl.trustStore=keys/testkeys2 -Djavax.net.debug=all -cp build/libs/server.jar server.ClassFileServer 9090 . TLS

files can be pulled from the server, like so:
    
    https://localhost:9090/data.txt

## socket client

    java -Djavax.net.ssl.trustStore=keys/testkeys2 -cp build/libs/server.jar server.SSLSocketClient

## plain

### socket server

    java -cp build/libs/server.jar server.ClassFileServer 9090 .
    
## socket client
    
    java -cp build/libs/server.jar server.SocketClient
    
## Membrane

TLS forwarding proxy is configured in `membrane-service-proxy-4.7.3/conf/proxies.xml`
It has to be downloaded and extracted in place. This is temp solution before embedding.