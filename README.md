# DDD-EmpresaEnergiaSolar
Solución al Reto Final [HACIENDO DDD DESDE CERO] del curso Domain Driven Design SofkaU DEV C3 - 2022


## Resumen
En este reto vamos a poner en practica las aspectos fundamentales de DDD aplicando todo el conocimiento que se a trabajado dentro del curso de DDD y las mentorías. Aquí se espera dar solución aplicando a las capas de dominio (aggregate) y business (use case).

Recuerde usar la librería de https://github.com/Sofka-XT/ddd-generic-java y puedes usar el siguiente ejemplo como base:

https://github.com/Sofka-XT/java-ddd-demo-dice


## Use Case/Problem
Con base al conocimiento adquirido sobre DDD poner en evidencia el conocimiento y dominio adquirido de esta temática, para ello realizaremos lo siguiente:

1. Se debe definir un problema cualquiera sobre el cual se planteara un Modelo de Dominio diferente al Pet Project.
2. De manera individual se dará respuesta a la solución planteada expresada en el Modelo de Dominio y la librería de DDD.


Se deben tener en cuenta la siguientes directrices:

1. Se debe tener mínimo 3 agregado como mínimo
2. Se debe tener mínimo 3 entidades como mínimo por cada agregado.
3. Se debe tener mínimo 12 objetos de valor como mínimo
4. Se debe tener mínimo 12 comportamientos con sus respectivos eventos de dominio y/o comandos
5. Se debe tener mínimo 10 casos de uso disparados por comandos
6. Se debe tener mínimo 2 casos de uso disparados por eventos


IMPORTENTE: Se debe tener un cubrimiento de pruebas unitarias para todos los casos de uso planteados, si no se hace pruebas unitarias al caso de uso se considera que no finalizo dicho caso de uso. Además no se puede utilizar el Pet Project como propuesta de modelo de dominio. 

## Evaluation criteria

Criteria | Percentage
|---|---|
Implementa los casos 12 casos de uso según las directrices descritas en el problema del reto | 35.0 %
Implementa el modelo de dominio con los agregados y todos sus comportamientos, comandos, eventos y objetos | 50.0 %
Implementar pruebas unitarias que cubran todos los casos de uso (100% de cubrimiento) | 15.0 %


# Solución

Se plantea una empresa de venta de sistemas solares fotovoltaicos. En esta se tienen los siguientes Subdominios:

<p align="center">
  <img src="/img/Screenshot_1.png"/>
</p>

Se analiza el Core de Proyectos:

<p align="center">
  <img src="/img/Screenshot_2.png"/>
</p>

Se llega al siguiente modelo de dominio:

<p align="center">
  <img src="/img/Reto Final DDD-Modelo de dominio.png"/>
</p>

Eventos de dominio:

* Diseño
<p align="center">
  <img src="/img/EventosDeDominioDiseño.png"/>
</p>

* Cotizacion
<p align="center">
  <img src="/img/EventosDeDominioCotizacion.png"/>
</p>

* Compra
<p align="center">
  <img src="/img/EventosDeDominioCompra.png"/>
</p>

