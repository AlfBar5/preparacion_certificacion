package pruebas;


// no hace falta poner el permits, están en el mismo fichero .java
public sealed class I1 {}
final class Other extends I1{}
non-sealed class M2 extends I1{}

