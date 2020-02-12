## Java9

### Module
    `na raiz do projeto: 
        mkdir -p mods/com.module`
        
    `compilar:
        javac -d mods/com.module/ src/module-info.java src/com/module/HelloWorldXml.java`
        
    `executar:
         java --module-path mods -m com.module/com.module.HelloWorldXml`