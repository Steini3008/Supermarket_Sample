:: (0) Cleaning directories
rm --recursive target
rm --recursive mods
mkdir target
mkdir mods

:: (1) Compiling of all required modules, including "supermarket.client", "supermarket.storage" and "supermarket.product"
javac --module-source-path "./*/src" --module supermarket.client -d target

:: (2) Creating their JARs
jar --create --file mods/supermarket.product.jar -C target/supermarket.product .
jar --create --file mods/supermarket.storage.jar -C target/supermarket.storage .
jar --create --file mods/supermarket.client.jar --main-class supermarket.client.GreenClient -C target/supermarket.client .

:: (3) Compiling of plugin modules, which are providing implementations for the factories from "supermarket.product"
javac --module-path mods --module-source-path "./cocacola/*/src" --module cocacola -d target
javac --module-source-path "./*/src" --module mars -d target

:: (4) Creating their JARs
jar --create --file mods/cocacola.jar -C target/cocacola .
jar --create --file mods/cocacola.discount.jar -C target/cocacola.discount .
jar --create --file mods/mars.jar -C target/mars .

:: (5) Additionally there is a Plain JAR by "mondelez", which is providing implementations as well
javac --class-path .;.\mods\supermarket.product.jar -d target/mondelez mondelez\src\mondelez\chocolate\*.java
jar --create --file mods/mondelez.jar -C target/mondelez . -C mondelez/resources .

:: (6) Launching module supermarket.client with specified entry point (=main-class)
java --module-path mods --module supermarket.client