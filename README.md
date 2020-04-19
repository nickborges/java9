## Java9

### Module
    compilar:
        javac -d out/mods/com.module/ src/module-info.java src/com/module/HelloWorldXml.java
        
    executar:
         java --module-path out/mods -m com.module/com.module.HelloWorldXml
    
    gerar .jar:
        jar --create --file out/helloworld.jar --main-class com.module.HelloWorldXml -C out/mods/com.module .