# CRUD DE VENTA

Proyecto que contiene el Alta, baja y modificaciones de Categoria y Clientes con JDBC


### Instalacion 🔩
Ejecutar scripts en el siguiente orden para formar las tablas en la base de datos.

```
script03.sql
```

```
script01.sql
```

```
script02.sql
```
```
script04.sql
```

### Configuracion ⌨️

Configurar los atributos de Conexion de la Clase "conexion" y ademas agregar el jar de postgres a la libreria para poder trabajar con la base de datos.

### Pre-requisitos 📋

_Para que funcione este abm se necesita de postgreSQL Y PGADMIN4._ 

_Lenguaje: JAVA_

### Estructura y funcionalidad 🚀

_Este CRUD tiene una estructura formada por tres modulos:_

_-Principal.java:_ 


_En este modulo la unica funcion que tiene es de elegir uno de los otros 4 modulos (Abmcliente.java, AbmCategoria.java, AbmProducto2.java y AbmFactura.java)._ 

_-Abmcliente.java:_ 


_En este modulo la funcion que este mismo tiene es agregar,borrar o editar un cliente a la base de datos con los siguientes atributos:_ 

_*Nombre_ 

_*Apellido_

_*Documento_ 

_*Tipo de Cliente (el cual solo agrega un id en forma de clave foranea a la tabla tipocliente)._ 

_-AbmCategoria.java:_ 

_En este modulo sirve para agregar, editar, o borrar categorias de productos a la base de datos con los siguientes atributos:_  

_*Descripcion_ 

_*Denominacion_

_-AbmProducto2.java:_ 

_En este modulo sirve para agregar, editar, o borrar  productos a la base de datos con los siguientes atributos:_  

_*Nombre_ 

_*Descripcion_

_*precio_

_*fecha_alta_

_*Categoria_id_


_-AbmFactura.java:_ 

_En este modulo sirve para agregar, editar, o borrar facturas a la base de datos con los siguientes atributos:_  

_*fecha_ 

_*cliente_

_*forma_pago_

_*observacion_

_*total_

_ Este modulo tambien crea Lineafactura que es una tabla en la base de datos que contiene los siguientes atributos:

_*idproducto_ 

_*cantidad_

_*idfactura_

_*subtotal_



## Autores ✒️
_Arguello Leonel Alejandro_ 



